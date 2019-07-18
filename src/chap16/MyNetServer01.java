package chap16;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//서버
public class MyNetServer01 {

	public static void main(String[] args) {
		// 클라이언트와 통신할 수 있도록 준비
		// => 클라이언트와 통신하기 위해서 ServerSocket을 생성
		// 65535
		
		try {
			//클라이언트와 통신하기위해서 소켓을 열고 준비
			ServerSocket server = new ServerSocket(50000);	//10000이상이면 사용가능
			System.out.println("서버 준비 완료...... 클라이언트의 접속을 기다림...");
			//클라이언트가 접속할 때까지 대기하다가 접속하면 클라이언트의 정보를 소켓으로 리턴
			while(true){	//계속 accept되야하므로 무한루프로 켜둠
				Socket client = server.accept();
				InetAddress clientIp = client.getInetAddress();
				//System.out.println(client);
				System.out.println("접속한 클라이언트=> " + clientIp.getHostAddress() );
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
