package chap16;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//클라이언트
public class MynetClient01 {

	public static void main(String[] args) {
		// 서버와 통신할 수 있는 소켓객체를 생성
		// ip는 서버의 ip를 입력 port는 서버의 port정보
		try {
			Socket socket = new Socket("192.168.56.1", 50000); // (host,port)
			System.out.println("서버접속완료..."+socket);
		} catch (UnknownHostException e) {	//없는 아이피 일때
			e.printStackTrace();
		} catch (IOException e) {	//접속하는것 자체가 IO
			e.printStackTrace();
		}	
	}
}
