package chap04;
////if ~ else��
import java.util.Random;
public class IfTest02{
	public static void main(String[] args) {
		//num�̶�� �������� �߻���Ű�� ���� 90�̻��̸� �հ����
		//90�̸��̸� ���հ� ���
		Random rand = new Random();
		int num = rand.nextInt(100)+1;

		System.out.println(num);
		if (num>=90){
			System.out.println("�հ�");
		}
		else{
			System.out.println("���հ�");
		}
	}
}
