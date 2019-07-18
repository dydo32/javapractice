package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MynetClient04 {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader in = null;
		PrintWriter out = null;

		try {
			server = new Socket("192.168.56.1", 12345);
			
			// 서버와 통신할 수 있는 input/output스트림을 소켓으로부터 생성
			in = new BufferedReader(new InputStreamReader(server.getInputStream())); //인풋스트림으로 변환해주어야함
			//autoFlush속성이 true로 설정되어있으면 println메소드가 호출될 때 자동으로 flush()메소드를 호출한다.
			out = new PrintWriter(server.getOutputStream(), true);		//output스트림 바로 받을 수 있음, autoFlush 
		
			// 1. 클라이언트 <- 서버
			String msg = in.readLine();
			System.out.println("서버로부터 전송된 메시지>> "+ msg);
						
			// 2. 클라이언트 -> 서버
			out.println("서버안녕... 나는 클라이언트야..");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
