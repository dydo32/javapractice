package chap14;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//IO작업을 직접하는 것이 아니라 추가된 기능을 표현해 놓은 스트림클래스이므로 직접 원시데이터와 연결하지 못한다.
public class DataInputStreamTest {

	public static void main(String[] args) throws Exception {
		// 이렇게 바로 생성하는 것도 가능
		DataInputStream dis = 
				new DataInputStream(new FileInputStream("src/chap14/data/dos.txt"));
	
		int data1 = dis.readInt();
		double data2 = dis.readDouble();
		String data3 = dis.readUTF();	// 순서대로
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
	}
}
