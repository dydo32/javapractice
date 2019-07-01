package ans.chap11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Ch11_Exam10 {
	public static String convert(Calendar date, int type) {

		SimpleDateFormat df = null;

		switch (type) {
		case 1: {
			df = new SimpleDateFormat("yyyy- MM- dd");
			String today = df.format(date.getTime());
			return today;
		}
		case 2: {
			df = new SimpleDateFormat("yy�� M�� d�� E����");
			String today = df.format(date.getTime());
			return today;

		}

		case 3: {
			df = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss�� a");
			String today = df.format(date.getTime());
			return today;
		}
		}
		return null;

	}

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(" ���� ��¥ ��� ������  Ÿ���� ���ÿ� ");

		System.out.println(" Type 1. 2016- 02- 11");
		System.out.println("Type 2. 16�� 2�� 11�� �����");
		System.out.println("Type 3. 2016-2-11	16 : 56 : 24  ����");

		Scanner sc = new Scanner(System.in);
		System.out.print("���� (1,2,3) : ");
		int type = sc.nextInt();

		System.out.println(convert(today, type));
	}
}
