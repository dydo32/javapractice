package chap06;

import java.util.Scanner;

public class PersonTest_Insa {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******�λ�����ý���******");
		System.out.println("1. ������");
		System.out.println("2. �����ȸ");
		System.out.println("3. �������");
		System.out.println("4. �����������");
		System.out.println("5. ��������ȸ");
		System.out.print("���ϴ� �۾��� �����ϼ���: ");
		int choiceJob = key.nextInt();

		switch (choiceJob) {
		case 1:
			System.out.println("======������======");
			System.out.print("����: ");
			String name = key.next();
			System.out.print("����: ");
			int age = key.nextInt();
			System.out.print("�ּ�: ");
			String addr = key.next();
			System.out.print("��ȭ��ȣ: ");
			String telNum = key.next();

			Person_Before p1 = new Person_Before();
			p1.name = name; //p1.���� ������ name������ Person�� �����ִ� ��������̰�,
							// = �����ʿ� ������ name������ Scanner�� ���ؼ� 
							// �ܺο��� �Է¹��� ���� ������ ���� ��������
							//Scanner�� ���ؼ� �Է¹��� ���� Person�� name �Ӽ��� �����ϰڴٴ� �ǹ�
			p1.age = age;
			p1.addr = addr;
			p1.telNum = telNum;
			System.out.println("����: "+p1.name);
			System.out.println("����: "+p1.age);
			System.out.println("�ּ�: "+p1.addr);
			System.out.println("��ȭ��ȣ: "+p1.telNum);
			break;
		case 2:
			System.out.println("======�����ȸ======");
			break;
		case 3:
			System.out.println("======�������======");
			break;
		}
	}
}
