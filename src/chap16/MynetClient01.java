package chap16;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//Ŭ���̾�Ʈ
public class MynetClient01 {

	public static void main(String[] args) {
		// ������ ����� �� �ִ� ���ϰ�ü�� ����
		// ip�� ������ ip�� �Է� port�� ������ port����
		try {
			Socket socket = new Socket("192.168.56.1", 50000); // (host,port)
			System.out.println("�������ӿϷ�..."+socket);
		} catch (UnknownHostException e) {	//���� ������ �϶�
			e.printStackTrace();
		} catch (IOException e) {	//�����ϴ°� ��ü�� IO
			e.printStackTrace();
		}	
	}
}
