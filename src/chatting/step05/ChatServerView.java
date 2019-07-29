package chatting.step05;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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

	ServerSocket server;
	Socket client;

	// 6. ======클라이언트와 통신하기 위한 입출력 스트림을 생성하기 위한 변수 선언======
	BufferedReader in;
	PrintWriter out;

	// =======================================================
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

	public void startServer(int port) {
		try {
			server = new ServerSocket(port);
			taclientlist.append("서버start...사용자 접속 대기중 \n");
			if (server != null) {
				// 클라이언트 접속을 기다리는 작업을 수행
				connection();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void connection() {
		Thread acceptThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					client = server.accept();
					String ip = client.getInetAddress().getHostAddress();
					taclientlist.append(ip + "사용자 접속!!\n");

					// 9.======(io작업메소드)스트림 생성메소드 호출======
					if (client != null) {
						ioWork();
					}
					// ========================================
					// 10.======클라이언트가 전송한 nickname을 읽어서 JTextArea에 출력======
					String nickname = in.readLine();
					System.out.println("클라이언트가 전송한 nickname받기:" + nickname);
					taclientlist.append("******"+nickname+"님이 입장하셨습니다.******\n");
					// =========================================================
					// 11. ======서버가 클라이언트에게 환영메시지를 보냄======
					sendMsg("접속을 환영합니다.");
					// ==========================================

				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});
		acceptThread.start();
	}

	// 7.======클라이언트와 통신할 수 있도록 소켓으로부터 스트림을 얻어오는 메소드 정의======
	public void ioWork() {
		try {
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream(), true);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ===========================================================
	// 8. ======클라이언트에게 메시지를 보내기 위한 메소드 정의======
	public void sendMsg(String msg) {
		System.out.println("서버가 클라이언트에게 보내는 메시지: " + msg);
		out.println(msg); // 클라이언트에게 메시지 보내기
	}
	// ===============================================
}
