package chap16.console.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//Ŭ���̾�Ʈ�� �޽����� ������ �۾��� �����ϴ� ������
public class ServerSenderThread extends Thread {
	Socket client = null;

	public ServerSenderThread() {

	}

	public ServerSenderThread(Socket client) {
		super();
		this.client = client;
	}

	// Ű����� �Է��� ������ Ŭ���̾�Ʈ���� ������ �� ����
	public void run() {
		PrintWriter out = null;
		BufferedReader keyin = null;
		try {
			out = new PrintWriter(client.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));

			String sendMsg = "";

			while ((sendMsg = keyin.readLine()) != null) {
				out.println(sendMsg); // ���� -> Ŭ���̾�Ʈ
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
