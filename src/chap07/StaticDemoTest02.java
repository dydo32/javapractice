package chap07;

public class StaticDemoTest02 {
	public static void main(String[] args) {
		//static메소드에서 non-static메소드를 호출하는 경우
		//같은 클래스에 선언되어 있어도 사용하기 위해서는 객체생성을 해서 사용해야 한다.
		StaticDemoTest02 obj = new StaticDemoTest02();
		obj.display();
		
		StaticDemo02 obj2 = new StaticDemo02();
		obj2.display();	//외부에서 접근하는 경우, non-static메소드는 참조변수로 액세스 
		StaticDemo02.test(); //외부에서 접근하는 경우, static메소드는 클래스이름으로 액세스
	}
	public void display(){
		System.out.println("static메소드에서 non-static메소드 호출하는 것");
	}
}
