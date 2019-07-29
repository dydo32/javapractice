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

//������ start�� �� �ֵ��� ����� �ۼ�
public class ChatServerView extends JFrame {

	JPanel contentPane;
	JTextArea taclientlist;
	JButton btnchangeport;
	JButton btnstartServer;
	JButton btnstop;

	ServerSocket server;
	Socket client;

	// 6. ======Ŭ���̾�Ʈ�� ����ϱ� ���� ����� ��Ʈ���� �����ϱ� ���� ���� ����======
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
		label.setFont(new Font("HY�߰��", Font.BOLD, 14));
		label.setBounds(12, 10, 120, 35);
		contentPane.add(label);

		btnchangeport = new JButton("\uD3EC\uD2B8\uBCC0\uACBD");
		btnchangeport.setFont(new Font("HY�߰��", Font.BOLD, 14));
		btnchangeport.setBounds(516, 50, 129, 35);
		contentPane.add(btnchangeport);

		btnstartServer = new JButton("\uC11C\uBC84\uC2DC\uC791");
		btnstartServer.setFont(new Font("HY�߰��", Font.BOLD, 14));
		btnstartServer.setBounds(516, 95, 129, 35);
		contentPane.add(btnstartServer);

		btnstop = new JButton("\uC11C\uBC84\uC911\uC9C0");
		btnstop.setFont(new Font("HY�߰��", Font.BOLD, 14));
		btnstop.setBounds(516, 140, 129, 35);
		contentPane.add(btnstop);
		btnstartServer.addActionListener(new ChatServerListener(this));
		btnstop.addActionListener(new ChatServerListener(this));

	}

	public void startServer(int port) {
		try {
			server = new ServerSocket(port);
			taclientlist.append("����start...����� ���� ����� \n");
			if (server != null) {
				// Ŭ���̾�Ʈ ������ ��ٸ��� �۾��� ����
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
					taclientlist.append(ip + "����� ����!!\n");

					// 9.======(io�۾��޼ҵ�)��Ʈ�� �����޼ҵ� ȣ��======
					if (client != null) {
						ioWork();
					}
					// ========================================
					// 10.======Ŭ���̾�Ʈ�� ������ nickname�� �о JTextArea�� ���======
					String nickname = in.readLine();
					System.out.println("Ŭ���̾�Ʈ�� ������ nickname�ޱ�:" + nickname);
					taclientlist.append("******"+nickname+"���� �����ϼ̽��ϴ�.******\n");
					// =========================================================
					// 11. ======������ Ŭ���̾�Ʈ���� ȯ���޽����� ����======
					sendMsg("������ ȯ���մϴ�.");
					// ==========================================

				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});
		acceptThread.start();
	}

	// 7.======Ŭ���̾�Ʈ�� ����� �� �ֵ��� �������κ��� ��Ʈ���� ������ �޼ҵ� ����======
	public void ioWork() {
		try {
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream(), true);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ===========================================================
	// 8. ======Ŭ���̾�Ʈ���� �޽����� ������ ���� �޼ҵ� ����======
	public void sendMsg(String msg) {
		System.out.println("������ Ŭ���̾�Ʈ���� ������ �޽���: " + msg);
		out.println(msg); // Ŭ���̾�Ʈ���� �޽��� ������
	}
	// ===============================================
}
