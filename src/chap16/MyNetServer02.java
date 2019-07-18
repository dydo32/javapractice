package chap16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNetServer02 {

	public static void main(String[] args) {
		Socket client = null;
		InputStream is = null;		//클라이언트와 input통신을 할 수 있는 스트림
		DataInputStream dis = null;	//최종적으로 클라이언트와 DataInputStream을 통해서 통신
		OutputStream os = null;		//클라이언트와 output통신을 할 수 있는 스트림
		DataOutputStream dos = null;//최종적으로 클라이언트와 DataOutputStream을 통해서 통신
		
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("클라이언트의 접속을 기다림....");
			while(true){
				client = server.accept();
				
				//클라이언트가 전송하는 데이터를 읽기 위한 스트림객체를 소켓으로부터 생성한다.
				is = client.getInputStream();
				dis = new DataInputStream(is);
				
				//클라리언트로 전송할 데이터를 출력하기 위한 스트림객체를 소켓으로부터 생성한다.
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
						
				//1. 서버 -> 클라이언트(순서가 중요...output2번 연속)
				dos.writeUTF(client.getInetAddress().getHostAddress()+"님 접속을 환영합니다ㅎㅇ.");
				dos.writeInt(20000);
				
				//2. 서버 <- 클라이언트(input 1번)
				String clientMsg = dis.readUTF();
				System.out.println("클라이언트가 전송한 데이터: "+clientMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
