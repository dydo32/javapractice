package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class EchoClient03 {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader in = null; 
		PrintWriter out = null;
		BufferedReader keyin = null; 
		
		
			try {
				server = new Socket("192.168.56.1", 12345);
				in = new BufferedReader(new InputStreamReader(server.getInputStream()));
				out = new PrintWriter(server.getOutputStream(),true);
				keyin = new BufferedReader(new InputStreamReader(System.in));
				
				//키보드로 입력하는 내용이 지속적으로 서버에 전달되도록 구현
				String sendMsg = ""; 	//서버로 보낼 메시지
				String reMsg = ""; 		//서버로부터 받는 메시지
				//클라이언트가 서버에게 먼저 데이터를 전송한다.
				while((sendMsg=keyin.readLine()) != null){	
					out.println(sendMsg);	//1. 클라이언트 -> 서버
					reMsg = in.readLine();	//2. 클라이언트 <- 서버
					System.out.println("서버에서 전송된 메시지>> "+reMsg);
				}
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	

	}

}
