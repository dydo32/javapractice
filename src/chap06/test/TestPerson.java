package chap06.test;
import chap06.Person_Before; 	//각 패키지는 기본으로 => 현재패키지+java.lang패키지
						//그래서 다른 패키지에 있는 것 사용하려면 import 
public class TestPerson {
	public static void main(String[] args) {
		Person_Before p1 = new Person_Before();
		//public으로 선언된 p1.name만 (다른 패키지이므로)
	}
}
