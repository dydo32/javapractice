package chap06.constructor;

public class MyConstructorTest {
	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();	
		obj.setName("장동건");
		obj.print();

		MyConstructor obj2 = new MyConstructor("이민호", "lee", "1234"); //setName했으면 3번 불러야했음 -> 1번만 부를수있다.
		obj2.print();
		
		MyConstructor obj3 = new MyConstructor("이민호", "lee", "서울","010","751111","jjang"); //호출순서
	}
}
