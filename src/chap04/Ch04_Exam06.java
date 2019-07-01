package chap04;

import java.util.Scanner;

/* 4-6. ����ó�����α׷�
 *  [����]
 *  1)�߰����, �⸻���, ����Ʈ, �⼮ ������ �Է¹޾Ƽ� ����Ѵ�.
 *  2)������ �Ʒ��� ���� ������ �ջ� �ϵ� �Ҽ� ���� 2�ڸ����� ����϶�.
 *   a)(�߰�+�⸻)/2 -> 60%
 *   b)����Ʈ -> 20%
 *   c)�⼮ -> 20%
 *  3)������ ����. (if~else if�� �̿�)
 *   a)90�� �̻� 'A'����
 *   b)80�� �̻� 'B'����
 *   c)70�� �̻� 'C'����
 *   d)60�� �̻� 'D'����
 *   e)������ 'F'����
 *  4)�򰡱���(switch�� �̿�)
 *   a)A, B���� -> "excellent"
 *   b)C, D���� -> "good"
 *   c)F���� -> "poor"
 *  5)��� ȭ��
 *   ������ �Է� �ϼ���(�߰����, �⸻���, ����Ʈ, �⼮����) : 90 89 99 100
 *    -----����Դϴ�-----
 *   �߰���� : 90
 *   �⸻��� : 89
 *   �������� : 99
 *   �⼮���� : 100
 *   ���� : 93.20
 *   ���� : A
 *   �� : excellent
 */
public class Ch04_Exam06 {
	public static void main(String[] args) {
		int midterm = 0;
		int finals = 0;
		int report = 0;
		int attend = 0;
		double score = 0;
		char grade;
		String evalu = null;
		Scanner key = new Scanner(System.in);

		System.out.print("������ �Է� �ϼ���(�߰����, �⸻���, ����Ʈ, �⼮����) : ");
		midterm = key.nextInt();
		finals = key.nextInt();
		report = key.nextInt();
		attend = key.nextInt();
		score = (midterm + finals) / 2 * 0.6 + report * 0.2 + attend * 0.2;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else  {
			grade = 'F';
		}
		
		switch(grade){
		case 'A':
		case 'B':
			evalu = "excellent";
			break;
		case 'C':
		case 'D':
			evalu = "good";
			break;
		case 'F':
			evalu = "poor";
			break;
		}

		System.out.println(" -----����Դϴ�-----");
		System.out.println("�߰���� : " + midterm);
		System.out.println("�⸻��� : " + finals);
		System.out.println("�������� : " + report);
		System.out.println("�⼮���� : " + attend);
		System.out.println("���� : " + score);
		System.out.println("���� : " + grade);
		System.out.println("�� : " + evalu);

	}
}
