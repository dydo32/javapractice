package chap10.api.lang;

public class PersonTest {
	public static void show(Person p){
		System.out.println("name="+p.getName()+", age="+p.getAge()+", addr="+p.getAddr());
		System.out.println(p); //toString() 오버라이딩 되어있음.
	}
	public static void main(String[] args) {
		Person p = new Person("장동건",46,"서울");
		show(p);
		Person p1 = new Person("이민호",30,"서울");
		Person p2 = new Person("이민호",30,"서울");
		show(p1);
		
		if(p.equals(p1)){	
			System.out.println("같다.");
			
		}else{
			System.out.println("다르다.");
		}
		
		if(p1==p2){	
			System.out.println("같다.");
		}else{
			System.out.println("다르다.");
		}
		
		if(p1.equals(p2)){	
			System.out.println("같다.");
		}else{
			System.out.println("다르다.");
		}
	}
}
