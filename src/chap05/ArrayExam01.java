package chap05;

import java.util.Scanner;

//�⺻�� �迭�� ����, ����, �ʱ�ȭ
public class ArrayExam01 {

	public static void main(String[] args) {
		//int�� �迭���� myarr���� 100,200,300�� �Ҵ��ϰ�
		//2��° ����� ���� ����ϱ�
		int[] myarr = new int[] {100, 200, 300};
		System.out.println(myarr[1]);
		
		//int�� �迭 myarr2�� �����ϰ� Scanner�� �̿��ؼ� �Է¹��� ���� 3����  �ʱⰪ���� ����
		int[] myarr2 = new int[3];
		Scanner scn = new Scanner(System.in);
		System.out.print("����1: ");
		myarr2[0] = scn.nextInt();
		System.out.print("����2: ");
		myarr2[1] = scn.nextInt();
		System.out.print("����3: ");
		myarr2[2] = scn.nextInt();
		System.out.println(myarr2[2]);
	}

}
