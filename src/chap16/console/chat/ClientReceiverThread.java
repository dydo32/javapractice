package chap16.console.chat;
//������ �����ϴ� �޽����� �о ����ϴ� ������

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceiverThread extends Thread {
	Socket server = null;

	public ClientReceiverThread() {
	}

	public ClientReceiverThread(Socket server) {
		super();
		this.server = server;
	}

	public void run() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(server.getInputStream()));
			String reMsg = "";

			while (true) {
				reMsg = in.readLine(); // Ŭ���̾�Ʈ <- ����
				if (reMsg == null) {
					break;
				}
				System.out.println("�������� ���۵� �޽���>> " + reMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
