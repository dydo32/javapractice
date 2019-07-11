package chap14;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

//byte���� �Է��� ���� Ŭ������ ����Ŭ����
//Ű����� �Է��� �ܾ �о �����ϴ� �۾�
public class InputStreamReaderTest {
	public static void main(String[] args) {
		InputStream myin = System.in;		//����Ʈ���� ����� -> �ѱ��� ����(�ѱ�:2����Ʈ) 	
		PrintStream myout = System.out;		//���� ���ڿ����� ��������� �ٲ۴�.
		
		try {
			while(true){
				int data = myin.read();
				if(data == 13){	//13, ���ʹ����� ����
					break;
				}
				myout.print((char) data); // �ƽ�Ű�ڵ�� ������ ĳ���ͷ� ĳ����
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
