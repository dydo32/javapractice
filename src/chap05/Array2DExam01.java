package chap05;

//2���� �迭 ����
/*
* 1		2	3	4	5
* 6		7	8	9	10
* 11	12	13	14	15
* 16	17	18	19	20
* 21	22	23	24	25
*/
public class Array2DExam01 {

	public static void main(String[] args) {
		// 1. 2�����迭�� �����ϰ� ���� �׸��� ���� 1���� 25���� �� �迭�� ���� �Ҵ�
		// 2. ���� �׸�ó�� ����ϼ���
		int[][] myarr = new int[5][5];
		int num = 1;
		for (int i = 0; i < myarr.length; i++) {
			for (int j = 0; j < myarr[i].length; j++) {
				myarr[i][j] = num;
				num++;
			}
		}
		// ���� ����ϴ� for
		for (int i = 0; i < myarr.length; i++) {
			for (int j = 0; j < myarr[i].length; j++) {
				System.out.print(myarr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
