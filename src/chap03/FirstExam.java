package chap03;
public class FirstExam{
	public static void main(String[] args){
		//num1�� num2�� ���� ����(100,31)
		//�� ������ ����� ���(+,-,*,/,%)
		//ex) "���ϱ�=>131" �� �������� ���� ����ϼ���
		int num1 = 100;
		int num2 = 31;
		int result = 0; //ó������ ������� ���� ������ 0���� �ʱ�ȭ.(���������� �ʱⰪ�� ������ �ȵ�)

		result = num1 + num2;
		System.out.println("���ϱ�=>"+result);

		result = num1 - num2;
		System.out.println("����=>"+result);

		result = num1 * num2;
		System.out.println("���ϱ�=>"+result);

		result = num1 / num2;
		System.out.println("������,��=>"+result);

		result = num1 % num2;
		System.out.println("������,������=>"+result);
	}
}