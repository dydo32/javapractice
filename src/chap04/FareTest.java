package chap04;

import java.util.Scanner;

//������� ���α׷�
public class FareTest {
	public static void main(String[] args) {
		int menu = 0;
		int use = 0;
		int useTotal;
		int liter = 0;
		double total = 0;
		Scanner key = new Scanner(System.in);

		System.out.println("----Menu------------");
		System.out.println("1. ������ (liter�� 50��)");
		System.out.println("2. ����� (liter�� 45��)");
		System.out.println("3. ������ (liter�� 30��)");
		System.out.println("--------------------");
		System.out.println("�޴��� �����ϼ���=>");
		System.out.println("--------------------");
		menu = key.nextInt();
		System.out.println("��뷮�� �Է��ϼ���=>");
		use = key.nextInt();

		switch (menu) {
		case 1:
			liter = 50;
			break;
		case 2:
			liter = 45;
			break;
		case 3:
			liter = 30;
			break;
		}
		useTotal = use * liter;
		total = useTotal + useTotal*0.05; 
		System.out.println("====================");
		System.out.println("����� �ڵ�: " + menu);
		System.out.println("��� ���: " + useTotal); // �����= ��뷮*���ʹ簡��
		System.out.println("�Ѽ��� ���: " + total); // �Ѽ��� ���= ���������+����(����� 5%)
		System.out.println("====================");
	}

}
