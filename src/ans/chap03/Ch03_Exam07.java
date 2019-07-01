package ans.chap03;

public class Ch03_Exam07 {

	public static void main(String[] args) {
	int su = 27890;
	System.out.println("오른쪽에서 8번째 비트   : " + ((su >> 7) & 1));
	System.out.println("오른쪽에서 9번째 비트   : " + ((su >> 8) & 1));

	}
}
