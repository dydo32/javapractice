package chap06.constructor;

import java.io.File;
import java.io.FileInputStream;

//API�� ������ �޼ҵ� Ȯ��
public class APIConstructorTest01 {
	public static void main(String[] args) throws Exception {
		byte[] data = {65,66,67,68,69,70};
		char[] data2 = new char[] {'0','1','0','-','7','7','7','7'};
		
		//StringŬ������ ����ϴ� ��� �پ��� Ÿ���� �Էµ����͸� ���ڿ��� ����� ���ؼ�
		//StringŬ������ ������ �� �ʱ�ȭ �� �� �ֵ��� �پ��� Ÿ���� �����ڰ� �����ε��Ǿ� �ִ�.
		String str1 = new String(data);
		String str2 = new String(data2);
		String str3 = new String(data2,4,4);
		String str4 = new String("java");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		String fileName = "test.txt";
		FileInputStream fi = new FileInputStream(fileName); //fileName��� �׳� "test.txt �ᵵ �ȴ�.
		System.out.println((char)fi.read()); 
		
		File f = new File("test.txt");
		System.out.println(f.getName());
	}
}

