package ans.chap11;

import java.util.Calendar;
import java.util.Scanner;

public class Ch11_Exam07 {

	public static void main(String[] args) {		

		Scanner scan = new Scanner(System.in);
		System.out.print("year : ");
		String year = scan.next();
		System.out.print("month : ");
		String month = scan.next();
		
		Calendar c = Calendar.getInstance(); // Calendar ��ü ����
		// set�޼ҵ带 ���� ���� �� �� �� ����
		c.set(Calendar.YEAR, Integer.valueOf(year));
		c.set(Calendar.MONTH, Integer.valueOf(month) - 1); // ���� ���� 1�� �ƴ� 0����
															// �����Ͽ� 1�� ���ܴϴ�
		c.set(Calendar.DAY_OF_MONTH, 1); // ó�� ���ۿ��ϼ���

		int dayofweek = c.get(Calendar.DAY_OF_WEEK);
		// �� = 1 �� =2 ȭ =3 ..
		c.set(Calendar.DAY_OF_MONTH, 32); // 32 �̻��϶� ������ ���Ϸ� �ڵ� ����
		int lastday = 32 - c.get(Calendar.DAY_OF_MONTH);

		int i = 0;

		System.out.println("��\t��\tȭ\t��\t��\t��\t��");

		for (; i < dayofweek - 1; i++) {
			System.out.print("\t");
		}

		for (int day = 1; day <= lastday; day++, i++) {
			if (i % 7 == 0) {
				System.out.println("");
			}
			System.out.print(day + "\t");
		}
	}

}
