package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//서버4 - BufferedReader와 PrintWriter이용
public class MyNetServer04 {

	public static void main(String[] args) {
		// 클라이언트와 통신하기 위한 소켓객체
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;
		ServerSocket server;

		try {
			server = new ServerSocket(12345);
			System.out.println("server ready....");

			while (true) {
				client = server.accept();
				System.out.println(client.getInetAddress().getHostAddress() + "님 접속");

				// 클라이언트와 통신할 수 있는 input/output스트림을 소켓으로부터 생성
				in = new BufferedReader(new InputStreamReader(client.getInputStream())); // 인풋스트림으로 변환해주어야함
				out = new PrintWriter(client.getOutputStream()); // output스트림 바로  받을 수 있음.

				// ******통신 시작******
				// 1. 서버 -> 클라이언트
				out.println("클라이언트님 접속 성공");
				out.flush(); // flush을 호출하지 않으면 클라이언트에 X
				/*
				 * 출력버퍼에 임시로 보관되어 스트림으로 출력될 때까지 대기중인 
				 * 데이터를 스트림으로 내보내는 작업을 하는 것이 flush 
				 * flush는 버퍼를 비우는 명령 - 출력버퍼의 내용을 실제로 출력하라는 의미
				 */

				// 2. 서버 <- 클라이언트
				String msg = in.readLine();
				System.out.println("클라이언트가 전송한 메시지>> " + msg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
