package chap03;
//�񱳿�����(��ġ��) - true�� false�� ����� ����
public class OprTest02 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		int num3 = 100;
		//num1�� +�����ڿ� ���ؼ� ���ڿ�ȭ �ǹǷ� >������ �� �� ����.
		//=> ������ �켱������ ���ؼ� +������ ���� ����Ǿ�
		//num1>num2==>100�̶�� ���ڿ��� 200�� ���ϹǷ� ���� �� ����. ��ȣ���������
		System.out.println("num1>num2==>"+(num1>num2));
		System.out.println("num1>=num2==>"+(num1>=num2));
		System.out.println("num1<num2==>"+(num1<num2));
		System.out.println("num1<=num2==>"+(num1<=num2));
		System.out.println("num1==num3==>"+(num1==num3));
		System.out.println("num1!=num3==>"+(num1!=num3));
	}
}
