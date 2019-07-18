package chap16.console.chat;
//서버가 전송하는 메시지를 읽어서 출력하는 쓰레드

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
				reMsg = in.readLine(); // 클라이언트 <- 서버
				if (reMsg == null) {
					break;
				}
				System.out.println("서버에서 전송된 메시지>> " + reMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
