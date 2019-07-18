package chap16;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//����
public class MyNetServer01 {

	public static void main(String[] args) {
		// Ŭ���̾�Ʈ�� ����� �� �ֵ��� �غ�
		// => Ŭ���̾�Ʈ�� ����ϱ� ���ؼ� ServerSocket�� ����
		// 65535
		
		try {
			//Ŭ���̾�Ʈ�� ����ϱ����ؼ� ������ ���� �غ�
			ServerSocket server = new ServerSocket(50000);	//10000�̻��̸� ��밡��
			System.out.println("���� �غ� �Ϸ�...... Ŭ���̾�Ʈ�� ������ ��ٸ�...");
			//Ŭ���̾�Ʈ�� ������ ������ ����ϴٰ� �����ϸ� Ŭ���̾�Ʈ�� ������ �������� ����
			while(true){	//��� accept�Ǿ��ϹǷ� ���ѷ����� �ѵ�
				Socket client = server.accept();
				InetAddress clientIp = client.getInetAddress();
				//System.out.println(client);
				System.out.println("������ Ŭ���̾�Ʈ=> " + clientIp.getHostAddress() );
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
