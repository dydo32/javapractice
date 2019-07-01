package ans.chap09;
import java.io.IOException;
public class Ch09_Exam05{
	public static void main(String[] args) {
		System.out.print("Input ch : ");
		char ch = 0;
		try {
			ch = (char) System.in.read();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			if (!(ch >= 'A' && ch <= 'Z')) {
				throw new MyException();
			}
		} catch (MyException m1) {

			System.out.println(m1.getMessage());
			System.out.println(ch + "를 대문자로 변경 ");
			ch -= 32;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("ch=" + ch);

	}

}
