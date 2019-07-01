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
			System.out.println("Ŭ���̾�Ʈ�� ���� �����...");
			socket = serverSocket.accept();

			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());

			Object obj = null;
			
			while ((obj = ois.readObject()) != null) {
				SendData data = (SendData) obj;
				int y = data.getYear();
				String res = null;

				if (((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)) {
					res = "����";
				} else {
					res = "��� ";
				}
				String str="��û��  " + y + "�⵵�� " + res + " �Դϴ�";
				data.setResult(str);
				oos.writeObject(data);

				oos.flush();
				System.out.println("����� �����߽��ϴ�.");
				
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
