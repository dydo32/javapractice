package chap09;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외처리구문 - try~catch~catch...
//=> catch블럭을 다중으로 선언하고 사용하는 것이 가능
//단, 상위 Exception에 대한 처리는 맨 아래쪽에서 처리하도록 한다.

public class ExceptionTest04 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		// 예외발생가능성이 있는 코드
		try {
			System.out.println("start");
			System.out.println("숫자를 입력하세요");
			int num1 = key.nextInt();
			System.out.println("숫자를 입력하세요");
			int num2 = key.nextInt();
			System.out.println("결과==>" + (num1 / num2));
			System.out.println("종료");
		} catch (ArithmeticException e) {
			System.out.println("오류발생");
		} catch (InputMismatchException e) {
			System.out.println("문자가 입력됐습니다. 숫자를 입력하세요.");
		} catch (Exception e) {
			System.out.println("기타 다른 일반적인 예외");
		}
	}

}
