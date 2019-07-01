package chap04;

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
			int result = 0; //블럭안에 선언되는 변수는 로컬변수이며 로컬변수는 반드시 초기값을 준다.
		
			switch(opr){
				case 1: 
					result = num1+num2;
					break;
				case 2: 
					result = num1*num2;
					break;
				case 3:                            
					result = num1-num2;                                                                      
					break;
				case 4: 
					result = num1/num2;
					break;
			}
			System.out.println("계산결과=>"+result); //switch문의 케이스에 만족하지않는 경우 result가 초기화가 되지 않을수있다.
		}
	}
}
