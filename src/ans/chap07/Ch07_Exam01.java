package ans.chap07;

class A {
	public A() {
		System.out.println("持失切 A");
	}

	public A(int x) {
		System.out.println("持失切 A : " + x);
	}
}

class B extends A {
	public B(int x) {
		System.out.println("持失切 B : " + x);
	}
}

public class Ch07_Exam01 {
	public static void main(String[] args) {
		A a = new A(10);
		B b = new B(11);
	}
}
