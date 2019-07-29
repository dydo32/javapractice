package chatting.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

public class User extends Thread {
	Socket client;
	BufferedReader in;
	PrintWriter out;
	ChatServerView serverView;
	String nickname;
	Vector<User> userlist = new Vector<User>();
	public User() {
	}
	public User(Socket client, ChatServerView serverView, Vector<User> userlist) {
		super();
		this.client = client;
		this.serverView = serverView;
		this.userlist = userlist;
		System.out.println("기존사용자=>" + userlist.size());
		ioWork();
	}
	
	public void ioWork() {
		try {
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream(), true);

			nickname = in.readLine();
			System.out.println("클라이언트가 전송한 nickname받기:" + nickname);

			serverView.taclientlist.append("******" + nickname + "님이 입장하셨습니다.******\n");
			int size = userlist.size(); 
			//기존사용자에게 새로운 사용자를 알림 - 
			// 2.======기존 for문을 메소드 호출로 변경======
			broadCast("new/"+nickname);
			// ====================================
			
			//새로운사용자에게 기존 사용자를 알림
			for (int i = 0; i < size; i++) {
				User user = userlist.get(i);	
				sendMsg("old/"+user.nickname);
			}
			userlist.add(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		while (true) {
			try {
				String msg = in.readLine();
				serverView.taclientlist.append(nickname + "로 부터 전송된 메시지>>" + msg + "\n");
				// 4.======클라이언트한테 전송받은 메시지에 chatting이 들어가면
				//		다시 모든 클라이언트에게 전송하기 - 메소드로 정의======
				filteringMsg(msg);
				// =============================================
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	// 5.======대화인지 확인해서 다시 클라이언트들에게 전송하는 메소드======
	private void filteringMsg(String msg){
		System.out.println("서버가 받은 클라이언트의 메시지>>" + msg);
		StringTokenizer token = new StringTokenizer(msg,"/");
		String protocol = token.nextToken();
		if(protocol.equals("chatting")){
			String message = token.nextToken();
			String nickname = token.nextToken();
			broadCast("chatting/"+message+"/"+nickname);
		//내가한부분(귓속말)	
		}else if(protocol.equals("secretChatting")){
			String message = token.nextToken();
			String nickname = token.nextToken();
			String secretUser = token.nextToken();
			
			int size = userlist.size();
			for (int i = 0; i < size; i++) {
				User user = userlist.get(i);	
				
				if(secretUser.equals(user.nickname)|nickname.equals(user.nickname)){
					System.out.println(userlist.get(i));
					userlist.get(i).sendMsg("secretChatting/"+message+"/"+nickname);
				}
			}
		}
		//=====================================================
	}
	// =====================================================
	
	private void sendMsg(String msg){
		out.println(msg);
	}
	
	// 1.======기존 사용자에게 메시지를 보내기======
	private void broadCast(String msg){
		int size = userlist.size();
		for (int i = 0; i < size; i++) {
			User user = userlist.get(i);	
			user.sendMsg(msg);
		}
	}
	// ====================================
}
