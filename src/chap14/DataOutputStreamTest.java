package chap14;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataOutputStreamTest {

	public static void main(String[] args) throws Exception {
		// DataOutputStream은 직접 파일을 output으로 생성하지 못하므로
		// FileOutputStream과 같은 스트림객체를 이용해서 작업해야만 한다.
		FileOutputStream fos = new FileOutputStream("src/chap14/data/dos.txt");
		DataOutputStream dos = new DataOutputStream(fos); //원시데이터와 직접 연결 안된다.  
		
		dos.writeInt(100);
		dos.writeDouble(10.5);
		dos.writeUTF("문자열");
		
		fos.close();
		dos.close();
		
	}

}
