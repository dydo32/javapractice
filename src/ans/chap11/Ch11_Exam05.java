package ans.chap11;

import java.util.*;

public class Ch11_Exam05 {
	public static void main(String[] args) {
		Vector<Person> v = new Vector<Person>();

		v.addElement(new Person("밀로", 20));
		v.addElement(new Person("폴리오", 23));
		v.addElement(new Person("루리", 23));
		v.addElement(new Person("루세", 29));
		
		System.out.println(v);
		
		System.out.println("루오를  추가후 출력");
		v.insertElementAt(new Person("루오", 29), 2);
		System.out.println(v);
		
		System.out.println("폴리오를 체칠리아 , 20으로 변경후  출력");
		v.setElementAt(new Person("체칠리아", 20), 1);
		System.out.println(v);
		System.out.println("체칠리아 삭제 후   출력");
		v.remove(1);
		System.out.println(v);
		System.out.println(" 이름만 추출해서 출력 ");

		Enumeration<Person> e = v.elements();
		while (e.hasMoreElements()) {
			Person person = e.nextElement();
			System.out.println("이름 : " + person.getName());
		}


	}
}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return "name : " + name + "  age : " + age+"\n";
	}
}
