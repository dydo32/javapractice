package chap08;
/*
 * 	<<�������̽�>>
 * 	 =>	�߻�޼ҵ常 �����ϴ� Ư���� Ŭ����
 * 	 	�������̽��� ����ϴ� ������ �������� ������ �� ������ ���߻�Ӱ� �����ϰ� ������ �����ϴ�.
 * 	1. �������̽��� interfaceŰ���带 �̿��ؼ� ����
 * 	2. �������̽��� �߻�޼ҵ常 �����ϴ� Ŭ����
 * 		- ����Ŭ�������� ����� �� �������̵��� �� �ڵ����� public�� �߰��ǹǷ�
 * 		    �����Ҷ��� public abstract�� ������ �����ϴ�.
 * 	3. Ŭ������ �������̽��� ��ӹ��� ���� implements�� �̿��ؼ� ���(����)->��üȭ�Ѵ�.(realization)		//cf)extends Ŭ���� ���(generation)
 * 	4. �������̽��� �������̽��� ��ӹ��� ���� extends�� �̿�.
 * 	5. �������̽������� ���߻���� ���� - ���� ���� �������̽��� ,�� �����ؼ� ���ÿ� ����� �� �ִ�.
 * 	6. Ŭ������ �������̽��� ����ϴ� ��� ���� ����� ���� ��, ���� ���� �������̽��� ,�� �����ؼ� ���ÿ� ����� ����.
 * 	7. Ŭ������ �������̽��� ���ÿ� ����ϴ� ��� Ŭ������ ����� �������̽� ��Ӻ��� ���� �����Ѵ�.(InterfaceTest02.java)
 * 	      ��, extends�� implements���� ���� �����ؾ� �Ѵ�. 
 */
interface SuperInterA{
	void show();
}
interface InterA extends SuperInterA{
	void test();
	void display();
}
interface InterB{
	void test2();
}
interface InterC extends InterA, InterB{
	void test3();
}

class TestA implements InterA, InterB{
	@Override
	public void show() {
		// TODO Auto-generated method stub
	}
	@Override
	public void test2() {
		// TODO Auto-generated method stub
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
	}
	
}
public class InterfaceTest {
	public static void main(String[] args) {
	
	}
}
