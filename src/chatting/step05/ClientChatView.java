package chatting.step05;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
//서버가 보내오는 환영인사를 출력
public class ClientChatView extends JFrame {

	JPanel contentPane;
	JTextField txtinput;
	JTextArea taChat;
	JButton btnsend;
	JList lstconnect;

	Socket socket;
	String ip;
	int port;
	String nickname;
	
	// 1. ======서버와 통신하기 위한 입출력 스트림을 생성하기 위한 변수 선언======
	BufferedReader in;
	PrintWriter out;
	// =======================================================
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
		setVisible(true); 
		 connectServer();

	}
	public void connectServer(){
		try {
			socket = new Socket(ip,port);
			// 3.======스트림 생성메소드 호출======
			if(socket!=null){
				ioWork();
			}
			// =============================
			// 5.======서버에게 nickname전송하기======
			sendMsg(nickname);
			// ==================================
			// 12.======서버가 보내오는 환영메시지 받아서 JTextArea에 출력하기======
			String msg = in.readLine();
			taChat.append(msg+"\n");
			// ======================================================
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 2.======서버와 통신할 수 있도록 소켓으로부터 스트림을 얻어오는 메소드 정의======
	public void ioWork(){
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),true);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// ===========================================================
	// 4. ======서버에게 메시지를 보내기 위한 메소드 정의======
	public void sendMsg(String msg){
		System.out.println("클라이언트가 서버에게 보내는 메시지: " + msg);
		out.println(msg); //서버에게 메시지 보내기
	}
	// ===========================================
}
