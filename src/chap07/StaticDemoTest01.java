package chap07;

public class StaticDemoTest01 {

	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		obj1.display();
		//num은 인스턴스 변수이므로 객체참조변수인 obj1을 이용해서 액세스가 가능하다.
		//staticNum은 객체가 생성될 때마다 객체 내부에 새롭게 만들어지는 변수가 아니라
		//클래스가 처음 메모리에 로딩될때 한 번만 로딩되는 변수이므로 객체의 소유가 될 수 없다.
		//인스턴스변수를 통해서 접근하지 않고
		//모든 static멤버는 무조건 클래스의 이름으로 접근해야 한다.
		System.out.println(obj1.num+","+StaticDemo.staticNum);
		
		StaticDemo obj2 = new StaticDemo();
		obj2.display();
		System.out.println(obj2.num+","+StaticDemo.staticNum);
		
		StaticDemo obj3 = new StaticDemo();
		obj3.display();
		System.out.println(obj3.num+","+StaticDemo.staticNum);
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10)); //절대값
	}

}
