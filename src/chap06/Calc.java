package chap06;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("********�̴ϰ���********");
		System.out.println("1.���ϱ�");
		System.out.println("2.���ϱ�");
		System.out.println("3.����");
		System.out.println("4.������");
		System.out.print("�����ڸ� �����ϼ���.: ");
		int opr = key.nextInt();

		if(opr<=0 | opr>4){
			System.out.println("�߸��Է�");
			//System.exit(0); //���� ����
		}else{
			System.out.print("���ڸ� �Է��ϼ���.: ");
			int num1 = key.nextInt();
			int num2 = key.nextInt();
			
			MyMethodUtil myutil = new MyMethodUtil();
			int result = myutil.calc(opr,num1,num2);
			System.out.println("�����=>"+result); //switch���� ���̽��� ���������ʴ� ��� result�� �ʱ�ȭ�� ���� �������ִ�.
		}
	}
}
