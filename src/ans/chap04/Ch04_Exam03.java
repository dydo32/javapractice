package ans.chap04;

public class Ch04_Exam03 {

	public static void main(String[] args) {

		double sum = 0;
		for (int i = 1; i <= 9; i++) {

			sum += i / (i + 1.0);
			System.out.print(i + "/" + (i + 1));
			if (i == 9) {
				System.out.print("=");
			} else {
				System.out.print("+");
			}
		}
		System.out.println(sum);
	}
}

