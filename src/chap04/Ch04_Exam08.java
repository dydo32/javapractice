package chap04;

import java.util.Random;

/*4-8. 50���� ���� ���
 * [����]
 * 1) 1-100 ������ ���� ��� �ǰ� �Ѵ�.
 * 2) 1�߿� 6���� ǥ���Ѵ�.
 * [���� ���]
 * 18	11	4	27	55	6
 * 62	86	84	89	82	57
 * ...
 * 41	32
 * ��:____
 */
public class Ch04_Exam08 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		Random rand = new Random();
		
		for (int i = 1; i <= 50; i++) {
			num = rand.nextInt(100) + 1;
			sum = sum + num;
			System.out.print(num + "\t");
			if (i % 6 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("��: " + sum);
	}
}
