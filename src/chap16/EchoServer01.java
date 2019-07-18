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
				System.out.println(client.getInetAddress().getHostAddress()+"�� ����");
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(),true);	
				
				//Ŭ���̾�Ʈ�� �������� �����͸� ���������� �о Ŭ���̾�Ʈ���� �ٽ� �����ִ� �۾�
				String reMsg = "";
				while(true){
					//1. ���� <- Ŭ���̾�Ʈ(Ŭ���̾�Ʈ�� ������ �����͸� ���������� �б�)
					reMsg = in.readLine();
					if(reMsg == null){
						break;
					}
					//2. ���� -> Ŭ���̾�Ʈ
					out.println(reMsg+"^^");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
