package chap01;

import java.util.Random;

/*RandomŬ������ nextInt()�޼ҵ带 �̿��ؼ� ��������
������ ���� ����ϼ���(���������� rand)
[�������]
������=>____
*/
public class APIExam {
	public static void main(String[] args) {
		Random rand = new Random();
		int val = rand.nextInt();
		System.out.println("������=>"+val);

		//��������
		int val2 = rand.nextInt(100)+1; //0~�����Ѽ��ڻ��̿��� �����ε� 0 ����, 
										//�����Ѽ��ڴ� ������������
										//1���ͳ����� ���ֱ� ���ؼ� +1
		System.out.println("1~100������ ������=>"+val2);
	}
}
