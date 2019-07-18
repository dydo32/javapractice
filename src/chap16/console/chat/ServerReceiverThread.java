package chap16.console.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//Ŭ���̾�Ʈ�κ��� �޽����� �޴� �ϸ� �ϴ� ������ ~ Ŭ���̾�Ʈ ���� �ʿ�
public class ServerReceiverThread extends Thread {
	Socket client;

	public ServerReceiverThread() {
	}

	public ServerReceiverThread(Socket client) {
		super();
		this.client = client;
	}

	// Ŭ���̾�Ʈ�� �Է��� ������ �о ȭ�鿡 ����ϴ� �ϸ� ó��
	public void run() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));

			String reMsg = "";

			while (true) {
				reMsg = in.readLine(); // ���� <- Ŭ���̾�Ʈ
				if (reMsg == null) {
					break;
				}
				System.out.println("Ŭ���̾�Ʈ�� ������ �޽���>> " + reMsg);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
