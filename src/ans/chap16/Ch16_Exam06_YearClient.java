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
				System.out.println("�Ǻ��� ������  �Է��ϼ���.");
				message = reader.readLine();
				year = Integer.parseInt(message);					   

				SendData sendObj = new SendData(year);
				oos.writeObject(sendObj);
				oos.flush();

				SendData responseMsg = (SendData) ois.readObject();
				System.out.println("�������� ��  ��� : "
				+ responseMsg.getResult());
				
				System.out.println("��� �Է� �ϰڽ��ϱ�?(yes/no �Է�)");
				message = reader.readLine();
				if (message.equals("no"))
					break;
				System.out.println("�ٽ� ��û�մϴ� ");
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
