package chap09;

import java.util.Scanner;

//예외처리구문 - try-catch
public class ExceptionTest03 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//예외발생가능성이 있는 코드
		try{
			System.out.println("start");
			System.out.println("숫자를 입력하세요");
			int num1 = key.nextInt();
			System.out.println("숫자를 입력하세요");
			int num2 = key.nextInt();
			System.out.println("결과==>"+(num1/num2));
			System.out.println("종료");
		}catch(Exception e){
			System.out.println("예외발생");
			//예외객체를 참조하는 참조변수 e를 이용해서 예외객체의 메소드를 사용할 수 있다.
			System.out.println("예외메시지=>"+e.getMessage());
			//개발시에 가장 많이 사용하는 메소드 - 여러클래스를 이용해서 작업하는 경우
			//					  - 오류를 추적해서 어떤 클래스의 어떤 메소드
			//					  - 몇 번 라인에서 오류가 발생했는지 출력
			e.printStackTrace();
		}
	}

}
