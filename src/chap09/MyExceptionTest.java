package chap09;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		
		if(num%2==1){
			//예외상황 - 사용자 정의 예외를 발생시킨다.
			try{
				throw new MyException();		// 예외 발생 가능성이 있는 코드
			}catch(MyException e){				// 반드시 try~catch로 처리하거나
				System.out.println(e.getMessage());	// 메소드인 경우는 throws로 호출하는 곳에서
				e.printStackTrace();			// 처리하도록 할 수 있다.
			}
		}else{
			//정상상황
			System.out.println("입력받은 숫자=>" + num);
		}
	}

}
