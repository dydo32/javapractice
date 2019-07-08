package chap09;
//try~catch~finally
//=> 오류가 발생하거나 하지 않거나 상관없이 반드시 실행해야하는 명령문은 finally 블럭안에 선언하고 사용한다.
public class ExceptionTest05 {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println("프로그램시작");
			System.out.println(str.length());
			System.out.println("프로그램종료");
		} catch (NullPointerException e) {
			System.out.println("오류발생");
		} finally {
			System.out.println("***********반드시 실행될 문장***********");
		}

	}

}
