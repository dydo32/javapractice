package chap14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

//키보드로 입력한 단어를 읽어서 리턴하는 작업	- 문자단위(한문자, 한문자)
public class InputStreamTest {

	public static void main(String[] args) {
		InputStreamReader myin = new InputStreamReader(System.in);
		PrintStream myout = System.out;

		try {
			while (true) {
				int data = myin.read();
				if(data == 13){		//13, 엔터누르면 종료
					break;
				}
				myout.print((char)data); 	// 아스키코드로 보여서 캐릭터로 캐스팅
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
