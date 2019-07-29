
package chatting.step10;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.ButtonGroup;
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
import javax.swing.JRadioButton;

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
	public JRadioButton rdoSecretOk;
	public JRadioButton rdoSecretCancel;
	public JButton btnChat;

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
		
		ButtonGroup group = new ButtonGroup();
		
		rdoSecretOk = new JRadioButton("\uADD3\uC18D\uB9D0\uC124\uC815");
		rdoSecretOk.setFont(new Font("굴림", Font.PLAIN, 14));
		rdoSecretOk.setBounds(565, 155, 121, 23);
		contentPane.add(rdoSecretOk);
		
		rdoSecretCancel = new JRadioButton("\uADD3\uC18D\uB9D0\uD574\uC81C");
		rdoSecretCancel.setSelected(true);
		rdoSecretCancel.setFont(new Font("굴림", Font.PLAIN, 14));
		rdoSecretCancel.setBounds(565, 184, 121, 23);
		contentPane.add(rdoSecretCancel);
		
		group.add(rdoSecretOk);
		group.add(rdoSecretCancel);
		
		btnChat = new JButton("\uCC44\uD305\uBC29");
		btnChat.setBounds(557, 213, 109, 44);
		contentPane.add(btnChat);
		
		setVisible(true);
		connectServer();
		StartEvent();
	}

	public void StartEvent() {
		ClientChatListener listener = new ClientChatListener(this);
		txtinput.addActionListener(listener);
		btnsend.addActionListener(listener);
		lstconnect.addListSelectionListener(listener);
		rdoSecretOk.addItemListener(listener);
		rdoSecretCancel.addItemListener(listener);
		btnChat.addActionListener(listener);
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
							try {
								if(in!=null) in.close();
								if(out!=null) out.close();
								if(socket!=null) socket.close();
								JOptionPane.showMessageDialog(null, "서버와 접속이 끊어짐", "알림",JOptionPane.ERROR_MESSAGE);
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							break;
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
		// 6.======클라이언트에서 서버가 보내주는 대화내용을 JTextArea에 출력하기======
		} else if (protocol.equals("chatting")){
			String nickname = token.nextToken();
			taChat.append(nickname+">> "+message+"\n");
		} else if (protocol.equals("secretChatting")){
			String nickname = token.nextToken();
			taChat.append(nickname+"의 비밀 메시지>> "+message+"\n");
			
		}
		// ===========================================================
	}
}
