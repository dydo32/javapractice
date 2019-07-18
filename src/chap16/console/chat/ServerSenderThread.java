package chap16.console.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//클라이언트로 메시지를 보내는 작업만 수행하는 쓰레드
public class ServerSenderThread extends Thread {
	Socket client = null;

	public ServerSenderThread() {

	}

	public ServerSenderThread(Socket client) {
		super();
		this.client = client;
	}

	// 키보드로 입력한 내용을 클라이언트에게 보내는 일 수행
	public void run() {
		PrintWriter out = null;
		BufferedReader keyin = null;
		try {
			out = new PrintWriter(client.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));

			String sendMsg = "";

			while ((sendMsg = keyin.readLine()) != null) {
				out.println(sendMsg); // 서버 -> 클라이언트
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
