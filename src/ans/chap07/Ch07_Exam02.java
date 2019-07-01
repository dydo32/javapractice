package ans.chap07;

class Parent {
	String name;

	public Parent() {
		System.out.println("###��������###");
	}

	public Parent(String name) {
		this();
		this.name = name;

	}

	public void printView() {
		System.out.println("�̸� : " + name);
	}
}

class Child extends Parent {
	int age;
	float tall;

	public Child(String name, int age, float tall) {
		super(name);
		this.age = age;
		this.tall = tall;
	}

	public void printAll() {
		super.printView();
		System.out.println("���� : " + age);
		System.out.println("���� : " + tall);
	}
}

public class Ch07_Exam02 {
	public static void main(String[] args) {
		Child c1 = new Child("Dominico", 23, 183);
		c1.printAll();
	}

}