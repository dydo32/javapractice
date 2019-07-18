package chap16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
 *	1. 클라이언트가 접속하면 "안녕하세요 클라이언트님"이라는 메시지를 클라이언트로 보낸다.
	2. 클라이언트에게  2부터 9까지의 랜덤수를 보낸다.
	3. 클라이언트가 전송하는 데이터를 출력한다.
 */
public class MyNetServer03 {

	public static void main(String[] args) {
		Socket client = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		Random rand = new Random();
		
		try {
			ServerSocket server = new ServerSocket(22222);
			System.out.println("server ready....클라이언트의 접속을 기다림....");
			
			while(true){
				client = server.accept();
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				is = client.getInputStream();
				dis = new DataInputStream(is);
				
				//1. 서버 -> 클라이언트
				dos.writeUTF("안녕하세요 " +client.getInetAddress().getHostAddress()+ "클라이언트님.");
				
				//2. 서버 -> 클라이언트
				int num = rand.nextInt(8)+2;
				dos.writeInt(num);
				
				//3. 서버 <- 클라이언트
				String clientMsg = dis.readUTF();
				System.out.println(clientMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
