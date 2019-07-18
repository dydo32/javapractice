package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//Ŭ���̾�Ʈ�� Ű����� �Է��ϴ� �����͸� ������ �޾Ƽ� �ٽ� Ŭ���̾�Ʈ�� �������ִ� ���α׷�
public class EchoClient01 {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader in = null; //������ ������ �����͸� �б� ���� �Է� ��Ʈ��
		PrintWriter out = null;
		BufferedReader keyin = null; //�������� �����͸� ������ ���ؼ� Ű����� �Է��ϴ� ���� �б� ���� �Է½�Ʈ��
		
		try {
			server = new Socket("192.168.56.1", 12345);
			in = new BufferedReader(new InputStreamReader(server.getInputStream()));
			out = new PrintWriter(server.getOutputStream(),true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			//Ű����� �Է��ϴ� ������ ���������� ������ ���޵ǵ��� ����
			String sendMsg = ""; //������ ���� �޽���
			String reMsg = ""; //������ ���� �޴� �޽���
			
			while((sendMsg=keyin.readLine())!=null){
				//1. Ŭ���̾�Ʈ�� -> ����(Ű����� �Է��ϴ� �����͸� ������ ������)
				out.println(sendMsg);
				//2. Ŭ���̾�Ʈ�� <- ����
				reMsg = in.readLine();
				System.out.println("�������� ���۵� �޽���>> "+reMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
