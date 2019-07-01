package ans.chap16;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ch16_Exam06_YearServer {
	public static void main(String[] args) {
		
		Socket socket = null;
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;

		try (ServerSocket serverSocket = new ServerSocket(8888)) {
			System.out.println("클라이언트의 접속 대기중...");
			socket = serverSocket.accept();

			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());

			Object obj = null;
			
			while ((obj = ois.readObject()) != null) {
				SendData data = (SendData) obj;
				int y = data.getYear();
				String res = null;

				if (((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)) {
					res = "윤년";
				} else {
					res = "평년 ";
				}
				String str="요청한  " + y + "년도는 " + res + " 입니다";
				data.setResult(str);
				oos.writeObject(data);

				oos.flush();
				System.out.println("결과를 전송했습니다.");
				
			}
			 ois.close();
		     oos.close();
		     
		} catch (Exception e) {
			System.out.println(e);
		}finally{
			 try{
			socket.close();
			 }catch(Exception e){
				 System.out.println(e);
			 }
		}
		
	}
}
