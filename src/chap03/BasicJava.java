package chap03;

public class BasicJava {
	public static void main(String[] args) {
		int num1 = 100; // num1�̶�� ������ �����ϰ� 100�� �Ҵ��ض�
		System.out.println("num1");
		System.out.println(num1);
		System.out.println("num1=>" + num1);

		/*
		 * �����ٷ� ǥ���ϴ� �ּ���
		 */

		// num2��� ������ �����ϰ� 200�� �Ҵ��� �Ŀ� num2�� ���� ���
		int num2 = 200;
		System.out.println("num2=>"+num2);

		//num1�� num2�� ���ؼ� ���� ����� result������ ������ �Ŀ� ���
		//������
		/*
		 * ���ϱ� : +
		 * ���� : -
		 * ���ϱ� : *
		 * ������ : / (��)
		 * 		 % (������)
		 */
		
		int result = num1 + num2;
		System.out.println("result=>"+result);
	}
}
