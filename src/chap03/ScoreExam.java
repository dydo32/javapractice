package chap03;
/*
	1. ScoreExam.java�ۼ�
	- kor, eng, math������ ����
	- ������ ������ �Ҵ�
	- �� ������ �հ�� ����� ������ ���� ����ϼ���
	[�������]
	��ü ���հ�=>_____
	���=>____
*/

public class ScoreExam{
	public static void main(String[] args) {
		int kor = 100;
		int eng = 70;
		int math = 90;
		int sum = 0;
		int avg = 0;

		sum = kor + eng + math;
		avg = sum/3;

		System.out.println("��ü ���հ�=>"+sum);
		System.out.println("���=>"+avg);
	}
}
