package chap07;
/*
 *  <<상속관계에서 메소드가 갖는 특징>>
 *  1. 상위클래스에 정의된 메소드를 하위클래스에서 호출할 수 있다.
 *     => 하위클래스의 참조변수를 통해서도 상위클래스의 메소드 호출이 가능하다.
 *  2. 상위클래스에 정의된 메소드와 동일한 메소드를 하위클래스에서 정의하여 호출하는 경우
 *     하위클래스의 메소드가 인식된다.
 *     => 상위클래스의 메소드와 메소드 선언부를 동일하게 하여 메소드를 정의하는 것을 메소드 재정의라 한다.
 *     	    즉, 메소드 오버라이딩이라 한다.
 *     		 ----------
 *     => 메소드를 오버라이딩 하는 경우 반드시 메소드 선언부(리턴타입, 매개변수 갯수, 매개변수 타입)가 
 *     	    상위클래스와 동일해야 한다.
 *  3. super를 이용하면 오버라이딩된 부모의 메소드를 접근할 수 있다.
 */
class Parent{
	public void display(){
		System.out.println("부모클래스의 display()");
	}
}
class Child extends Parent{
	public void test(){
		System.out.println("자식클래스의 test()");
		display();
		super.display();
	}
	public void display(){ 	//부모의 메소드를 재정의했다.(메소드 오버라이딩) 이 경우, 
							//이름과 매개변수 모두 같아야한다. 오버라이딩된 메소드가 먼저 인식된다.
		System.out.println("자식클래스의 display()");
	}
}
public class InheritanceTest02 {
	public static void main(String[] args){
		Child obj = new Child();
		obj.test();
		obj.display();
	}
}
