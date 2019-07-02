package chap07;

final class AA {
	public final void display() {
		System.out.println("상위의 display");
	}
}

class BB extends AA { 		// AA클래스는 final클래스이므로 상속을 받을 수 없다.
	public void display() { // 부모가 갖고 있는 display를 재정의(오버라이딩)
							// display는 final메소드이므로 오버라이딩 할 수 없다.
		System.out.println("하위의 display");

	}
}

public class FinalTest {
	int num = 1000; //일반변수
	static final int START_CODE = 2000; // 상수, 약속: 상수는 대문자로
	public void chang() {
		num = 1;
		START_CODE = 200; // 상수는 값을 변경할 수 없다.
	}
}
