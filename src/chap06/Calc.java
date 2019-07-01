package chap06;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("********미니계산기********");
		System.out.println("1.더하기");
		System.out.println("2.곱하기");
		System.out.println("3.빼기");
		System.out.println("4.나누기");
		System.out.print("연산자를 선택하세요.: ");
		int opr = key.nextInt();

		if(opr<=0 | opr>4){
			System.out.println("잘못입력");
			//System.exit(0); //정상 종료
		}else{
			System.out.print("숫자를 입력하세요.: ");
			int num1 = key.nextInt();
			int num2 = key.nextInt();
			
			MyMethodUtil myutil = new MyMethodUtil();
			int result = myutil.calc(opr,num1,num2);
			System.out.println("계산결과=>"+result); //switch문의 케이스에 만족하지않는 경우 result가 초기화가 되지 않을수있다.
		}
	}
}
