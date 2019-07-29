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

	// 11.======�����ڸ� ǥ�� �ϱ� ���� ���� ����======
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
		btnsend.setFont(new Font("HY�߰��", Font.BOLD, 14));
		btnsend.setBounds(402, 395, 109, 35);
		contentPane.add(btnsend);

		JLabel lblNewLabel = new JLabel("\uC811\uC18D\uC790:");
		lblNewLabel.setFont(new Font("HY�߰��", Font.BOLD, 14));
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
		// 12.======nickname�� ����� Vector�� JList�� ��µǵ��� ����======
		lstconnect.setListData(nicknameList);
		// ====================================================== + JList������
		// String���׸� �߰�.
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
			sendMsg(nickname); // ����
			// 13.======nickname�� ���� ������ ���� ������ �����ϱ�======
			nicknameList.add(nickname); // ���� �г���
			// ==============================================
			// 8.======�����κ��� �����͸� �޴� �κ��� ������� ó��======
			Thread listenThread = new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						String msg = "";
						try {
							msg = in.readLine();
							System.out.println("������ ������ �޽���>>" + msg);
							// 10.======������ ������ �޽����� �м��ؼ� ó���ϴ� �޼ҵ�ȣ��======
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
		System.out.println("Ŭ���̾�Ʈ�� �������� ������ �޽���: " + msg);
		out.println(msg);
	}

	// 9.======������ �������� �����͸� �м��ؼ� ó���ϴ� �޼ҵ带 ����======
	private void filteringMsg(String msg) {
		StringTokenizer token = new StringTokenizer(msg, "/");
		String protocol = token.nextToken();
		String message = token.nextToken();
		System.out.println("��������: " + protocol + ", �޽���: " + message);
		// ���������� new�̸� Ŭ���̾�Ʈâ�� *******nickname���� �����ϼ̽��ϴ�.*******
		// ��� �޽����� ����ϰ� Ŭ���̾�Ʈ�� JList�� �߰�
		// JList�� �߰��� nickname����Ʈ�� Vector<String>���� �����ϰ�
		// JList�� �߰��� ���� setListData(����)
		if (protocol.equals("new")) {
			// ���ο� ����ڰ� ����
			nicknameList.add(message);
			lstconnect.setListData(nicknameList);
			taChat.append("********" + message + "���� �����ϼ̽��ϴ�.********\n");
		} else if (protocol.equals("old")) {
			nicknameList.add(message);
			lstconnect.setListData(nicknameList);
		}
	}
	// =======================================================
}
