package chap04;

import java.util.Scanner;

/*1.
 *  ForExam01.java
 * 	Scanner�� �̿��Ͽ� ���� �Է¹��� �� �Է¹��� ���� �������� ���
 *  [�������]
 *  ��:7
 *  7*1 = 7
 *  ...
 *  7*9 = 63
 */
public class ForExam01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("������ ���� �Է��ϼ���.");
		System.out.print("��: ");
		int num = key.nextInt();
		
		int result = 0;
		for(int i=1; i<=9; i++){
			result = num*i;
			System.out.println(num+"*"+i+" = "+result);  //(dan*i)�ᵵ ��
		}
	}

}
