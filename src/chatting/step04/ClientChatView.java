package chatting.step04;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

//ClientChatView가 실행되면 서버에 접속하도록 설정
public class ClientChatView extends JFrame {

	JPanel contentPane;
	JTextField txtinput;
	JTextArea taChat;
	JButton btnsend;
	JList lstconnect;
	// 1. ======네크워크 처리를 위해 필요한 변수 선언======
	Socket socket;
	String ip;
	int port;
	String nickname;
	// =======================================
	// 2. ======ChatLogin으로 부터 변수를 전달 받기 위해 생성자를 변경======
	/**
	 * Create the frame.
	 */
	public ClientChatView(String ip, int port, String nickname) {
		this.ip = ip;
		this.port = port;
		this.nickname = nickname;
	// ======================================================
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		taChat = new JTextArea();
		taChat.setBounds(12, 10, 501, 375);
		contentPane.add(taChat);

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

		lstconnect = new JList();
		lstconnect.setBounds(525, 47, 205, 108);
		contentPane.add(lstconnect);
		// 4. ======창이 전환되면 서버에 접속할 수 있도록 정의======
		setVisible(true); //화면에 JFrame이 보여지도록 하기 위해 필요
		 connectServer();
		// ===========================================
	}
	// 3. ======클라이언트가 서버에 접속하기 위한 메소드를 정의======
	public void connectServer(){
		try {
			socket = new Socket(ip,port);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// ================================================
}
