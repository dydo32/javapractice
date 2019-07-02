package chap07;
/*
 * 	<<��Ӱ��迡�� ��������� ���� Ư¡>>
 * 1. ��Ӱ��迡���� ����Ŭ������ ����� ��������� ����Ŭ�������� ������ �����ϴ�.
 * 2. ����Ŭ�������� ����� ������ ������ �̸��� ������ ����Ŭ������ ����Ǿ� �ִٸ�
 * 	     �θ�Ŭ������ ����������� ����Ŭ������ ��������� �켱 ������ ����.
 * 	  => �ڽ�Ŭ������ ��������� �ν�
 * 3. ���� Ŭ�������� ����Ŭ������ ��������� �����ϰ� ���� ��쿡�� super�� �̿��ؼ� �����Ѵ�.
 * 	  this => �ڱ��ڽ��� ��ü�� ��Ī
 * 	  super => �θ�ü
 * 4. ����Ŭ������ ����� private�� ��쿡�� ����Ŭ������� �ϴ��� ������ �� ����.
 */
class Super{
	int num = 100;
}
class Sub extends Super{
	int num = 1000;
	public void display(){
		System.out.println("num=>"+num);			//SubŬ������ ���� ���ǵǾ� ���� ����
		System.out.println("super.num=>"+super.num);//SubŬ������ ����ϴ� SuperŬ������ ���� �Ǿ� ������
	}												//��ġ SubŬ������ ���� �Ǿ� �ִ� �� ó�� ����� �� �ִ�.
													//���� ������ Sub�� num�� ���ǵ��� ���� ������ ��
}
public class InheritanceTest01 {

	public static void main(String[] args) {
			Sub obj = new Sub();
			obj.display();
			System.out.println(obj.num);
	}

}
