package chap06;
/*
	3.IfExam03.java�ۼ��ϱ�
	  gender�� age�� �������� �߻����� ���ϱ� 
	  gender  1,3: ����
			  2,4: ����
	  age�� 1���� 100���� ������
			age: 20�̻� ����
			     20�̸� û�ҳ�
	  ex) age=22, gender=4,2 : ���ο���(22,4)
		  age=11, gender=2,4 : û�ҳ⿩��
		  age=23, gender=1,3 : ���γ���
		  age=13, gender=1,3 : û�ҳⳲ��
	  �Ϸ� �� �����ϱ�.
*/
import java.util.Random;

public class IfExam03{
	public static void main(String[] args) {
		Random rand = new Random();
		int age = rand.nextInt(100)+1;
		int gender = rand.nextInt(4)+1;
		
		MyMethodUtil myutil = new MyMethodUtil();
		myutil.getGenderData(age, gender);
	}
}
