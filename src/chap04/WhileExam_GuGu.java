package chap04;

import java.util.Scanner;

/*1.
 *  WhileExam01.java
 * 	Scanner�� �̿��Ͽ� ���� �Է¹��� �� �Է¹��� ���� �������� ���
 *  [�������]
 *  ��:7
 *  7*1 = 7
 *  ...
 *  7*9 = 63
 */
public class WhileExam_GuGu {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("������ ���� �Է��ϼ���.");
		System.out.print("��: ");
		 
		int dan = key.nextInt();
		int i = 1;
		int result = 0;
		while(i<=9){
			result = dan * i;
			System.out.println(dan + "*" + i + " = " + result);
			i++;
		}
	}
}
