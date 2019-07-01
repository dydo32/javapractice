package ans.chap09;

public class Ch09_Exam03 {

	public static void prn() throws Exception  {
		throw new Exception("예외가 발생!!");
	}

	public static void main(String[] args) {	

		try {
			prn();
		} catch (Exception e) {
			System.out.println("예외가 발생되어 처리합니다 " + e);
		}

	}

}
