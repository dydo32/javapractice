package chap14;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		// 파일 출력은 기본이 덮어쓰기.
		// 생성자에 true를 지정하면 append모드를 활성화시키는 것
		//FileWriter fw = new FileWriter("src/chap14/data/output.txt");
		FileWriter fw = new FileWriter("src/chap14/data/output2.txt",true);
		fw.write(97);
		fw.write("안녕~~~~~~\n");
		fw.write("test");
		fw.close();
	}
}
