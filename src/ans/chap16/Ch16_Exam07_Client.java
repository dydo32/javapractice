package ans.chap16;
import java.nio.channels.SocketChannel;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Ch16_Exam07_Client {

	public static void main (String [] args)
			throws IOException, InterruptedException {

		InetSocketAddress hostAddress = new InetSocketAddress("localhost", 5454);
		SocketChannel client = SocketChannel.open(hostAddress);

		System.out.println("서버로 메시지 보냄...");
	
		
		String [] messages = new String [] {"계절은 언제나 신기합니다.", "시간이 빠르게 지나가요", "EOF"};

		for (int i = 0; i < messages.length; i++) {

			byte [] message = new String(messages [i]).getBytes();
			ByteBuffer buffer = ByteBuffer.wrap(message);
			client.write(buffer);

			System.out.println(messages [i]);
			buffer.clear();
			Thread.sleep(3000);
		}

		client.close();		
	}
}