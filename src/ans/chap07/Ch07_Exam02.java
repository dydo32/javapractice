package ans.chap07;

class Parent {
	String name;

	public Parent() {
		System.out.println("###인적사항###");
	}

	public Parent(String name) {
		this();
		this.name = name;

	}

	public void printView() {
		System.out.println("이름 : " + name);
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
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + tall);
	}
}

public class Ch07_Exam02 {
	public static void main(String[] args) {
		Child c1 = new Child("Dominico", 23, 183);
		c1.printAll();
	}

}