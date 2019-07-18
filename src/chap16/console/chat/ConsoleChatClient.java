package chap16.console.chat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConsoleChatClient {

	public static void main(String[] args) {
		Socket server = null;
		/*
		 * ClientReceiverThread crt; 
		 * ClientSenderThread cst;
		 */

		try {
			server = new Socket("192.168.56.1", 12345);
			new ClientReceiverThread(server).start();
			new ClientSenderThread(server).start();
			/*
			 * crt = new ClientReceiverThread(server); 
			 * crt.start(); 
			 * cst = new ClientSenderThread(server); 
			 * cst.start();
			 */
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
