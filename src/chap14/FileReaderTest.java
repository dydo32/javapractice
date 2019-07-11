package chap14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//파일로부터 데이터를 읽어서 모니터에 출력 
//파일열기, 파일액세스, 파일닫기 - 3단계로 작업
public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			fr = new FileReader("src/chap14/data/test.txt");//파일열기
			while(true){
				int data = fr.read();	//파일액세스
				if(data == -1){
					break;
				}
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) fr.close();		//파일닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
