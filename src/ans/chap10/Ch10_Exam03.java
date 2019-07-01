package ans.chap10;

public class Ch10_Exam03 {
	public static void main(String[] args) {
		String str = " The String class represents character strings. ";
		System.out.println("1. str��  ��ü�� char �迭�� ���  ��������" + "  ���\n");
		char[] res = getChar(str);
		for (char r : res) {
			System.out.printf("%c", r);
		}
		System.out.println("\n\n  2. str����  �빮�ڸ� ��� ");
		PrintUpper(str);

		System.out.println("\n 3. str���� �빮���� ����, " + "  �ҹ����� ���� ���");
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

		System.out.println("\n\n �ҹ��� ���� " + lower_count);
		System.out.println("\n\n �빮�� ���� " + upper_count);
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
