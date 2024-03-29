package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

//파일로부터 데이터를 읽어서 모니터에 출력 - byte단위로 읽기
//파일열기, 파일액세스, 파일닫기 - 3단계로 작업
public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		PrintStream myout = System.out;

		try {
			fis = new FileInputStream("src/chap14/data/test.txt"); // 파일열기
			while (true) {
				int data = fis.read(); // 파일 액세스
				if (data == -1) {
					break;
				}
				myout.print((char) data); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close(); // 파일닫기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
