package chap09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ThrowsTest02 {
	public void test() throws ArithmeticException{	//��������� ǥ��
		System.out.println(10/0);
	}
	public void test2() throws ArithmeticException, FileNotFoundException {
		test();
		FileInputStream fis = new FileInputStream("test"); //RuntimeException�� ������ �ƴϳĿ� ���� ������ ����
	}
	
	public void test3() throws ArithmeticException, FileNotFoundException, 
								UnknownHostException, IOException {
		test2();
		Socket socket = new Socket("127.0.0.1", 12345);
	}
	public void test4() throws ArithmeticException,IOException{
		test2();
		Socket socket = new Socket("127.0.0.1", 12345);
	}
	public static void main(String[] args) {
		
	}
}
