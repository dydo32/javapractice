package chatting.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// 2. ======서버입장에서 작업 : 서버로 접속하는 클라이언트의 정보 및 클라이언트와의 처리 작업을 구현할 클래스======

public class User extends Thread{
	Socket client;
	BufferedReader in;
	PrintWriter out;
	ChatServerView serverView;
	String nickname;
	//클라이언트가 입장하면 클라이언트의 소켓과 서버뷰정보를 이용해서 User객체를 생성
	//User가 생성되면서 소켓으로부터 클라이언트와 통신할 수 있는 스트림을 생성하고 nickname을 받아온다.
	
	public User() {}
	public User(Socket client, ChatServerView serverView) {
		super();
		this.client = client;
		this.serverView = serverView;
		ioWork();
	}
	public void ioWork() {
		try {
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream(), true);
			
			nickname = in.readLine();
			System.out.println("클라이언트가 전송한 nickname받기:" + nickname);
			
			serverView.taclientlist.append("******" + nickname + "님이 입장하셨습니다.******\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 4. ======쓰레드에서 실행할 내용을 run안에 구현======
	public void run(){
		// 클라이언트가 보내오는 메시지를 지속적으로 읽는 작업을 구현 - 서버입장에서 접속한 클라이언트를 표현
		while(true){
			try {
				String msg = in.readLine();
				serverView.taclientlist.append(nickname+"로 부터 전송된 메시지>>"+msg+"\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
