package chap07;
/*
 *	<<��Ӱ��迡�� �������� Ư¡>>
 *	1. ��� Ŭ������ ��� �������� ù ��° ������ �θ��� �⺻ �����ڸ� ȣ���ϴ� ȣ�⹮�� �����Ǿ� �ִ�.
 *	   => �θ��� �����ڸ� ȣ���ϴ� ����� super()
 *		  super()�� �θ��� �⺻ ������
 *	   => ��, �̹� this()�� �̿��ؼ� �ڽ��� ��ü�� ���ǵǾ� �ִ� �ٸ� �����ڸ� ȣ���ϴ� ���� ����
 *	2. ��� Ŭ������ �ֻ��� Ŭ������ java.lang.ObjectŬ�����̴�.
 *	   => �ڹٿ��� ��ü�� ���� ������ Ư¡�� Object�� ������ ���� �����Ϸ��� ���� �ڵ����� ��ӹ޵����Ѵ�.
 *		  (��, ����ϰ� �ִ� Ŭ������ ���� ��� - �ڹٴ� �ϳ��� Ŭ������ ����� �� �����Ƿ�)
 * 	   => �ڵ����� �߰��� ����Ŭ������ Object�� �޸𸮿� �Ҵ�Ǿ�� �ϹǷ� ��� �����ڿ� ù ��° ���忡 
 * 		  super�� ����
 *	3. �θ�Ŭ������ ���ǵǾ� �ִ� ��������� ���� �����ؾ� �ϴ� ��� �θ� ���� �Ǿ� �ִ� �Ű������ִ� �����ڸ� ȣ���ؼ� �����Ѵ�.
 *	        �Ű������ִ� �����ڸ� ȣ���ؼ� �����Ѵ�.
 *	   super(�Ű�����1, �Ű�����2...) 
 */
class SuperA extends Object{
	private String name;
	SuperA(){
		
	}
	SuperA(String name){
		super();
		this.name = name;
		System.out.println("�θ�Ŭ������ ������");
	}
	public String getName(){
		return name;
	}
}
class SubA extends SuperA{	// �տ� public���� �ȵȴ�.
	int age;
	String addr;
	SubA(){
		System.out.println("�ڽ�Ŭ������ ������");
	}
	SubA(String name, int age, String addr){
		super(name);
		this.age = age;
		this.addr = addr;
	}
	public void display(){
		System.out.println("name="+getName()+", age="+age+", addr="+addr);
	}
}

public class InheritanceTest03 {
	public static void main(String[] args) {
		SubA obj = new SubA("�嵿��",40,"����");
		obj.display();
	}
}
