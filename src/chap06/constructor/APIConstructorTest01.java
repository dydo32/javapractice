package chap06.constructor;

import java.io.File;
import java.io.FileInputStream;

//API의 생성자 메소드 확인
public class APIConstructorTest01 {
	public static void main(String[] args) throws Exception {
		byte[] data = {65,66,67,68,69,70};
		char[] data2 = new char[] {'0','1','0','-','7','7','7','7'};
		
		//String클래스를 사용하는 경우 다양한 타입의 입력데이터를 문자열로 만들기 위해서
		//String클래스를 생성할 때 초기화 할 수 있도록 다양한 타입의 생성자가 오버로딩되어 있다.
		String str1 = new String(data);
		String str2 = new String(data2);
		String str3 = new String(data2,4,4);
		String str4 = new String("java");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		String fileName = "test.txt";
		FileInputStream fi = new FileInputStream(fileName); //fileName대신 그냥 "test.txt 써도 된다.
		System.out.println((char)fi.read()); 
		
		File f = new File("test.txt");
		System.out.println(f.getName());
	}
}

