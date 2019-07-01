package chap06;

public class PersonTest {
	public static void main(String[] args) {
		Person_Before p1 = new Person_Before();
		System.out.println(p1);
		p1.name = "장동건";
		p1.age = 45;
		p1.addr = "서울";

		System.out.println("성명: "+p1.name);
		System.out.println("나이: "+p1.age);
		System.out.println("주소: "+p1.addr);
		System.out.println("전화번호: "+p1.telNum); //지역변수는 초기화 하지 않으면 오류가 나지만
												//멤버변수는 초기값을 가지고 있다. 그래서 초기화하지않아도 됨
		
		System.out.println("=======================================");
		Person_Before p2 = new Person_Before();
		System.out.println(p2);
		p2.name = "김서연";
		p2.age = 25;
		p2.addr = "인천";
		p2.telNum = "010";

		System.out.println("성명: "+p2.name);
		System.out.println("나이: "+p2.age);
		System.out.println("주소: "+p2.addr);
		System.out.println("전화번호: "+p2.telNum);
		
	}
}
