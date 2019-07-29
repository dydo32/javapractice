package chatting.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JOptionPane;

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
			broadCast("new/"+nickname);
			
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
				filteringMsg(msg);
			} catch (IOException e) {
				// 2.======메시지를 계속 읽고 있는데 클라이언트와 접속이 끊어지는 경우
				// 		오류가 발생하고 이런 상황이 되면 벡터에서 사용자 빼고 모든 클라이언트에게 알려준다.======
				JOptionPane.showMessageDialog(null, "사용자와 접속이 끊어짐","알림",JOptionPane.ERROR_MESSAGE);
				try {
					if(in!=null) in.close();
					if(out!=null) out.close();
					if(client!=null) client.close();
					userlist.remove(this);
					broadCast("out/"+nickname);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;
			}
		}
	}
	private void filteringMsg(String msg){
		System.out.println("서버가 받은 클라이언트의 메시지>>" + msg);
		StringTokenizer token = new StringTokenizer(msg,"/");
		String protocol = token.nextToken();
		if(protocol.equals("chatting")){
			String message = token.nextToken();
			String sendNickname = token.nextToken();
			broadCast("chatting/"+message+"/"+sendNickname);
		}
	}
	
	private void sendMsg(String msg){
		out.println(msg);
	}
	
	private void broadCast(String msg){
		int size = userlist.size();
		for (int i = 0; i < size; i++) {
			User user = userlist.get(i);	
			user.sendMsg(msg);
		}
	}
}
