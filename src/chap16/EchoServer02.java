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

public class EchoServer02 {

	public static void main(String[] args) {
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

				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(), true);

				String reMsg = "";
				while (true) {

					reMsg = in.readLine();
					if (reMsg == null) {
						break;
					}

					if (reMsg.startsWith("�ȳ��ϼ���?") | reMsg.startsWith("����")) {
						out.println(client.getInetAddress().getHostAddress() + "�� �ݰ�����");
					} else if (reMsg.startsWith("���� ��¥��")) {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
						Calendar today = new GregorianCalendar();
						String data = sdf.format(today.getTime());
						out.println("���� ��¥�� " + data);
					} else {
						out.println(client.getInetAddress().getHostAddress() + "�� � ��~~");
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}