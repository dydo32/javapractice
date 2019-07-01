package ans.chap05;

public class Ch05_Exam04 {
	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 10, 12, 14, 16 };
		int[] b = { 1, 1, 2, 3, 5, 8, 13, 21 };
		for (int i = 0; i < a.length; i++) {
			a[i] += b[b.length - 1 - i];
			System.out.printf("%3d", a[i]);
		}
	}
}
