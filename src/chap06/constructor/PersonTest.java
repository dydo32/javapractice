package chap06.constructor;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1);
		p1.setName("장동건");
		p1.setAge(45);
		p1.setAddr("서울");

		System.out.println("성명: "+p1.getName());
		System.out.println("나이: "+p1.getAge());
		System.out.println("주소: "+p1.getAddr());
	}

}
