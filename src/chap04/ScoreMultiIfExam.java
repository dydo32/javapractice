package chap04;
//if~else if...else... - ���� if��

/*
	4. ScoreMultifIfExam.java
	   1���� 120������ �������� �̿��ؼ� ������ ���
	   90~100: A����
	   80~89 : B����
	   70~79 : C����
	   60~69 : D����
	   1~59	 : F����
	   ��, 1���� �۰� 100���� ū ���� �ԷµǸ� �߸��Է��̶�� �޽����� ���

	   ����
*/
import java.util.Random;

public class ScoreMultiIfExam{
	public static void main(String[] args) {
		Random rand = new Random();
		int score = rand.nextInt(120)+1;

		System.out.println("score=>"+score);
		if(score<1 | score>100){
			System.out.println("�߸��Է�");
		} else if(score>=90){
			System.out.println("A����");
		} else if(score>=80){
			System.out.println("B����");
		} else if(score>=70){
			System.out.println("C����");
		} else if(score>=60){
			System.out.println("D����");
		} else {
			System.out.println("F����");
		}
	}
}
