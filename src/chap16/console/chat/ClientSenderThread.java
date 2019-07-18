package chap16.console.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// 클라이언트가 키보드로 입력한 데이터를 서버로 메시지를 보내는 작업을 수행하는 쓰레드
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
				out.println(sendMsg); // 클라이언트 -> 서버
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
