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
		InputStream is = null;		//Ŭ���̾�Ʈ�� input����� �� �� �ִ� ��Ʈ��
		DataInputStream dis = null;	//���������� Ŭ���̾�Ʈ�� DataInputStream�� ���ؼ� ���
		OutputStream os = null;		//Ŭ���̾�Ʈ�� output����� �� �� �ִ� ��Ʈ��
		DataOutputStream dos = null;//���������� Ŭ���̾�Ʈ�� DataOutputStream�� ���ؼ� ���
		
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ�....");
			while(true){
				client = server.accept();
				
				//Ŭ���̾�Ʈ�� �����ϴ� �����͸� �б� ���� ��Ʈ����ü�� �������κ��� �����Ѵ�.
				is = client.getInputStream();
				dis = new DataInputStream(is);
				
				//Ŭ�󸮾�Ʈ�� ������ �����͸� ����ϱ� ���� ��Ʈ����ü�� �������κ��� �����Ѵ�.
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
						
				//1. ���� -> Ŭ���̾�Ʈ(������ �߿�...output2�� ����)
				dos.writeUTF(client.getInetAddress().getHostAddress()+"�� ������ ȯ���մϴ٤���.");
				dos.writeInt(20000);
				
				//2. ���� <- Ŭ���̾�Ʈ(input 1��)
				String clientMsg = dis.readUTF();
				System.out.println("Ŭ���̾�Ʈ�� ������ ������: "+clientMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
