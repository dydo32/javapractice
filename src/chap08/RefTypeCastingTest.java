package chap08;
//객체의 형변환 - 상속관계에 있는 경우에만 형변환이 가능하다.
class Parent{
	String name = "장동건";
	public void display(){
		System.out.println("super의 display");
	}
}
class Child extends Parent{
	String name = "이민호";
	public void display(){	//오버라이딩된 메소드
		System.out.println("sub의 display");
	}
	public void show(){
		System.out.println("show");
	}
}

public class RefTypeCastingTest {
	public static void main(String[] args) {
		System.out.println("1. super타입의 참조변수로 super객체를 접근");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		System.out.println("***********************************");
		
		System.out.println("2. sub타입의 참조변수로 sub객체를 접근 ");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		System.out.println("***********************************");
		
		/*
		 * 	객체의 형변환
		 * 	Sub객체는 자동으로 Super타입으로 변환된다.
		 *  => 참조형의 형변환은 상속관계에 있는 경우 상위타입의 변수가 하위객체를 참조하는 경우 
		 *     자동으로 형변환이 일어난다.
		 *     부모타입 변수 = new 자식객체()
		 *     
		 *     1)오버라이딩된 메소드가 있는 경우 무조건 오버라이딩된 메소드가 인식된다.
		 *     2)오버라이딩된 메소드를 빼면 무조건 참조변수의 타입을 기준으로 액세스
		 *     	
		 */
		
		System.out.println("3. super타입의 참조변수로 sub객체를 접근 ");
		Parent obj3 = new Child();	//2) Parent꺼만 볼 수 있다.(참조변수 타입기준 액세스)
		obj3.display();				//오버라이딩된 메소드가 있으면 오버라이딩된 메소드가 인식됨.
		System.out.println(obj3.name);
		
		//obj3은 부모타입으로 형변환이 되었지만 실제 생성된 객체는 하위객체이므로 
		//명시적으로 하위타입으로 캐스팅해서 접근할 수 있다.
		((Child)obj3).show(); 	//obj3를 바꿔주는 것이므로 괄호 한번 더  
		System.out.println("***********************************");
		
		System.out.println("4. sub타입의 참조변수로 super객체를 접근----X(안된다) ");
		/*
		 *	obj4는 형변환을 할 수 없다. Parent를 Child로 변환해야 하는데 
		 *	Parent에 Child의 요소가 없으므로 변환할 수 없다.
		 *
		 */
		//Child obj4=new Parent(); 
		//obj4.display();		
		//System.out.println(obj4.name);
		System.out.println("***********************************");
		
		//명시적으로 캐스팅하면 컴파일러는 속일 수 있으나 (단, 상속관계에 있는 경우에만 가능)
		//obj1이 참조하는 객체가 Parent객체이므로 Child의 정보가 없어서 캐스팅을 못한다.
		System.out.println("5. sub타입의 참조변수 = super객체를 참조하는 super타입의 변수----X(안된다)");
		// Child obj5 = (Child)obj1;
		System.out.println("***********************************");
		
		System.out.println("6. sub타입의 참조변수 = sub객체를 참조하는 super타입의 변수----O(된다.)");
		Child obj6=(Child)obj3;
		System.out.println(obj6.name);
		System.out.println("***********************************");
		
		System.out.println("참조형의 형변환은 3번과 6번만된다.");
	}
}
