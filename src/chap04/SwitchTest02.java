package chap04;
//if else if�� ǥ���ߴ� �ڵ带 switch�� ����
import java.util.Random;

public class SwitchTest02{
	public static void main(String[] args) {
		Random rand = new Random();
		int ssn = rand.nextInt(5)+1; //������ �ֹι�ȣ 7��° ����
		
		System.out.println(ssn);

		switch(ssn){ //ssn�� ���� ���� ����� ����
					 //or ����� or �޼ҵ�ȣ�⹮�� ������ �� ����
			case 1:
			case 3:	//case���� �̿��ؼ� ssn�� ��
					//case���� ������ ���� ��Ȯ�ϰ� ��ġ�ϴ� �� ��
				System.out.println("����");
				break;
			case 2:
			case 4:
				System.out.println("����");
				break;
			default: //if�� else����
				System.out.println("��Ÿ");
		}
	}
}
