package chap09;

import java.util.InputMismatchException;
import java.util.Scanner;

//����ó������ - try~catch~catch...
//=> catch���� �������� �����ϰ� ����ϴ� ���� ����
//��, ���� Exception�� ���� ó���� �� �Ʒ��ʿ��� ó���ϵ��� �Ѵ�.

public class ExceptionTest04 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		// ���ܹ߻����ɼ��� �ִ� �ڵ�
		try {
			System.out.println("start");
			System.out.println("���ڸ� �Է��ϼ���");
			int num1 = key.nextInt();
			System.out.println("���ڸ� �Է��ϼ���");
			int num2 = key.nextInt();
			System.out.println("���==>" + (num1 / num2));
			System.out.println("����");
		} catch (ArithmeticException e) {
			System.out.println("�����߻�");
		} catch (InputMismatchException e) {
			System.out.println("���ڰ� �Էµƽ��ϴ�. ���ڸ� �Է��ϼ���.");
		} catch (Exception e) {
			System.out.println("��Ÿ �ٸ� �Ϲ����� ����");
		}
	}

}
