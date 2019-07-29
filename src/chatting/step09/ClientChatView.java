
package chatting.step09;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ClientChatView extends JFrame {

	JPanel contentPane;
	JTextField txtinput;
	JTextArea taChat;
	JButton btnsend;
	JList<String> lstconnect;
	Socket socket;
	String ip;
	int port;
	String nickname;
	BufferedReader in;
	PrintWriter out;
	private JScrollPane scrollPane;
	Vector<String> nicknameList = new Vector<String>();

	/**
	 * Create the frame.
	 */
	public ClientChatView(String ip, int port, String nickname) {
		this.ip = ip;
		this.port = port;
		this.nickname = nickname;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtinput = new JTextField();
		txtinput.setBounds(12, 395, 378, 35);
		contentPane.add(txtinput);
		txtinput.setColumns(10);

		btnsend = new JButton("\uC11C\uBC84\uB85C\uC804\uC1A1");
		btnsend.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnsend.setBounds(402, 395, 109, 35);
		contentPane.add(btnsend);

		JLabel lblNewLabel = new JLabel("\uC811\uC18D\uC790:");
		lblNewLabel.setFont(new Font("HY견고딕", Font.BOLD, 14));
		lblNewLabel.setBounds(519, 10, 120, 35);
		contentPane.add(lblNewLabel);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 495, 375);
		contentPane.add(scrollPane);

		taChat = new JTextArea();
		scrollPane.setViewportView(taChat);

		lstconnect = new JList<String>();
		lstconnect.setBounds(529, 43, 199, 103);
		contentPane.add(lstconnect);
		lstconnect.setListData(nicknameList);
		setVisible(true);
		connectServer();
		StartEvent();
	}

	public void StartEvent() {
		ClientChatListener listener = new ClientChatListener(this);
		txtinput.addActionListener(listener);
		btnsend.addActionListener(listener);
		lstconnect.addListSelectionListener(listener);
	}

	public void connectServer() {
		try {
			socket = new Socket(ip, port);

			if (socket != null) {
				ioWork();
			}
			sendMsg(nickname); 
			nicknameList.add(nickname); 
			Thread listenThread = new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						String msg = "";
						try {
							msg = in.readLine();
							System.out.println("서버가 보내온 메시지>>" + msg);
							filteringMsg(msg);
						} catch (IOException e) {
							// 1.======서버쪽에서 연결이 끊어지는 경우 먼저 사용한 자원을 반납한다.======
							//System.out.println("서버야 가지마~_~");
							try {
								if(in!=null) in.close();
								if(out!=null) out.close();
								if(socket!=null) socket.close();
								JOptionPane.showMessageDialog(null, "서버와 접속이 끊어짐", "알림",JOptionPane.ERROR_MESSAGE);
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							break;
							// ===================================
						}
					}
				}
			});
			listenThread.start();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void ioWork() {
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendMsg(String msg) {
		System.out.println("클라이언트가 서버에게 보내는 메시지: " + msg);
		out.println(msg);
	}

	private void filteringMsg(String msg) {
		StringTokenizer token = new StringTokenizer(msg, "/");
		System.out.println(token.countTokens());
		String protocol = token.nextToken();
		String message = token.nextToken();
		System.out.println("프로토콜: " + protocol + ", 메시지: " + message);
		
		if (protocol.equals("new")) {
			nicknameList.add(message);
			lstconnect.setListData(nicknameList);
			taChat.append("********" + message + "님이 입장하셨습니다.********\n");
		} else if (protocol.equals("old")) {
			nicknameList.add(message);
			lstconnect.setListData(nicknameList);
		} else if (protocol.equals("chatting")){
			String nickname = token.nextToken();
			taChat.append(nickname+">> "+message+"\n");
		} else if (protocol.equals("out")){
			nicknameList.remove(message);
			lstconnect.setListData(nicknameList);
			taChat.append("********" + message + "님이 퇴장하셨습니다.********\n");
		}
	}
}
