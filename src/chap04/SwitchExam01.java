package chap04;
/*
 2. ���ϴ� ���� �������ڷ� �߻���Ų �� 12, 1, 2�� "�ܿ�"
    3,4,5�̸� "��" 6,7,8�̸� "����" 9,10,11 "����" 
    SwitchExam01.java
*/
import java.util.Random;

public class SwitchExam01{
	public static void main(String[] args){
		Random rand = new Random();
		int month = rand.nextInt(12)+1;

		System.out.println(month+"��");

		switch (month){
			case 12:
			case 1:
			case 2: 
				System.out.println("�ܿ�");
				break;
			case 3:
			case 4:
			case 5: 
				System.out.println("��");
				break;

			case 6:
			case 7:
			case 8: 
				System.out.println("����");
				break;

			case 9:
			case 10:
			case 11: 
				System.out.println("����");
				break;		
		}
	}
}
