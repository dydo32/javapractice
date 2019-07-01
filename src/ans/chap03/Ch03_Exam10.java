package ans.chap03;

public class Ch03_Exam10 {

	public static void main(String[] args) {

		int f = 200;

		float c = (5 / 9.f * (f - 32)) * 1000 % 10 >= 5 ?

		(int) (((5 / 9.f * (f - 32)) * 100) + 1) / 100.f :

		(int) ((5 / 9.f * (f - 32)) * 100) / 100.f;

		System.out.println("È­¾¾ : " + f);
		System.out.println("¼·¾¾ : " + c);

	}

}
