package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EchoServer03 {

	public static void main(String[] args) {
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;
		ServerSocket server;
		BufferedReader keyin = null; //클라이언트에게 전송할 데이터를 키보드로 입력
		
		try {
			server = new ServerSocket(12345);
			System.out.println("server ready....");

			while (true) {
				client = server.accept();
				System.out.println(client.getInetAddress().getHostAddress() + "님 접속");
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(), true);
				keyin = new BufferedReader(new InputStreamReader(System.in));

				String sendMsg = "";
				String reMsg = "";
				while (true) {	//클라이언트가 보내오는 데이터를 출력하고 서버도 키보드로 입력한 
								//데이터를 클라이언트에게 전송
					//1. 서버 <- 클라이언트
					reMsg = in.readLine();
					System.out.println("클라이언트>> " + reMsg);
					if (reMsg == null) {
						break;
					}

					//2. 서버 -> 클라이언트
					//클라이언트에게 보낼 메시지를 키보드로 입력받아서 전송
					sendMsg = keyin.readLine();
					out.println(sendMsg);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}