package chap06;

public class PersonTest {
	public static void main(String[] args) {
		Person_Before p1 = new Person_Before();
		System.out.println(p1);
		p1.name = "�嵿��";
		p1.age = 45;
		p1.addr = "����";

		System.out.println("����: "+p1.name);
		System.out.println("����: "+p1.age);
		System.out.println("�ּ�: "+p1.addr);
		System.out.println("��ȭ��ȣ: "+p1.telNum); //���������� �ʱ�ȭ ���� ������ ������ ������
												//��������� �ʱⰪ�� ������ �ִ�. �׷��� �ʱ�ȭ�����ʾƵ� ��
		
		System.out.println("=======================================");
		Person_Before p2 = new Person_Before();
		System.out.println(p2);
		p2.name = "�輭��";
		p2.age = 25;
		p2.addr = "��õ";
		p2.telNum = "010";

		System.out.println("����: "+p2.name);
		System.out.println("����: "+p2.age);
		System.out.println("�ּ�: "+p2.addr);
		System.out.println("��ȭ��ȣ: "+p2.telNum);
		
	}
}
