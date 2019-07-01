package ans.chap10;

public class Ch10_Exam03 {
	public static void main(String[] args) {
		String str = " The String class represents character strings. ";
		System.out.println("1. str을  전체를 char 배열에 담아  역순으로" + "  출력\n");
		char[] res = getChar(str);
		for (char r : res) {
			System.out.printf("%c", r);
		}
		System.out.println("\n\n  2. str에서  대문자만 출력 ");
		PrintUpper(str);

		System.out.println("\n 3. str에서 대문자의 개수, " + "  소문자의 개수 출력");
		PrintCount(str);
	}
	private static char[] getChar(String str) {

		char[] original_word = str.toCharArray();

		char[] reverse_word = new char[str.length()];

		for (int i = str.length() - 1, j = 0; i > 0; i--, j++) {
			reverse_word[j] = original_word[i];
		}
		return reverse_word;

	}

	private static void PrintCount(String str) {
		char[] original_word = str.toCharArray();

		int upper_count = 0;
		int lower_count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(original_word[i])) {
				upper_count++;
			}
			if (Character.isLowerCase(original_word[i])) {
				lower_count++;
			}
		}

		System.out.println("\n\n 소문자 개수 " + lower_count);
		System.out.println("\n\n 대문자 개수 " + upper_count);
	}

	private static void PrintUpper(String str) {

		char[] original_word = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			if (Character.isUpperCase(original_word[i])) {
				System.out.printf("%c", original_word[i]);
			}
		}

	}
}
