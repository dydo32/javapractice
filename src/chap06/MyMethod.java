package chap06;

//���� ������ �޼ҵ带 �����ϰ� ȣ���غ��� ����
public class MyMethod {
	// 4. �Ű������� �ְ� ����Ÿ���� �ִ� �޼ҵ�
	public int add(int num1, int num2){
		int result = 0;
		result = num1+num2;
		
		return result; //�Ǵ� return num1+num2;
	}
	
	// 2. �Ű������� �ְ� ����Ÿ���� ���� �޼ҵ�
	public void display(String str) { // �޼ҵ� �����ε�(�޼ҵ���� ������), ������� ���Ǹ� ���ؼ�.
		for (int i = 1; i <= 10; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	// 3. �Ű����� ������ �ְ�, ����Ÿ���� ���� �޼ҵ�
	public void display(String str, int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print(str);
		}
		System.out.println();
	}

	// 1. �Ű������� ���� ����Ÿ�Ե� ���� �޼ҵ�
	// => *�� 10�� ����ϴ� ����� �޼ҵ�
	public void display() { // ()�� �޼ҵ����� �����ϱ����� + �Ű������� ����
		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
