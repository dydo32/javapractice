package chap04;

import java.util.Random;

//if else if�� ǥ���ߴ� �ڵ带 switch�� ����
public class SwitchTest01 {
	public static void main(String[] args) {
		Random rand = new Random();
		int ssn = rand.nextInt(5)+1; //������ �ֹι�ȣ 7��° ����
		
		System.out.println(ssn);
		switch(ssn){	//ssn�� ���� ���� ����� ����
		case 1:			//or ����� or �޼ҵ�ȣ�⹮�� ������ �� ����
			System.out.println("����");	//case���� �̿��ؼ� ssn�� ��
			break;						//case���� ������ ���� ��Ȯ�ϰ� ��ġ�ϴ� �� ��
		case 2 :
			System.out.println("����");
			break;
		case 3:
			System.out.println("����");
			break;
		case 4 :
			System.out.println("����");
			break;
		default : 	//if�� else����
			System.out.println("��Ÿ");
		}
	}
}
