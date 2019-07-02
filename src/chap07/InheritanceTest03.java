package chap07;
/*
 *	<<상속관계에서 생성자의 특징>>
 *	1. 모든 클래스의 모든 생성자의 첫 번째 문장은 부모의 기본 생성자를 호출하는 호출문이 생략되어 있다.
 *	   => 부모의 생성자를 호출하는 방법은 super()
 *		  super()는 부모의 기본 생성자
 *	   => 단, 이미 this()를 이용해서 자신의 객체에 정의되어 있는 다른 생성자를 호출하는 경우는 예외
 *	2. 모든 클래스의 최상위 클래스는 java.lang.Object클래스이다.
 *	   => 자바에서 객체가 갖는 공통의 특징을 Object에 정의해 놓고 컴파일러를 통해 자동으로 상속받도록한다.
 *		  (단, 상속하고 있는 클래스가 없는 경우 - 자바는 하나의 클래스만 상속할 수 있으므로)
 * 	   => 자동으로 추가된 상위클래스인 Object도 메모리에 할당되어야 하므로 모든 생성자에 첫 번째 문장에 
 * 		  super가 생략
 *	3. 부모클래스에 정의되어 있는 멤버변수의 값을 셋팅해야 하는 경우 부모에 정의 되어 있는 매개변수있는 생성자를 호출해서 정의한다.
 *	        매개변수있는 생성자를 호출해서 정의한다.
 *	   super(매개변수1, 매개변수2...) 
 */
class SuperA extends Object{
	private String name;
	SuperA(){
		
	}
	SuperA(String name){
		super();
		this.name = name;
		System.out.println("부모클래스의 생성자");
	}
	public String getName(){
		return name;
	}
}
class SubA extends SuperA{	// 앞에 public쓰면 안된다.
	int age;
	String addr;
	SubA(){
		System.out.println("자식클래스의 생성자");
	}
	SubA(String name, int age, String addr){
		super(name);
		this.age = age;
		this.addr = addr;
	}
	public void display(){
		System.out.println("name="+getName()+", age="+age+", addr="+addr);
	}
}

public class InheritanceTest03 {
	public static void main(String[] args) {
		SubA obj = new SubA("장동건",40,"서울");
		obj.display();
	}
}
