package chap04;
/*
	1.IfExam01.java�ۼ��ϱ�
	  �������� �Է¹޾� ����, ����� ���Ͽ� ����մϴ�.
	  ��, ����� ��� ¦��Ȧ���� ���� ���Ͽ� ����մϴ�.
	  ex) -111123
	      -111123�� �����Դϴ�.

		  123458
		  123458�� ����̸� ¦���Դϴ�.

		  123457
		  123457�� ����̸� Ȧ���Դϴ�.
*/
import java.util.Random;

public class IfExam01{
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt();

		System.out.println(num);
		if(num>=0){
			if(num%2==0){
				System.out.println(num+"�� ����̸�, ¦���Դϴ�.");
			} else {
				System.out.println(num+"�� ����̸�, Ȧ���Դϴ�.");
			}
		} else {
			System.out.println(num+"�� �����Դϴ�.");
		}
	}
}
