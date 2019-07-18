package chap16.console.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//클라이언트로부터 메시지를 받는 일만 하는 쓰레드 ~ 클라이언트 정보 필요
public class ServerReceiverThread extends Thread {
	Socket client;

	public ServerReceiverThread() {
	}

	public ServerReceiverThread(Socket client) {
		super();
		this.client = client;
	}

	// 클라이언트가 입력한 내용을 읽어서 화면에 출력하는 일만 처리
	public void run() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));

			String reMsg = "";

			while (true) {
				reMsg = in.readLine(); // 서버 <- 클라이언트
				if (reMsg == null) {
					break;
				}
				System.out.println("클라이언트가 전송한 메시지>> " + reMsg);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
