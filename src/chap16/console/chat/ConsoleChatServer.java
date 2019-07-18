package chap16.console.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import chap16.console.chat.ServerReceiverThread;
import chap16.console.chat.ServerSenderThread;

public class ConsoleChatServer {

	public static void main(String[] args) {
		Socket client = null;
		ServerSocket server;
		/*
		 * ServerReceiverThread srt;
		 *  ServerSenderThread sst;
		 */

		try {
			server = new ServerSocket(12345);
			System.out.println("server ready....");

			while (true) {
				client = server.accept();
				String ip = client.getInetAddress().getHostAddress();
				System.out.println(ip + "�� ����");
				// Ŭ���̾�Ʈ�� �����ϸ� Ŭ���̾�Ʈ�� ����� �� �ִ� ������ �� ���� �����ؼ� start
				// 			    ----------------------
				// 					input/outputó��

				new ServerReceiverThread(client).start();
				new ServerSenderThread(client).start();
				/*
				 * srt = new ServerReceiverThread(client); 
				 * srt.start(); 
				 * sst = new ServerSenderThread(client); 
				 * sst.start();
				 */
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
