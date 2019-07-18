package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EchoServer03 {

	public static void main(String[] args) {
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;
		ServerSocket server;
		BufferedReader keyin = null; //Ŭ���̾�Ʈ���� ������ �����͸� Ű����� �Է�
		
		try {
			server = new ServerSocket(12345);
			System.out.println("server ready....");

			while (true) {
				client = server.accept();
				System.out.println(client.getInetAddress().getHostAddress() + "�� ����");
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(), true);
				keyin = new BufferedReader(new InputStreamReader(System.in));

				String sendMsg = "";
				String reMsg = "";
				while (true) {	//Ŭ���̾�Ʈ�� �������� �����͸� ����ϰ� ������ Ű����� �Է��� 
								//�����͸� Ŭ���̾�Ʈ���� ����
					//1. ���� <- Ŭ���̾�Ʈ
					reMsg = in.readLine();
					System.out.println("Ŭ���̾�Ʈ>> " + reMsg);
					if (reMsg == null) {
						break;
					}

					//2. ���� -> Ŭ���̾�Ʈ
					//Ŭ���̾�Ʈ���� ���� �޽����� Ű����� �Է¹޾Ƽ� ����
					sendMsg = keyin.readLine();
					out.println(sendMsg);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}