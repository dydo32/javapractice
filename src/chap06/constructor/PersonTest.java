package chap06.constructor;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1);
		p1.setName("�嵿��");
		p1.setAge(45);
		p1.setAddr("����");

		System.out.println("����: "+p1.getName());
		System.out.println("����: "+p1.getAge());
		System.out.println("�ּ�: "+p1.getAddr());
	}

}
