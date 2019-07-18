package chap16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 	1. 서버가 보내오는 환영메시지를 출력한다.
	2. 서버가 보내오는 랜덤수에 해당하는 구구단을 출력한다.
	3. 서버가 보내오는 랜덤수를 짝수 홀수 판단해서 서버로 메시지를 보낸다.
 */
public class MynetClient03 {

	public static void main(String[] args) {
		Socket server = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;

		try {
			server = new Socket("192.168.56.1", 22222);
			is = server.getInputStream();
			dis = new DataInputStream(is);
			os = server.getOutputStream();
			dos = new DataOutputStream(os);
			
			//1. 클라이언트 <- 서버
			String msg = dis.readUTF();
			System.out.println(msg);

			//2. 클라이언트 <- 서버
			int intMsg = dis.readInt();
			for (int i = 1; i < 10; i++) {
				System.out.println(intMsg + " * " + i + " = " + intMsg * i);
			}
			
			//3. 클라이언트 -> 서버
			if(intMsg%2 == 0){
				dos.writeUTF(intMsg+"은(는) 짝수입니다.");
			}else{
				dos.writeUTF(intMsg+"은(는) 홀수입니다.");
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
