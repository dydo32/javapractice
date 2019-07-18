package chap16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MynetClient02 {

	public static void main(String[] args) {
		Socket server = null;	
		InputStream is = null;			//서버와 input통신을 할 수 있는 스트림
		DataInputStream dis = null;		//최종적으로 서버와 DataInputStream을 통해서 통신
		OutputStream os = null;			//서버와 output통신을 할 수 있는 스트림
		DataOutputStream dos = null;	//최종적으로 서버와 DataOutputStream을 통해서 통신
	
		
		try {
			server = new Socket("192.168.56.1", 12345);
			
			//서버가 전송하는 데이터를 읽기 위한 스트림객체를 소켓으로부터 생성한다.
			is = server.getInputStream();
			dis = new DataInputStream(is);
			
			//서버로 전송할 데이터를 출력하기 위한 스트림객체를 소켓으로부터 생성한다.
			os = server.getOutputStream();
			dos = new DataOutputStream(os);
			
			//1. 클라이언트 <- 서버(서버가 보내는 데이터 읽기 - 2번 연속으로 읽기)
			String msg = dis.readUTF();
			System.out.println("서버가 전송한 데이터1: "+msg);
			int intMsg = dis.readInt();
			System.out.println("서버가 전송한 데이터2: "+intMsg);
			
			//2. 클라이언트 -> 서버(서버로 데이터 보내기 - output 1번)
			dos.writeUTF("안녕하세요 서버님... 클라이언트입니다.");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
