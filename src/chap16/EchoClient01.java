package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//클라이언트가 키보드로 입력하는 데이터를 서버가 받아서 다시 클라이언트로 전송해주는 프로그램
public class EchoClient01 {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader in = null; //서버가 보내는 데이터를 읽기 위한 입력 스트림
		PrintWriter out = null;
		BufferedReader keyin = null; //서버에게 데이터를 보내기 위해서 키보드로 입력하는 것을 읽기 위한 입력스트림
		
		try {
			server = new Socket("192.168.56.1", 12345);
			in = new BufferedReader(new InputStreamReader(server.getInputStream()));
			out = new PrintWriter(server.getOutputStream(),true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			//키보드로 입력하는 내용이 지속적으로 서버에 전달되도록 구현
			String sendMsg = ""; //서버로 보낼 메시지
			String reMsg = ""; //서버로 부터 받는 메시지
			
			while((sendMsg=keyin.readLine())!=null){
				//1. 클라이언트가 -> 서버(키보드로 입력하는 데이터를 서버로 보내기)
				out.println(sendMsg);
				//2. 클라이언트로 <- 서버
				reMsg = in.readLine();
				System.out.println("서버에서 전송된 메시지>> "+reMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
