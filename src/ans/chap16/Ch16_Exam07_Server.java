package ans.chap16;

import java.nio.channels.*;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.util.Set;
import java.util.Iterator;
import java.net.InetSocketAddress;

public class Ch16_Exam07_Server {

	public static void main (String [] args) throws IOException {
		
		Selector selector = Selector.open();
		System.out.println("Selector open: " + selector.isOpen());
		ServerSocketChannel serverSocket = ServerSocketChannel.open();
		InetSocketAddress hostAddress = new InetSocketAddress("localhost", 5454);
		serverSocket.bind(hostAddress);
		serverSocket.configureBlocking(false);
		int ops = serverSocket.validOps();
		SelectionKey selectKy = serverSocket.register(selector, ops, null);
		for (;;) {

			System.out.println("셀렉트 대기 ");
			int noOfKeys = selector.select();
			System.out.println( "셀렉트 키 : " + noOfKeys);

			Set<SelectionKey> selectedKeys = selector.selectedKeys();
			Iterator<SelectionKey> iter = selectedKeys.iterator();

			while (iter.hasNext()) {

				SelectionKey ky = iter.next();

				if (ky.isAcceptable()) {

					// 새로운 클라이언트 Accept
					SocketChannel client = serverSocket.accept();
					client.configureBlocking(false);

					//새로운 셀렉터 추가 , 읽기 모드 
					client.register(selector, SelectionKey.OP_READ);
					System.out.println("새로운 클라이언트  접속: " + client);
				}
				else if (ky.isReadable()) {
				
					SocketChannel client = (SocketChannel) ky.channel();
					ByteBuffer buffer = ByteBuffer.allocate(256);
					client.read(buffer);
					String output = new String(buffer.array()).trim();

					System.out.println("클라이언트로 부터 온 메시지: " + output);
	
					if (output.equals("EOF")) {
						client.close();
						System.out.println("종료!");
					}

				} // end if

				iter.remove();

			} // end while loop

		} // end for loop
	}
} // class

