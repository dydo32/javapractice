package chap04;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		//���ڸ� �Է¹޾Ƽ� ó�� - Scanner�� �̿�
		//�Է¹��� ���ڰ� 10�̻��̸� �ٽ� ���ڸ� �Է¹޵��� ó��
		//10�̸��̸� "�Է¼���"�� ����� �� ���α׷��� ����
		
		Scanner key = new Scanner(System.in);
		int num = 0;
		
		do{
			System.out.print("���ڸ� �Է��ϼ���: ");
			num = key.nextInt();
		}while(num >= 10);
		
		System.out.println("�Է¿Ϸ�");
	}

}
