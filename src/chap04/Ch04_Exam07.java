package chap04;

import java.util.Scanner;

/*4-7. ���,���� ���ϴ� ���α׷�
 * [����]
 * �� ������ ��� �����ؾ� ������
 * 1)�⵵�� 4�� ������ ����������.
 * 2)�⵵�� 100���� ������ �������� �ʰų� �⵵�� 400���� ������ ����������
 * [tip]
 * 4(����), 100(���), 400(����)��.
 * [������]
 * �⵵ �Է� : 2014
 * ���
 * �⵵ �Է� : 2017
 * ���
 * �⵵ �Է� : 4
 * ����
 * �⵵ �Է� :
 */
public class Ch04_Exam07 {
	public static void main(String[] args) {
		int year = 0;
		Scanner key = new Scanner(System.in);

		for (;;) {
			System.out.print("�⵵ �Է� : ");
			year = key.nextInt();
			
			if(year % 4==0){
				if(year % 400 ==0){
					System.out.println("����");
				} else if(year % 100==0){
					System.out.println("���");	
				}else{
					System.out.println("����");
				}
			} else{
				System.out.println("���");
			}
		}
	}
}
