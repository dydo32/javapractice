package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MynetClient04 {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader in = null;
		PrintWriter out = null;

		try {
			server = new Socket("192.168.56.1", 12345);
			
			// ������ ����� �� �ִ� input/output��Ʈ���� �������κ��� ����
			in = new BufferedReader(new InputStreamReader(server.getInputStream())); //��ǲ��Ʈ������ ��ȯ���־����
			//autoFlush�Ӽ��� true�� �����Ǿ������� println�޼ҵ尡 ȣ��� �� �ڵ����� flush()�޼ҵ带 ȣ���Ѵ�.
			out = new PrintWriter(server.getOutputStream(), true);		//output��Ʈ�� �ٷ� ���� �� ����, autoFlush 
		
			// 1. Ŭ���̾�Ʈ <- ����
			String msg = in.readLine();
			System.out.println("�����κ��� ���۵� �޽���>> "+ msg);
						
			// 2. Ŭ���̾�Ʈ -> ����
			out.println("�����ȳ�... ���� Ŭ���̾�Ʈ��..");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
