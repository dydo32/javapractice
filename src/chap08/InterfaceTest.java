package chap08;
/*
 * 	<<인터페이스>>
 * 	 =>	추상메소드만 보관하는 특별한 클래스
 * 	 	인터페이스를 사용하는 목적은 다형성을 적용할 수 있으며 다중상속과 동일하게 구현이 가능하다.
 * 	1. 인터페이스는 interface키워드를 이용해서 정의
 * 	2. 인터페이스는 추상메소드만 정의하는 클래스
 * 		- 하위클래스에서 상속한 후 오버라이딩할 때 자동으로 public이 추가되므로
 * 		    정의할때는 public abstract은 생략이 가능하다.
 * 	3. 클래스가 인터페이스를 상속받을 때는 implements를 이용해서 상속(구현)->실체화한다.(realization)		//cf)extends 클래스 상속(generation)
 * 	4. 인터페이스가 인터페이스를 상속받을 때는 extends를 이용.
 * 	5. 인터페이스끼리는 다중상속이 가능 - 여러 개의 인터페이스를 ,로 연결해서 동시에 상속할 수 있다.
 * 	6. 클래스가 인터페이스를 상속하는 경우 다중 상속이 가능 즉, 여러 개의 인터페이스를 ,로 연결해서 동시에 상속이 가능.
 * 	7. 클래스와 인터페이스를 동시에 상속하는 경우 클래스의 상속을 인터페이스 상속보다 먼저 정의한다.(InterfaceTest02.java)
 * 	      즉, extends를 implements보다 먼저 정의해야 한다. 
 */
interface SuperInterA{
	void show();
}
interface InterA extends SuperInterA{
	void test();
	void display();
}
interface InterB{
	void test2();
}
interface InterC extends InterA, InterB{
	void test3();
}

class TestA implements InterA, InterB{
	@Override
	public void show() {
		// TODO Auto-generated method stub
	}
	@Override
	public void test2() {
		// TODO Auto-generated method stub
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
	}
	
}
public class InterfaceTest {
	public static void main(String[] args) {
	
	}
}
