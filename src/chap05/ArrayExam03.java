package chap05;

//����2 - �迭�� ����� ��� ������ �հ� ����� ���ϱ�
//[�������]
//����:___
//���:___
public class ArrayExam03 {

	public static void main(String[] args) {
		int[] myarr = { 98, 88, 78, 100, 98, 56 };
		int total = 0;
		int avg = 0;

		for (int i = 0; i < myarr.length; i++) {
			total = total + myarr[i];
		}
		avg = total / myarr.length;

		System.out.println("����: " + total);
		System.out.println("���: " + avg);

	}
}
