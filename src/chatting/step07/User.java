package chatting.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

//User가 서버에 접속한 클라이언트를 모델링한 클래스
//User객체가 생성되었다는 것은 새로운 클라이언트가 접속했다는 것을 의미
//새로운 클라이언트가 접속하면 기존 사용자 리스트를 넘겨받는다.
public class User extends Thread {
	Socket client;
	BufferedReader in;
	PrintWriter out;
	ChatServerView serverView;
	String nickname;
	// 2.======기존 사용자의 정보를 저장하고 있는 Vector를 서버로 부터 받아오기 위해 변수를 정의======
	Vector<User> userlist = new Vector<User>();

	// ======================================================================
	public User() {
	}

	// 3.======기존사용자 Vector를 넘겨받을 수 있도록 생성자를 수정======
	public User(Socket client, ChatServerView serverView, Vector<User> userlist) {
		super();
		this.client = client;
		this.serverView = serverView;
		this.userlist = userlist;
		System.out.println("기존사용자=>" + userlist.size());
		ioWork();
	}
	// ===================================================

	public void ioWork() {
		try {
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream(), true);

			nickname = in.readLine();
			System.out.println("클라이언트가 전송한 nickname받기:" + nickname);

			serverView.taclientlist.append("******" + nickname + "님이 입장하셨습니다.******\n");
			// 5.======새로운 클라이언트가 입장하면 사용자Vector에 저장되어있는 
			// 			모든 클라이언트들에게 입장을 알리는 메시지를보낸다.=======
			int size = userlist.size(); // 기존 접속자 수
			for (int i = 0; i < size; i++) {
				User user = userlist.get(i);	//기존 접속한 사용자정보
				//이미 접속해 있는 클라이언트들에게 새로 접속한 사용자의 nickname을 보내기
				user.sendMsg("new/"+nickname);
			}
			// ===================================================
			// 14.======새로 입장한 클라이언트(this)에게 기존 사용자정보를 알려주기======
			for (int i = 0; i < size; i++) {
				User user = userlist.get(i);	//기존 접속한 사용자정보
				//이미 접속해 있는 클라이언트들에게 새로 접속한 사용자의 nickname을 보내기
				sendMsg("old/"+user.nickname);
			}
			// =========================================================
			// 7.======기존 접속자들에게 나의 입장을 안내한 후에 벡터에 추가하기======
			userlist.add(this);
			// ====================================================
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		while (true) {
			try {
				String msg = in.readLine();
				serverView.taclientlist.append(nickname + "로 부터 전송된 메시지>>" + msg + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 6.======클라이언트에게 메시지를 내보내는 메소드를 정의======
	private void sendMsg(String msg){
		out.println(msg);
	}
	// =============================================

}
