package chatting.step06;

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
import javax.swing.JScrollPane;

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
	
	BufferedReader in;
	PrintWriter out;
	private JScrollPane scrollPane;

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

		lstconnect = new JList();
		lstconnect.setBounds(525, 47, 205, 108);
		contentPane.add(lstconnect);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 495, 375);
		contentPane.add(scrollPane);
		
				taChat = new JTextArea();
				scrollPane.setViewportView(taChat);
		setVisible(true); 
		connectServer();
		StartEvent();
	}
	// 5. ======이벤트 연결하기======
	public void StartEvent() {
		ClientChatListener listener = new ClientChatListener(this);
		txtinput.addActionListener(listener);
		btnsend.addActionListener(listener);
	}
	// ==========================
	public void connectServer(){
		try {
			socket = new Socket(ip,port);
		
			if(socket!=null){
				ioWork();
			}
			sendMsg(nickname);	
			/*String msg = in.readLine();
			taChat.append(msg+"\n");*/
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void ioWork(){
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),true);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sendMsg(String msg){
		System.out.println("클라이언트가 서버에게 보내는 메시지: " + msg);
		out.println(msg); 
	}
	
}
