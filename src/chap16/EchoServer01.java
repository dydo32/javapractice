package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer01 {

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
				System.out.println(client.getInetAddress().getHostAddress()+"님 접속");
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(),true);	
				
				//클라이언트가 보내오는 데이터를 지속적으로 읽어서 클라이언트에게 다시 보내주는 작업
				String reMsg = "";
				while(true){
					//1. 서버 <- 클라이언트(클라이언트가 보내는 데이터를 지속적으로 읽기)
					reMsg = in.readLine();
					if(reMsg == null){
						break;
					}
					//2. 서버 -> 클라이언트
					out.println(reMsg+"^^");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
