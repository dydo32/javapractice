package chap04;

public class ForTest01 {
	public static void main(String[] args) {
		int count=1;
		for(int i=1; i<=5; i++){  //i�� for ���ȿ� �ִ� ��������, ���� ������ �޸𸮿��� ������
			System.out.println("�ڹ����α׷���:"+count);
			count++;
		}
		System.out.println("******************************");
		
		for(int i=10; i<=14; i++){
			System.out.println("�ڹ����α׷���:"+i);
		}
		System.out.println("******************************");
		
		for(int i=5; i>=1; i--){
			System.out.println("�ڹ����α׷���:"+i);
		}
		System.out.println("******************************");
	}
}
