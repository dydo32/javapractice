package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class EchoClient03 {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader in = null; 
		PrintWriter out = null;
		BufferedReader keyin = null; 
		
		
			try {
				server = new Socket("192.168.56.1", 12345);
				in = new BufferedReader(new InputStreamReader(server.getInputStream()));
				out = new PrintWriter(server.getOutputStream(),true);
				keyin = new BufferedReader(new InputStreamReader(System.in));
				
				//Ű����� �Է��ϴ� ������ ���������� ������ ���޵ǵ��� ����
				String sendMsg = ""; 	//������ ���� �޽���
				String reMsg = ""; 		//�����κ��� �޴� �޽���
				//Ŭ���̾�Ʈ�� �������� ���� �����͸� �����Ѵ�.
				while((sendMsg=keyin.readLine()) != null){	
					out.println(sendMsg);	//1. Ŭ���̾�Ʈ -> ����
					reMsg = in.readLine();	//2. Ŭ���̾�Ʈ <- ����
					System.out.println("�������� ���۵� �޽���>> "+reMsg);
				}
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	

	}

}
