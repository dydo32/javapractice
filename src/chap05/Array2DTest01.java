package chap05;

//2차원배열 정의하고 액세스
//=>자바에서 다차원배열은 배열을 참조하는 배열
public class Array2DTest01 {
	public static void main(String[] args) {
		int[][] myarr = new int[3][2];
		myarr[0][0] = 100;
		myarr[1][0] = 100;
		myarr[2][0] = 100;

		for (int outer = 0; outer < 3; outer++) {
			for (int inner = 0; inner < 2; inner++) {
				System.out.print(myarr[outer][inner] + "\t");
			}
			System.out.println();
		}
		System.out.println("배열의길이=>" + myarr.length);
		System.out.println("배열의길이=>" + myarr[0].length);
		System.out.println("배열의길이=>" + myarr[1].length);
		System.out.println("배열의길이=>" + myarr[2].length);
	}
}
