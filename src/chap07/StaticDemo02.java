package chap07;
//�޼ҵ� �տ� static�� �߰��Ǵ� ���
public class StaticDemo02 {
	int num;
	static int staticNum;
	
	public static void test(){ //Ŭ���� �޼ҵ�
		//1. static�޼ҵ忡�� static�޼ҵ带 ȣ�� - �Ϲ����� ������� ���� ����
		show();
		System.out.println("test: "+staticNum);
	}
	public void display(){
		//2. non-static�޼ҵ忡�� static�޼ҵ带 ȣ��
		show();
		System.out.println("dispaly: "+num);
	}
	public void change(){
		//3. non-static�޼ҵ忡�� non-static�޼ҵ带 ȣ�� - �Ϲ����� ������� ���� ����
		display();
		System.out.println("change");
	}
	public static void show() {
		//4. static�޼ҵ忡�� non-static�޼ҵ带 ȣ�� - �ȵ�
		//play();  //non-static�� ��� ��ü�� �÷�����ϹǷ� 
		System.out.println("show");
	}
	public void play(){}

}
