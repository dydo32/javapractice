package chap05;
//�迭����ϱ� - 1. �迭�� �����ϰ� �����ϰ� �ʱ�ȭ�ϱ�
public class ArrayTest01 {
	public static void main(String[] args) {
		// 1. 3���� int�� �����͸� ������ �� �ִ� �迭�� ����
		// 	=>3���� int�� �����͸� ������ �� �ִ� �迭�� �����ϴ� ���������� ����
		int[] myarr;
		// 2. 3���� int�� �����͸� �����ϴ� �迭�� ����
		myarr = new int[3];
		System.out.println("�迭�� �����ϴ� ����=>"+myarr);
		//myarr���������� �����ϴ� �迭�� 0������� ���� 100���� �ٲٶ�� �ǹ�
		myarr[0]=100; //set
		// myarr�̶�� ���������� �����ϴ� �迭�� 0�� ����� ���� �����ͼ� sysout���� ����ض�.
		System.out.println(myarr[0]); //get
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		// 5���� double�� �����͸� ������ �� �ִ� �迭 ����� ���� ���ÿ�
		double[] myarr2 = new double[5];
		System.out.println("�迭�� �����ϴ� ����=>"+myarr2);
		System.out.println(myarr2[0]);
		System.out.println(myarr2[1]);
				
	}
}
