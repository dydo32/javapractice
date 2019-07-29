package chatting.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

//User�� ������ ������ Ŭ���̾�Ʈ�� �𵨸��� Ŭ����
//User��ü�� �����Ǿ��ٴ� ���� ���ο� Ŭ���̾�Ʈ�� �����ߴٴ� ���� �ǹ�
//���ο� Ŭ���̾�Ʈ�� �����ϸ� ���� ����� ����Ʈ�� �Ѱܹ޴´�.
public class User extends Thread {
	Socket client;
	BufferedReader in;
	PrintWriter out;
	ChatServerView serverView;
	String nickname;
	// 2.======���� ������� ������ �����ϰ� �ִ� Vector�� ������ ���� �޾ƿ��� ���� ������ ����======
	Vector<User> userlist = new Vector<User>();

	// ======================================================================
	public User() {
	}

	// 3.======��������� Vector�� �Ѱܹ��� �� �ֵ��� �����ڸ� ����======
	public User(Socket client, ChatServerView serverView, Vector<User> userlist) {
		super();
		this.client = client;
		this.serverView = serverView;
		this.userlist = userlist;
		System.out.println("���������=>" + userlist.size());
		ioWork();
	}
	// ===================================================

	public void ioWork() {
		try {
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream(), true);

			nickname = in.readLine();
			System.out.println("Ŭ���̾�Ʈ�� ������ nickname�ޱ�:" + nickname);

			serverView.taclientlist.append("******" + nickname + "���� �����ϼ̽��ϴ�.******\n");
			// 5.======���ο� Ŭ���̾�Ʈ�� �����ϸ� �����Vector�� ����Ǿ��ִ� 
			// 			��� Ŭ���̾�Ʈ�鿡�� ������ �˸��� �޽�����������.=======
			int size = userlist.size(); // ���� ������ ��
			for (int i = 0; i < size; i++) {
				User user = userlist.get(i);	//���� ������ ���������
				//�̹� ������ �ִ� Ŭ���̾�Ʈ�鿡�� ���� ������ ������� nickname�� ������
				user.sendMsg("new/"+nickname);
			}
			// ===================================================
			// 14.======���� ������ Ŭ���̾�Ʈ(this)���� ���� ����������� �˷��ֱ�======
			for (int i = 0; i < size; i++) {
				User user = userlist.get(i);	//���� ������ ���������
				//�̹� ������ �ִ� Ŭ���̾�Ʈ�鿡�� ���� ������ ������� nickname�� ������
				sendMsg("old/"+user.nickname);
			}
			// =========================================================
			// 7.======���� �����ڵ鿡�� ���� ������ �ȳ��� �Ŀ� ���Ϳ� �߰��ϱ�======
			userlist.add(this);
			// ====================================================
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		while (true) {
			try {
				String msg = in.readLine();
				serverView.taclientlist.append(nickname + "�� ���� ���۵� �޽���>>" + msg + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 6.======Ŭ���̾�Ʈ���� �޽����� �������� �޼ҵ带 ����======
	private void sendMsg(String msg){
		out.println(msg);
	}
	// =============================================

}
