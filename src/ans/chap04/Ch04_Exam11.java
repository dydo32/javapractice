package ans.chap04;

public class Ch04_Exam11 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 8; j++) {
				System.out.print(j + 1 + "*" + i + "=" + i * (j + 1) + "\t");
			}
			System.out.print("\n");
		}
	}
}

