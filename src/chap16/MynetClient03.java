package chap16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 	1. ������ �������� ȯ���޽����� ����Ѵ�.
	2. ������ �������� �������� �ش��ϴ� �������� ����Ѵ�.
	3. ������ �������� �������� ¦�� Ȧ�� �Ǵ��ؼ� ������ �޽����� ������.
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
			
			//1. Ŭ���̾�Ʈ <- ����
			String msg = dis.readUTF();
			System.out.println(msg);

			//2. Ŭ���̾�Ʈ <- ����
			int intMsg = dis.readInt();
			for (int i = 1; i < 10; i++) {
				System.out.println(intMsg + " * " + i + " = " + intMsg * i);
			}
			
			//3. Ŭ���̾�Ʈ -> ����
			if(intMsg%2 == 0){
				dos.writeUTF(intMsg+"��(��) ¦���Դϴ�.");
			}else{
				dos.writeUTF(intMsg+"��(��) Ȧ���Դϴ�.");
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
