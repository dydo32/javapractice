package ans.chap16;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ch16_Exam03_UDPClient {
	public static void main(String[] args) {
		Ch16_Exam03_UDPClient ut2 = new Ch16_Exam03_UDPClient();
        ut2.connection();
    }
    public void connection() {
        try (DatagramSocket dsocket = new DatagramSocket();){            
            String sendMsg = new String("Hello UDP Echo!!");
            byte[] buff = sendMsg.getBytes();
            InetAddress addr = InetAddress.getByName("127.0.0.1");             

            DatagramPacket sendPacket =
                new DatagramPacket(buff, buff.length, addr, 5432);
           
            dsocket.send(sendPacket);
            System.out.println("보낸 메시지 확인 출력 :" + sendMsg);
        }catch (IOException ie) {
            System.out.println(ie);
        }
    }
 }
