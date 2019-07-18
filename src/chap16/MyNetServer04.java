package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//����4 - BufferedReader�� PrintWriter�̿�
public class MyNetServer04 {

	public static void main(String[] args) {
		// Ŭ���̾�Ʈ�� ����ϱ� ���� ���ϰ�ü
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;
		ServerSocket server;

		try {
			server = new ServerSocket(12345);
			System.out.println("server ready....");

			while (true) {
				client = server.accept();
				System.out.println(client.getInetAddress().getHostAddress() + "�� ����");

				// Ŭ���̾�Ʈ�� ����� �� �ִ� input/output��Ʈ���� �������κ��� ����
				in = new BufferedReader(new InputStreamReader(client.getInputStream())); // ��ǲ��Ʈ������ ��ȯ���־����
				out = new PrintWriter(client.getOutputStream()); // output��Ʈ�� �ٷ�  ���� �� ����.

				// ******��� ����******
				// 1. ���� -> Ŭ���̾�Ʈ
				out.println("Ŭ���̾�Ʈ�� ���� ����");
				out.flush(); // flush�� ȣ������ ������ Ŭ���̾�Ʈ�� X
				/*
				 * ��¹��ۿ� �ӽ÷� �����Ǿ� ��Ʈ������ ��µ� ������ ������� 
				 * �����͸� ��Ʈ������ �������� �۾��� �ϴ� ���� flush 
				 * flush�� ���۸� ���� ��� - ��¹����� ������ ������ ����϶�� �ǹ�
				 */

				// 2. ���� <- Ŭ���̾�Ʈ
				String msg = in.readLine();
				System.out.println("Ŭ���̾�Ʈ�� ������ �޽���>> " + msg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
