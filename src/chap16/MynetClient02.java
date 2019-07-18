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
		InputStream is = null;			//������ input����� �� �� �ִ� ��Ʈ��
		DataInputStream dis = null;		//���������� ������ DataInputStream�� ���ؼ� ���
		OutputStream os = null;			//������ output����� �� �� �ִ� ��Ʈ��
		DataOutputStream dos = null;	//���������� ������ DataOutputStream�� ���ؼ� ���
	
		
		try {
			server = new Socket("192.168.56.1", 12345);
			
			//������ �����ϴ� �����͸� �б� ���� ��Ʈ����ü�� �������κ��� �����Ѵ�.
			is = server.getInputStream();
			dis = new DataInputStream(is);
			
			//������ ������ �����͸� ����ϱ� ���� ��Ʈ����ü�� �������κ��� �����Ѵ�.
			os = server.getOutputStream();
			dos = new DataOutputStream(os);
			
			//1. Ŭ���̾�Ʈ <- ����(������ ������ ������ �б� - 2�� �������� �б�)
			String msg = dis.readUTF();
			System.out.println("������ ������ ������1: "+msg);
			int intMsg = dis.readInt();
			System.out.println("������ ������ ������2: "+intMsg);
			
			//2. Ŭ���̾�Ʈ -> ����(������ ������ ������ - output 1��)
			dos.writeUTF("�ȳ��ϼ��� ������... Ŭ���̾�Ʈ�Դϴ�.");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
