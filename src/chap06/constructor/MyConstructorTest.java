package chap06.constructor;

public class MyConstructorTest {
	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();	
		obj.setName("�嵿��");
		obj.print();

		MyConstructor obj2 = new MyConstructor("�̹�ȣ", "lee", "1234"); //setName������ 3�� �ҷ������� -> 1���� �θ����ִ�.
		obj2.print();
		
		MyConstructor obj3 = new MyConstructor("�̹�ȣ", "lee", "����","010","751111","jjang"); //ȣ�����
	}
}
