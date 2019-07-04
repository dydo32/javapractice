package chap08;
interface A{
	
}
interface B{
	
}
interface C extends A{
	
}
class AA{
	
}
class BB{
	
}
class Test extends AA implements C, B{ //extends 먼저
	
}
class CC{
	
}
public class InterfaceTest02 {
	public static void main(String[] args) {
			AA obj = new Test();
			A obj2 = new Test();
			B obj3 = new Test();
			C obj4 = new Test();
			Test myobj = new Test();
			//instanceof연산자를 이용해서 객체의 타입을 검사
			if(myobj instanceof AA){
				System.out.println("AA의 하위");
			}
			if(myobj instanceof A){
				System.out.println("A의 하위");
			}
			if(myobj instanceof B){
				System.out.println("B의 하위");
			}
			if(myobj instanceof C){
				System.out.println("C의 하위");
			}
			/*if(myobj instanceof CC){				->검사조차안됨.
				System.out.println("CC의 하위");
			}*/
	}
}
