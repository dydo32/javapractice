package ans.chap05;

public class Ch05_Exam02 {

	public static void main(String[] args) {

		int[] su = { 12, 26, 68, 98, 76, 54, 8, 6, 4 };
		int max = su[0];
		int min = su[0];
		for (int i = 0; i < su.length; i++) {
			if (su[i] > max)
				max = su[i];
			if (su[i] < min)
				min = su[i];
		}
		System.out.printf("최대값 :%d, 최소값 :%d%n", max, min);
	}
}
