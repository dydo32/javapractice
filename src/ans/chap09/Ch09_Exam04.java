package ans.chap09;

public class Ch09_Exam04 {

	public static void main(String[] args) {			
			
			System.out.println ( "실행 시작");
			try {
				int i=0 , j = 100;
				System.out.println ( "j :"+ j);			
				System.out.println ( "j / i :"+ j / i);			
				System.out.println ( "try 블록 종료");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println ( "예외 :"+ e);
				System.out.println ( "인수를 하나 입력하십시오.");
			} catch (NumberFormatException e) {
				System.out.println ( "예외 :"+ e);
				System.out.println ( "인수를 정수로 입력하십시오.");
			} catch (ArithmeticException e) {
				System.out.println ( "예외 :"+ e);
				System.out.println ( "인수를 0이 아닌 정수로 입력하십시오.");
			} catch (Exception e) {
				System.out.println ( "어떤 예외가 발생했습니다.");
				e.printStackTrace ();
			}
			System.out.println ( "실행 종료");
		}
	}

