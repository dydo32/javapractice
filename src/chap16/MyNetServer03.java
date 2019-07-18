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
 *	1. Ŭ���̾�Ʈ�� �����ϸ� "�ȳ��ϼ��� Ŭ���̾�Ʈ��"�̶�� �޽����� Ŭ���̾�Ʈ�� ������.
	2. Ŭ���̾�Ʈ����  2���� 9������ �������� ������.
	3. Ŭ���̾�Ʈ�� �����ϴ� �����͸� ����Ѵ�.
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
			System.out.println("server ready....Ŭ���̾�Ʈ�� ������ ��ٸ�....");
			
			while(true){
				client = server.accept();
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				is = client.getInputStream();
				dis = new DataInputStream(is);
				
				//1. ���� -> Ŭ���̾�Ʈ
				dos.writeUTF("�ȳ��ϼ��� " +client.getInetAddress().getHostAddress()+ "Ŭ���̾�Ʈ��.");
				
				//2. ���� -> Ŭ���̾�Ʈ
				int num = rand.nextInt(8)+2;
				dos.writeInt(num);
				
				//3. ���� <- Ŭ���̾�Ʈ
				String clientMsg = dis.readUTF();
				System.out.println(clientMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
