package ans.chap05;

public class Ch05_Exam03 {
	public static void main(String[] irgs) {

		char[] ch = new char[26];

		for (int i = 0, b = 65; i < 26; i++, b++) {
			 ch[i] = (char) b;
		}

		for (int i = 0; i < ch.length; i++) {
			System.out.printf("%2c", ch[i]+32);
		}
		System.out.println();
	}
}
