package chap06;

public class CallByTest {
	public static void main(String[] args) {
		int num = 10;
		int[] myarr = { 100, 200, 300, 400, 500 };
		System.out.println("*****changeȣ����*****");
		display(num, myarr);
		
		change(num, myarr);
		System.out.println();
		System.out.println("*****changeȣ����*****");
		display(num, myarr);
		
	}
	// ���� �����ϴ� �޼ҵ�
	private static void change(int num, int[] myarr) {
		num = 20;
		myarr[1] = 7777777;
	}
	// ���� ����ϴ� �޼ҵ�
	public static void display(int num, int[] myarr){ // static������ main���� ȣ�����->7�忡�����
		System.out.println("�⺻��(int) �Ű����� num==>" + num);
		System.out.println("������(int[]) �Ű����� myarr");
		for (int i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i] + "\t");
		}
		System.out.println();
	}
}
