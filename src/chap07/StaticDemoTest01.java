package chap07;

public class StaticDemoTest01 {

	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		obj1.display();
		//num�� �ν��Ͻ� �����̹Ƿ� ��ü���������� obj1�� �̿��ؼ� �׼����� �����ϴ�.
		//staticNum�� ��ü�� ������ ������ ��ü ���ο� ���Ӱ� ��������� ������ �ƴ϶�
		//Ŭ������ ó�� �޸𸮿� �ε��ɶ� �� ���� �ε��Ǵ� �����̹Ƿ� ��ü�� ������ �� �� ����.
		//�ν��Ͻ������� ���ؼ� �������� �ʰ�
		//��� static����� ������ Ŭ������ �̸����� �����ؾ� �Ѵ�.
		System.out.println(obj1.num+","+StaticDemo.staticNum);
		
		StaticDemo obj2 = new StaticDemo();
		obj2.display();
		System.out.println(obj2.num+","+StaticDemo.staticNum);
		
		StaticDemo obj3 = new StaticDemo();
		obj3.display();
		System.out.println(obj3.num+","+StaticDemo.staticNum);
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10)); //���밪
	}

}
