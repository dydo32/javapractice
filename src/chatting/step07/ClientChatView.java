package chatting.step07;

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

	// 11.======접속자를 표시 하기 위해 변수 선언======
	Vector<String> nicknameList = new Vector<String>();
	// =====================================

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
		// 12.======nickname에 저장된 Vector가 JList에 출력되도록 설정======
		lstconnect.setListData(nicknameList);
		// ====================================================== + JList변수에
		// String제네릭 추가.
		setVisible(true);
		connectServer();
		StartEvent();
	}

	public void StartEvent() {
		ClientChatListener listener = new ClientChatListener(this);
		txtinput.addActionListener(listener);
		btnsend.addActionListener(listener);
	}

	public void connectServer() {
		try {
			socket = new Socket(ip, port);

			if (socket != null) {
				ioWork();
			}
			sendMsg(nickname); // 입장
			// 13.======nickname에 현재 접속한 나의 정보를 저장하기======
			nicknameList.add(nickname); // 나의 닉네임
			// ==============================================
			// 8.======서버로부터 데이터를 받는 부분을 쓰레드로 처리======
			Thread listenThread = new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						String msg = "";
						try {
							msg = in.readLine();
							System.out.println("서버가 보내온 메시지>>" + msg);
							// 10.======서버가 보내온 메시지를 분석해서 처리하는 메소드호출======
							filteringMsg(msg);
							// =================================================
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			});
			listenThread.start();
			// ============================================

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

	// 9.======서버가 보내오는 데이터를 분석해서 처리하는 메소드를 정의======
	private void filteringMsg(String msg) {
		StringTokenizer token = new StringTokenizer(msg, "/");
		String protocol = token.nextToken();
		String message = token.nextToken();
		System.out.println("프로토콜: " + protocol + ", 메시지: " + message);
		// 프로토콜이 new이면 클라이언트창에 *******nickname님이 입장하셨습니다.*******
		// 라는 메시지를 출력하고 클라이언트의 JList에 추가
		// JList에 추가할 nickname리스트는 Vector<String>으로 정의하고
		// JList에 추가할 때는 setListData(벡터)
		if (protocol.equals("new")) {
			// 새로운 사용자가 접속
			nicknameList.add(message);
			lstconnect.setListData(nicknameList);
			taChat.append("********" + message + "님이 입장하셨습니다.********\n");
		} else if (protocol.equals("old")) {
			nicknameList.add(message);
			lstconnect.setListData(nicknameList);
		}
	}
	// =======================================================
}
