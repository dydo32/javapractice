package chap10.api.lang;

public class ObjectTest02 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		if(obj1 == obj2){	//주소비교
			System.out.println("같다. ");
		}else{
			System.out.println("다르다.");
		}
		
		if(obj1.equals(obj2)){	//Object클래스의 equals는 주소의 비교
			System.out.println("같다.");
		}else{
			System.out.println("다르다.");
		}
	}
}
