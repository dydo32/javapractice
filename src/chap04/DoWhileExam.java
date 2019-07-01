package chap04;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		//숫자를 입력받아서 처리 - Scanner를 이용
		//입력받은 숫자가 10이상이면 다시 숫자를 입력받도록 처리
		//10미만이면 "입력성공"을 출력한 후 프로그램이 종료
		
		Scanner key = new Scanner(System.in);
		int num = 0;
		
		do{
			System.out.print("숫자를 입력하세요: ");
			num = key.nextInt();
		}while(num >= 10);
		
		System.out.println("입력완료");
	}

}
