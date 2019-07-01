package chap06;
//정의한 method를 호출하는 방법을 정의
public class MyMethodTest {

	public static void main(String[] args) {
		MyMethod m = new MyMethod();
		System.out.println("업무시작.....");
		System.out.println("작업1...");
		//1. 메소드의 호출 - 매개변수없고 리턴타입 없는 메소드의 호출
		m.display(); //호출한 값을 변수등을 통해서 받는 작업 없음 -> 리턴타입없다, ()안에 없다 -> 매개변수 없다
		System.out.println("작업2...");
		m.display(); //for문 2번 쓸 필요 없음
		
		//2. 매개변수가 1개이고, 리턴값이 없는 메소드의 호출
		m.display("♬");
		m.display("♪");
		
		//3. 매개변수가 여러 개인 메소드의 호출 (리턴값이 없는 메소드의 호출) - 매개변수가 여러 개인 경우 ','로 구분해서 값을 지정하며
		//	 반드시 선언된 순서와 동일하게 값을 지정해야 한다.
		m.display("▤",20);
		m.display("▥",5);
		
		//4. 매개변수가 있고 리턴값이이 있는 메소드
		//	 리턴타입과 같은 타입의 변수를 선언해서 리턴값을 저장한다.
		int data = m.add(100, 200);
		System.out.println("add메소드의 호출결과=>"+data);
		
		//리턴값을 갖고 있는 메소드는 다른 메소드의 매개변수로 바로 전달할 수 있다.
		System.out.println(m.add(200, 300));
	}

}
