package chap09;

import java.io.FileInputStream;
import java.util.Scanner;

//Exception�� �߻��ϴ� ���

class Super{
	
}
class Sub extends Super{
	
}
public class ExceptionTest01 {
	public static void main(String[] args) {
		//***********�����ڰ� �Ǽ��� �� �ִ� �κ�***********
		System.out.println("****���α׷�����****");
		//1.
		//0���� ������ ��� - ArithmeticException
		//System.out.println(10/0);
		
		//2.
		//�迭�� index�� �߸��� ���� - ArrayIndexOutOfBoundsException
		//System.out.println(args[0]);
		
		//3.
		String str = null;
		//null�� ��ü�� �����Ϸ��� �ϴ� ��� - NullPointerException
		//str.length();
		
		//4.
		Super obj = new Super();
		//�߸��� ��ü�� casting - ClassCastException
		//Sub obj2 =(Sub)obj;
		
		//5.
		Scanner key = new Scanner(System.in);
		System.out.print("�����Է�: ");
		//������� �߸��� �Է� - InputMismatchException
		int num = key.nextInt();
		
		/*
		 * 	�ܺο����̳� �������� �Ǽ��� �߻��ϴ� ���ܵ� ����
		 * 	API���� ����ó���� ���������� �䱸�ϴ� ���
		 * 	RuntimeException�� ���� Exception�� �ƴ� ��쿡�� �ݵ�� ���������� ����ó���� �Ѵ�.
		 * 	����ó���� ���� ������ ���������� ����ó���� �ϵ��� ������ �߻���Ų��.
		 */
		//FileInputStream f1 = new FileInputStream("test.txt");
		//Integer.parseInt("100");
		//new String().getBytes("test");
	}
}
