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

		System.out.println("������ �޽��� ����...");
	
		
		String [] messages = new String [] {"������ ������ �ű��մϴ�.", "�ð��� ������ ��������", "EOF"};

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