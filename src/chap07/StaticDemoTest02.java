package chap07;

public class StaticDemoTest02 {
	public static void main(String[] args) {
		//static�޼ҵ忡�� non-static�޼ҵ带 ȣ���ϴ� ���
		//���� Ŭ������ ����Ǿ� �־ ����ϱ� ���ؼ��� ��ü������ �ؼ� ����ؾ� �Ѵ�.
		StaticDemoTest02 obj = new StaticDemoTest02();
		obj.display();
		
		StaticDemo02 obj2 = new StaticDemo02();
		obj2.display();	//�ܺο��� �����ϴ� ���, non-static�޼ҵ�� ���������� �׼��� 
		StaticDemo02.test(); //�ܺο��� �����ϴ� ���, static�޼ҵ�� Ŭ�����̸����� �׼���
	}
	public void display(){
		System.out.println("static�޼ҵ忡�� non-static�޼ҵ� ȣ���ϴ� ��");
	}
}
