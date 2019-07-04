package chap08;
/*
 *	추상클래스
 *	=> 미완성된 클래스 즉, 모든 내용이 구현되어 있지 않은 클래스로 완성되지 않았으므로 객체를 생성할 수 없다.
 *						-----------------
 *							내용이 정의되지 않은 메소드를 갖고 있는 클래스
 *								|_추상메소드(body가 없는 메소드)
 *	1) 추상메소드를 선언하는 방법
 *	      접근제어 abstract 리턴타입 메소드명(매개변수list...);
 *	   => 추상메소드를 정의하면 클래스도 미완성된 클래스 즉, 추상클래스가 되므로 클래스 선언부에도
 *		  abstract을 추가해야 한다.
 *	2) 추상클래스의 특징
 *		- 일반메소드와 추상메소드를 모두 정의 할 수 있다.
 *		- 추상메소드가 하나라도 정의된 클래스는 추상클래스이므로 abstract을 클래스 선언부에 추가한다.
 *		- 추상클래스는 객체 생성을 할 수 없다.
 *		- 추상클래스를 상속받은 클래스는 에러가 발생한다.
 *		    에러가 왜? => Sub가 Super를 상속받으면 Super의 모든 멤버가 Sub의 소유가 된다.
 *					  그러므로 Sub또한 추상클래스가 된다.
 *		  [해결방법]
 *		  1. abstract을 하위 클래스의 선언부에 추가한다.
 *		  2. abstract클래스인 상위클래스가 갖고 있는 추상메소드를 오버라이딩한다.
 */
 abstract class Super{
	public void test(){
		System.out.println("test()");
	}
	public abstract void display();	//미완성된메소드를 가지고 있으므로, Super도 미완성된 클래스
									//왜 사용? 다형성을 위해서
}
 class Sub extends Super{
	@Override		//설명문역할
	public void display() {
		
	}
 }

public class AbstractTest {
	public static void main(String[] args) {
		// Super obj = new Super(); 	//추상클래스는 객체 생성을 할 수 없다.
	}
}
