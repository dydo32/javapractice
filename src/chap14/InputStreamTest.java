package chap14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

//Ű����� �Է��� �ܾ �о �����ϴ� �۾�	- ���ڴ���(�ѹ���, �ѹ���)
public class InputStreamTest {

	public static void main(String[] args) {
		InputStreamReader myin = new InputStreamReader(System.in);
		PrintStream myout = System.out;

		try {
			while (true) {
				int data = myin.read();
				if(data == 13){		//13, ���ʹ����� ����
					break;
				}
				myout.print((char)data); 	// �ƽ�Ű�ڵ�� ������ ĳ���ͷ� ĳ����
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
