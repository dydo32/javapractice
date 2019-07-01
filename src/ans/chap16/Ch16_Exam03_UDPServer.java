package ans.chap16;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Ch16_Exam03_UDPServer {
	
	public static void main(String[] args) {
		Ch16_Exam03_UDPServer ut1 = new Ch16_Exam03_UDPServer();
		ut1.service();
	}

	public void service() {
		try (	DatagramSocket dsocket = new DatagramSocket(5432);){
			byte[] buff = new byte[1024];

			DatagramPacket recvPacket 
			= new DatagramPacket(buff, buff.length);
			dsocket.receive(recvPacket);
			
			String recvMsg = new String(recvPacket.getData());
			System.out.println("받은 메시지 : " + recvMsg);
		
		} catch (IOException ie) {
			System.out.println(ie);
		}
	}
}


