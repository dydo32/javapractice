package ans.chap09;

public class Ch09_Exam01 {

	public static void main(String[] args) {
		float f = 0.0f;
		try {
			f = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(f);
	}

}
