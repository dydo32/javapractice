package chatting.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// 2. ======�������忡�� �۾� : ������ �����ϴ� Ŭ���̾�Ʈ�� ���� �� Ŭ���̾�Ʈ���� ó�� �۾��� ������ Ŭ����======

public class User extends Thread{
	Socket client;
	BufferedReader in;
	PrintWriter out;
	ChatServerView serverView;
	String nickname;
	//Ŭ���̾�Ʈ�� �����ϸ� Ŭ���̾�Ʈ�� ���ϰ� ������������ �̿��ؼ� User��ü�� ����
	//User�� �����Ǹ鼭 �������κ��� Ŭ���̾�Ʈ�� ����� �� �ִ� ��Ʈ���� �����ϰ� nickname�� �޾ƿ´�.
	
	public User() {}
	public User(Socket client, ChatServerView serverView) {
		super();
		this.client = client;
		this.serverView = serverView;
		ioWork();
	}
	public void ioWork() {
		try {
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream(), true);
			
			nickname = in.readLine();
			System.out.println("Ŭ���̾�Ʈ�� ������ nickname�ޱ�:" + nickname);
			
			serverView.taclientlist.append("******" + nickname + "���� �����ϼ̽��ϴ�.******\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 4. ======�����忡�� ������ ������ run�ȿ� ����======
	public void run(){
		// Ŭ���̾�Ʈ�� �������� �޽����� ���������� �д� �۾��� ���� - �������忡�� ������ Ŭ���̾�Ʈ�� ǥ��
		while(true){
			try {
				String msg = in.readLine();
				serverView.taclientlist.append(nickname+"�� ���� ���۵� �޽���>>"+msg+"\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
