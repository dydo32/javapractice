package ans.chap07;

class A {
	public A() {
		System.out.println("������ A");
	}

	public A(int x) {
		System.out.println("������ A : " + x);
	}
}

class B extends A {
	public B(int x) {
		System.out.println("������ B : " + x);
	}
}

public class Ch07_Exam01 {
	public static void main(String[] args) {
		A a = new A(10);
		B b = new B(11);
	}
}
