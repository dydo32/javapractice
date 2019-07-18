package chap16.console.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// Ŭ���̾�Ʈ�� Ű����� �Է��� �����͸� ������ �޽����� ������ �۾��� �����ϴ� ������
public class ClientSenderThread extends Thread{
	Socket server;
	
	public ClientSenderThread() {
	}
	public ClientSenderThread(Socket server) {
		super();
		this.server = server;
	}
	
	public void run() {
		PrintWriter out = null;
		BufferedReader keyin = null; 
		try {
			out = new PrintWriter(server.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));

			String sendMsg = "";

			while ((sendMsg = keyin.readLine()) != null) {
				out.println(sendMsg); // Ŭ���̾�Ʈ -> ����
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
