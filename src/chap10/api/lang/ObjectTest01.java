package chap10.api.lang;

import java.util.Date;
import java.util.Random;

public class ObjectTest01 {

	public static void main(String[] args) {
		Object obj1= new Object();
		
		System.out.println(obj1.getClass());	// 클래스정보
		System.out.println(obj1.hashCode());	
		System.out.println(obj1.toString());	// 객체참조값
		System.out.println(obj1);	 // 객체참조값
		
		Person p = new Person();
		String s = new String("java");
		System.out.println(p);// Person의 경우 toString()을 오버라이딩 하지않았음
		System.out.println(s);
		
		Object obj2 = new Object();
		System.out.println(obj2);
		System.out.println(obj2.toString());
		
		Random rand = new Random();
		System.out.println(rand);
		System.out.println(rand.toString());
		

		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());
		
	}
}
