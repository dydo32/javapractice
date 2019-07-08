package chap09;

import java.io.FileInputStream;
import java.util.Scanner;

//Exception이 발생하는 경우

class Super{
	
}
class Sub extends Super{
	
}
public class ExceptionTest01 {
	public static void main(String[] args) {
		//***********개발자가 실수할 수 있는 부분***********
		System.out.println("****프로그램시작****");
		//1.
		//0으로 나누는 경우 - ArithmeticException
		//System.out.println(10/0);
		
		//2.
		//배열의 index의 잘못된 참조 - ArrayIndexOutOfBoundsException
		//System.out.println(args[0]);
		
		//3.
		String str = null;
		//null인 객체를 참조하려고 하는 경우 - NullPointerException
		//str.length();
		
		//4.
		Super obj = new Super();
		//잘못된 객체의 casting - ClassCastException
		//Sub obj2 =(Sub)obj;
		
		//5.
		Scanner key = new Scanner(System.in);
		System.out.print("숫자입력: ");
		//사용자의 잘못된 입력 - InputMismatchException
		int num = key.nextInt();
		
		/*
		 * 	외부요인이나 개발자의 실수로 발생하는 예외도 있음
		 * 	API에서 예외처리를 문법적으로 요구하는 경우
		 * 	RuntimeException의 하위 Exception이 아닌 경우에는 반드시 문법적으로 예외처리를 한다.
		 * 	예외처리를 하지 않으면 문법적으로 예외처리를 하도록 오류를 발생시킨다.
		 */
		//FileInputStream f1 = new FileInputStream("test.txt");
		//Integer.parseInt("100");
		//new String().getBytes("test");
	}
}
