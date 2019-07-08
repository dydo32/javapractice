package chap09;

public class ExceptionTest02 {
	public static void main(String[] args) {

		try {
			// 예외발생 가능성이 있는 코드
			System.out.println("try start.....");
			//예외가 발생하면 try블럭안의 코드를 더 이상 실행하지 않고 catch블럭으로 넘어간다.
			//(catch블럭이 실행된다.)
			//Exception이 발생하지 않으면 catch블럭은 실행되지 않는다.
			System.out.println(args[0]);
			System.out.println("try end...");
		} catch (Exception e) {
			// 예외가 발생하면 처리할 문장
			System.out.println("예외발생");
		}
	}
}
