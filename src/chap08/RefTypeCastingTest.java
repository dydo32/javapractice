package chap08;
//��ü�� ����ȯ - ��Ӱ��迡 �ִ� ��쿡�� ����ȯ�� �����ϴ�.
class Parent{
	String name = "�嵿��";
	public void display(){
		System.out.println("super�� display");
	}
}
class Child extends Parent{
	String name = "�̹�ȣ";
	public void display(){	//�������̵��� �޼ҵ�
		System.out.println("sub�� display");
	}
	public void show(){
		System.out.println("show");
	}
}

public class RefTypeCastingTest {
	public static void main(String[] args) {
		System.out.println("1. superŸ���� ���������� super��ü�� ����");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		System.out.println("***********************************");
		
		System.out.println("2. subŸ���� ���������� sub��ü�� ���� ");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		System.out.println("***********************************");
		
		/*
		 * 	��ü�� ����ȯ
		 * 	Sub��ü�� �ڵ����� SuperŸ������ ��ȯ�ȴ�.
		 *  => �������� ����ȯ�� ��Ӱ��迡 �ִ� ��� ����Ÿ���� ������ ������ü�� �����ϴ� ��� 
		 *     �ڵ����� ����ȯ�� �Ͼ��.
		 *     �θ�Ÿ�� ���� = new �ڽİ�ü()
		 *     
		 *     1)�������̵��� �޼ҵ尡 �ִ� ��� ������ �������̵��� �޼ҵ尡 �νĵȴ�.
		 *     2)�������̵��� �޼ҵ带 ���� ������ ���������� Ÿ���� �������� �׼���
		 *     	
		 */
		
		System.out.println("3. superŸ���� ���������� sub��ü�� ���� ");
		Parent obj3 = new Child();	//2) Parent���� �� �� �ִ�.(�������� Ÿ�Ա��� �׼���)
		obj3.display();				//�������̵��� �޼ҵ尡 ������ �������̵��� �޼ҵ尡 �νĵ�.
		System.out.println(obj3.name);
		
		//obj3�� �θ�Ÿ������ ����ȯ�� �Ǿ����� ���� ������ ��ü�� ������ü�̹Ƿ� 
		//��������� ����Ÿ������ ĳ�����ؼ� ������ �� �ִ�.
		((Child)obj3).show(); 	//obj3�� �ٲ��ִ� ���̹Ƿ� ��ȣ �ѹ� ��  
		System.out.println("***********************************");
		
		System.out.println("4. subŸ���� ���������� super��ü�� ����----X(�ȵȴ�) ");
		/*
		 *	obj4�� ����ȯ�� �� �� ����. Parent�� Child�� ��ȯ�ؾ� �ϴµ� 
		 *	Parent�� Child�� ��Ұ� �����Ƿ� ��ȯ�� �� ����.
		 *
		 */
		//Child obj4=new Parent(); 
		//obj4.display();		
		//System.out.println(obj4.name);
		System.out.println("***********************************");
		
		//��������� ĳ�����ϸ� �����Ϸ��� ���� �� ������ (��, ��Ӱ��迡 �ִ� ��쿡�� ����)
		//obj1�� �����ϴ� ��ü�� Parent��ü�̹Ƿ� Child�� ������ ��� ĳ������ ���Ѵ�.
		System.out.println("5. subŸ���� �������� = super��ü�� �����ϴ� superŸ���� ����----X(�ȵȴ�)");
		// Child obj5 = (Child)obj1;
		System.out.println("***********************************");
		
		System.out.println("6. subŸ���� �������� = sub��ü�� �����ϴ� superŸ���� ����----O(�ȴ�.)");
		Child obj6=(Child)obj3;
		System.out.println(obj6.name);
		System.out.println("***********************************");
		
		System.out.println("�������� ����ȯ�� 3���� 6�����ȴ�.");
	}
}
