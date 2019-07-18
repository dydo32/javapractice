package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class EchoClient02 {

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
				
				
				String sendMsg = ""; 
				String reMsg = ""; 
				
				while((sendMsg=keyin.readLine()) != null){	
				
					out.println(sendMsg);
				
					reMsg = in.readLine();
					System.out.println("서버에서 전송된 메시지>> "+reMsg);
					
				}
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	

	}

}
