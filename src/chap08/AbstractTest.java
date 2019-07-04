package chap08;
/*
 *	�߻�Ŭ����
 *	=> �̿ϼ��� Ŭ���� ��, ��� ������ �����Ǿ� ���� ���� Ŭ������ �ϼ����� �ʾ����Ƿ� ��ü�� ������ �� ����.
 *						-----------------
 *							������ ���ǵ��� ���� �޼ҵ带 ���� �ִ� Ŭ����
 *								|_�߻�޼ҵ�(body�� ���� �޼ҵ�)
 *	1) �߻�޼ҵ带 �����ϴ� ���
 *	      �������� abstract ����Ÿ�� �޼ҵ��(�Ű�����list...);
 *	   => �߻�޼ҵ带 �����ϸ� Ŭ������ �̿ϼ��� Ŭ���� ��, �߻�Ŭ������ �ǹǷ� Ŭ���� ����ο���
 *		  abstract�� �߰��ؾ� �Ѵ�.
 *	2) �߻�Ŭ������ Ư¡
 *		- �Ϲݸ޼ҵ�� �߻�޼ҵ带 ��� ���� �� �� �ִ�.
 *		- �߻�޼ҵ尡 �ϳ��� ���ǵ� Ŭ������ �߻�Ŭ�����̹Ƿ� abstract�� Ŭ���� ����ο� �߰��Ѵ�.
 *		- �߻�Ŭ������ ��ü ������ �� �� ����.
 *		- �߻�Ŭ������ ��ӹ��� Ŭ������ ������ �߻��Ѵ�.
 *		    ������ ��? => Sub�� Super�� ��ӹ����� Super�� ��� ����� Sub�� ������ �ȴ�.
 *					  �׷��Ƿ� Sub���� �߻�Ŭ������ �ȴ�.
 *		  [�ذ���]
 *		  1. abstract�� ���� Ŭ������ ����ο� �߰��Ѵ�.
 *		  2. abstractŬ������ ����Ŭ������ ���� �ִ� �߻�޼ҵ带 �������̵��Ѵ�.
 */
 abstract class Super{
	public void test(){
		System.out.println("test()");
	}
	public abstract void display();	//�̿ϼ��ȸ޼ҵ带 ������ �����Ƿ�, Super�� �̿ϼ��� Ŭ����
									//�� ���? �������� ���ؼ�
}
 class Sub extends Super{
	@Override		//����������
	public void display() {
		
	}
 }

public class AbstractTest {
	public static void main(String[] args) {
		// Super obj = new Super(); 	//�߻�Ŭ������ ��ü ������ �� �� ����.
	}
}