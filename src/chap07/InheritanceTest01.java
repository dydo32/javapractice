package chap07;
/*
 * 	<<상속관계에서 멤버변수가 갖는 특징>>
 * 1. 상속관계에서는 상위클래스에 선언된 멤버변수를 하위클래스에서 접근이 가능하다.
 * 2. 상위클래스에서 선언된 변수와 동일한 이름의 변수가 하위클래스에 선언되어 있다면
 * 	     부모클래스의 멤버변수보다 하위클래스의 멤버변수가 우선 순위가 높다.
 * 	  => 자식클래스의 멤버변수로 인식
 * 3. 하위 클래스에서 상위클래스의 멤버변수를 접근하고 싶은 경우에는 super를 이용해서 접근한다.
 * 	  this => 자기자신의 객체를 지칭
 * 	  super => 부모객체
 * 4. 상위클래스의 멤버가 private인 경우에는 하위클래스라고 하더라도 접근할 수 없다.
 */
class Super{
	int num = 100;
}
class Sub extends Super{
	int num = 1000;
	public void display(){
		System.out.println("num=>"+num);			//Sub클래스에 직접 정의되어 있지 않음
		System.out.println("super.num=>"+super.num);//Sub클래스가 상속하는 Super클래스에 정의 되어 있지만
	}												//마치 Sub클래스에 정의 되어 있는 것 처럼 사용할 수 있다.
													//위의 정리는 Sub에 num이 정의되지 않은 상태일 때
}
public class InheritanceTest01 {

	public static void main(String[] args) {
			Sub obj = new Sub();
			obj.display();
			System.out.println(obj.num);
	}

}
