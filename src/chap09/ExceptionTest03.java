package chap09;

import java.util.Scanner;

//����ó������ - try-catch
public class ExceptionTest03 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//���ܹ߻����ɼ��� �ִ� �ڵ�
		try{
			System.out.println("start");
			System.out.println("���ڸ� �Է��ϼ���");
			int num1 = key.nextInt();
			System.out.println("���ڸ� �Է��ϼ���");
			int num2 = key.nextInt();
			System.out.println("���==>"+(num1/num2));
			System.out.println("����");
		}catch(Exception e){
			System.out.println("���ܹ߻�");
			//���ܰ�ü�� �����ϴ� �������� e�� �̿��ؼ� ���ܰ�ü�� �޼ҵ带 ����� �� �ִ�.
			System.out.println("���ܸ޽���=>"+e.getMessage());
			//���߽ÿ� ���� ���� ����ϴ� �޼ҵ� - ����Ŭ������ �̿��ؼ� �۾��ϴ� ���
			//					  - ������ �����ؼ� � Ŭ������ � �޼ҵ�
			//					  - �� �� ���ο��� ������ �߻��ߴ��� ���
			e.printStackTrace();
		}
	}

}
