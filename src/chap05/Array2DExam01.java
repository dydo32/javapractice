package chap05;

//2차원 배열 연습
/*
* 1		2	3	4	5
* 6		7	8	9	10
* 11	12	13	14	15
* 16	17	18	19	20
* 21	22	23	24	25
*/
public class Array2DExam01 {

	public static void main(String[] args) {
		// 1. 2차원배열을 선언하고 위의 그림과 같이 1부터 25까지 각 배열에 값을 할당
		// 2. 위의 그림처럼 출력하세요
		int[][] myarr = new int[5][5];
		int num = 1;
		for (int i = 0; i < myarr.length; i++) {
			for (int j = 0; j < myarr[i].length; j++) {
				myarr[i][j] = num;
				num++;
			}
		}
		// 값을 출력하는 for
		for (int i = 0; i < myarr.length; i++) {
			for (int j = 0; j < myarr[i].length; j++) {
				System.out.print(myarr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
