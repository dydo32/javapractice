package chap14;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

//byte단위 입력을 위한 클래스의 상위클래스
//키보드로 입력한 단어를 읽어서 리턴하는 작업
public class InputStreamReaderTest {
	public static void main(String[] args) {
		InputStream myin = System.in;		//바이트단위 입출력 -> 한글이 깨짐(한글:2바이트) 	
		PrintStream myout = System.out;		//따라서 문자열단위 입출력으로 바꾼다.
		
		try {
			while(true){
				int data = myin.read();
				if(data == 13){	//13, 엔터누르면 종료
					break;
				}
				myout.print((char) data); // 아스키코드로 보여서 캐릭터로 캐스팅
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
