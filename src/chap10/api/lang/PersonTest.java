package chap10.api.lang;

public class PersonTest {
	public static void show(Person p){
		System.out.println("name="+p.getName()+", age="+p.getAge()+", addr="+p.getAddr());
		System.out.println(p); //toString() �������̵� �Ǿ�����.
	}
	public static void main(String[] args) {
		Person p = new Person("�嵿��",46,"����");
		show(p);
		Person p1 = new Person("�̹�ȣ",30,"����");
		Person p2 = new Person("�̹�ȣ",30,"����");
		show(p1);
		
		if(p.equals(p1)){	
			System.out.println("����.");
			
		}else{
			System.out.println("�ٸ���.");
		}
		
		if(p1==p2){	
			System.out.println("����.");
		}else{
			System.out.println("�ٸ���.");
		}
		
		if(p1.equals(p2)){	
			System.out.println("����.");
		}else{
			System.out.println("�ٸ���.");
		}
	}
}
