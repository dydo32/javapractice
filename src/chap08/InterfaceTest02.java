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
class Test extends AA implements C, B{ //extends ����
	
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
			//instanceof�����ڸ� �̿��ؼ� ��ü�� Ÿ���� �˻�
			if(myobj instanceof AA){
				System.out.println("AA�� ����");
			}
			if(myobj instanceof A){
				System.out.println("A�� ����");
			}
			if(myobj instanceof B){
				System.out.println("B�� ����");
			}
			if(myobj instanceof C){
				System.out.println("C�� ����");
			}
			/*if(myobj instanceof CC){				->�˻������ȵ�.
				System.out.println("CC�� ����");
			}*/
	}
}
