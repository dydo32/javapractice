package chap08;

public abstract class Sender {
	String name;

	Sender(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// public void send(){ } -> 이렇게 써도 되지만 자바의 특성을 살려 개발하자.
	// 상위타입에 존재해야 접근가능, 그리고 하위 클래스는 이 메소드를 오버라이딩 해야함.
	public abstract void send();
}
