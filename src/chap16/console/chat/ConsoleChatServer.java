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
				System.out.println(ip + "님 접속");
				// 클라이언트가 접속하면 클라이언트와 통신할 수 있는 쓰레드 두 개를 생성해서 start
				// 			    ----------------------
				// 					input/output처리

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
