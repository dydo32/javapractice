package chap04;
/*
	2.IfExam02.java�ۼ��ϱ�
	  jumsu�� count������ int�� �����ϰ� �������� �����մϴ�.
	  jumsu -> 1���� 100���� (�Ǳ�����)
	  count -> 1���� 3���� (����Ƚ��)

	  - ������ 60�� �̻��̸� "���"���
	  - 60�� �̸��� ��� ����Ƚ���� 3�� �̸��̸� "�����"���
	  - ����Ƚ���� 3���̸� "�ʱ���� �ٽ�" ���

	  �Ϸ� �� �����ϱ�.
*/
import java.util.Random;

public class IfExam02{
	public static void main(String[] args) {
		Random rand = new Random();
		int jumsu = rand.nextInt(100)+1;
		int count = rand.nextInt(3)+1;

		System.out.println("�Ǳ�����=>"+jumsu+", ����Ƚ��=>"+count);
		if(jumsu>=60){
			System.out.println("���");
		} else{
			if(count<3){
				System.out.println("�����");
			}
			else{
				System.out.println("�ʱ���� �ٽ�");
			}
		}
	}
}
