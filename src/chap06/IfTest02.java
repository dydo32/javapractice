package chap06;
//
import java.util.Random;
public class IfTest02{
	public static void main(String[] args) {
		//num�̶�� �������� �߻���Ű�� ���� 90�̻��̸� �հ����
		//90�̸��̸� ���հ� ���
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		System.out.println(num);
		
		MyMethodUtil myutil = new MyMethodUtil();
		myutil.scoreCheck(num);
	}
}
