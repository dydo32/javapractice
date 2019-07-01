package ans.chap11;

import java.util.*;

public class Ch11_Exam05 {
	public static void main(String[] args) {
		Vector<Person> v = new Vector<Person>();

		v.addElement(new Person("�з�", 20));
		v.addElement(new Person("������", 23));
		v.addElement(new Person("�縮", 23));
		v.addElement(new Person("�缼", 29));
		
		System.out.println(v);
		
		System.out.println("�����  �߰��� ���");
		v.insertElementAt(new Person("���", 29), 2);
		System.out.println(v);
		
		System.out.println("�������� üĥ���� , 20���� ������  ���");
		v.setElementAt(new Person("üĥ����", 20), 1);
		System.out.println(v);
		System.out.println("üĥ���� ���� ��   ���");
		v.remove(1);
		System.out.println(v);
		System.out.println(" �̸��� �����ؼ� ��� ");

		Enumeration<Person> e = v.elements();
		while (e.hasMoreElements()) {
			Person person = e.nextElement();
			System.out.println("�̸� : " + person.getName());
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
