package ans.chap16;
import java.io.*;
import java.net.Socket;

public class Ch16_Exam06_YearClient {
	public static void main(String[] args) {

		Socket socket = null;
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		int year = 0;	
		try {
			socket = new Socket("127.0.0.1", 8888);

			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());

			BufferedReader reader 
			= new BufferedReader(new InputStreamReader(
					System.in));
			String message = null;
			while (true) {
				System.out.println("판별할 연도를  입력하세요.");
				message = reader.readLine();
				year = Integer.parseInt(message);					   

				SendData sendObj = new SendData(year);
				oos.writeObject(sendObj);
				oos.flush();

				SendData responseMsg = (SendData) ois.readObject();
				System.out.println("서버에서 의  결과 : "
				+ responseMsg.getResult());
				
				System.out.println("계속 입력 하겠습니까?(yes/no 입력)");
				message = reader.readLine();
				if (message.equals("no"))
					break;
				System.out.println("다시 요청합니다 ");
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}finally{
			 try{
			socket.close();
			 }catch(Exception e){
				 System.out.println(e);
			 }
		}
	}
}
