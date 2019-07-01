package ans.chap05;

public class Ch05_Exam05 {
	public static void main(String[] args) {

		int[] num = new int[10];
		int sum = 0;

		System.out.println("[정렬전]");


		for (int i = 0; i < num.length - 1; i++) {
			num[i] = (int) (Math.random() * 10) + 1;
			System.out.printf("%3d", num[i]);
			sum += num[i];
		}
		num[9] = sum;

		System.out.println();
		
		for (int i = 0; i < num.length - 2; i++) {
			for (int k = 0; k < num.length - 2; k++) {
				int temp = num[k];
				int temp_ = num[k + 1];
				if (num[k] > num[k + 1]) {
					num[k] = temp_;
					num[k + 1] = temp;
				}
			}
		}

		System.out.println("[정렬후]");
		for (int i = 0; i < num.length - 1; i++) {
			System.out.printf(" %3d", num[i]);
			if (i == 8) {
				System.out.printf("=%3d", num[i + 1]);
			} else {
				System.out.printf(" +", num[i]);
			}
		}
		System.out.println();

	}

}
