package chatting.step06;

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
import javax.swing.JScrollPane;

public class ChatServerView extends JFrame {

	JPanel contentPane;
	JTextArea taclientlist;
	JButton btnchangeport;
	JButton btnstartServer;
	JButton btnstop;

	ServerSocket server;
	Socket client;

	BufferedReader in;
	PrintWriter out;

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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 50, 481, 403);
		contentPane.add(scrollPane);
		
				taclientlist = new JTextArea();
				scrollPane.setViewportView(taclientlist);
		btnstartServer.addActionListener(new ChatServerListener(this));
		btnstop.addActionListener(new ChatServerListener(this));

	}

	public void startServer(int port) {
		try {
			server = new ServerSocket(port);
			taclientlist.append("서버start...사용자 접속 대기중 \n");
			if (server != null) {
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
				// 1. ======여러 클라이언트가 접속할 수 있도록 while문으로 처리======
				while (true) {
					try {
						client = server.accept();
						String ip = client.getInetAddress().getHostAddress();
						taclientlist.append(ip + "사용자 접속!!\n");

						// 3. ======사용자가 접속하면 accept해서 User객체를 생성한다.======
						//	    	User객체는 쓰레드이므로 start시키는 것 까지 처리
						User user = new User(client, ChatServerView.this);	//계속해서 new User(새로운 객체생성)
						user.start();

					} catch (IOException e) {
						e.printStackTrace();
					}

				}// end while
				// ==========================================================
			}
		});
		acceptThread.start();
	}
}
