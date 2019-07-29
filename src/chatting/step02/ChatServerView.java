package chatting.step02;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

//서버가 start될 수 있도록 기능을 작성
public class ChatServerView extends JFrame {

	 JPanel contentPane;
	 JTextArea taclientlist;
	 JButton btnchangeport;
	 JButton btnstartServer;
	 JButton btnstop;
	 //1. ======네트워크 작업을 위해서 변수 선언을 해야 한다.======
	 ServerSocket server;
	 Socket client;
	 //=============================================
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatServerView frame = new ChatServerView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChatServerView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		taclientlist = new JTextArea();
		taclientlist.setBounds(12, 50, 472, 415);
		contentPane.add(taclientlist);
		
		JLabel label = new JLabel("\uC811\uC18D\uC790:");
		label.setFont(new Font("HY견고딕", Font.BOLD, 14));
		label.setBounds(12, 10, 120, 35);
		contentPane.add(label);
		
		btnchangeport = new JButton("\uD3EC\uD2B8\uBCC0\uACBD");
		btnchangeport.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnchangeport.setBounds(516, 50, 129, 35);
		contentPane.add(btnchangeport);
		
		btnstartServer = new JButton("\uC11C\uBC84\uC2DC\uC791");
		btnstartServer.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnstartServer.setBounds(516, 95, 129, 35);
		contentPane.add(btnstartServer);
		
		btnstop = new JButton("\uC11C\uBC84\uC911\uC9C0");
		btnstop.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnstop.setBounds(516, 140, 129, 35);
		contentPane.add(btnstop);
		btnstartServer.addActionListener(new ChatServerListener(this));
		btnstop.addActionListener(new ChatServerListener(this));
	}
	//2. =======서버를 start(전달받은 포트에 대해서 소켓을 열고 기다리는 작업을 수행하는 메소드)======
	public void startServer(int port){
		try {
			server = new ServerSocket(port);
			taclientlist.append("서버start...사용자 접속 대기중 \n");
			if(server != null){
				//클라이언트 접속을 기다리는 작업을 수행
				connection();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//=========================================================================
	//3. ======사용자 접속 대기(accept)기능을 수행하는 메소드======
	public void connection(){
		try {
			client = server.accept();
			taclientlist.append("사용자 접속!!\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//================================================= -> 클라이언트 접속을 대기하는 별도의 쓰레드를 만들어주어야함.
	

}






