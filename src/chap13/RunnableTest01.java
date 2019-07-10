package chap13;

//RunnableTest01�� Thread01�� Runnable�� ����
/*
* Thread���α׷����� �����ؾ� �ϴµ� �̹� ����ϰ� �ִ� Ŭ������ ������ ThreadŬ������ ����� �� ����.
* 1. Runnable �������̽��� ����Ѵ�. (implements)
* 2. run�޼ҵ带 �������̵��ؼ� ���������α׷������� �����ϰ� ���� ������ �����Ѵ�.
* 3. �����带 �����ϴ� ������
* 	  Runnable��ü (Runnable�� ������ü)�� �̿��ؼ� Thread��ü�� ����
*    => �ۼ��س��� Runnable��ü�� ������ �Ŀ� Thread������ �� Runnable�� �Ű������� �޴�
*       �����ڸ� �̿��ؼ� Thread�� �����Ѵ�.
* 4. ������ Thread��ü�� start�� ȣ���Ѵ�.
* 
*/
class A {

}

class RunnableDemo01 extends A implements Runnable {// extends Thread����
	// �������ʿ����
	public void run() {
		// Thread.currentThread()�� ThreadŬ�������� �����ϴ� static�޼ҵ�
		// =>���� �������� �����带 ����
		for(int i=1; i<=20; i++){
			System.out.print(i+"("+Thread.currentThread().getName()+")");	//getName����
			try {
				Thread.sleep(500);	//��� ������(�ȿ��� �ð�) 0.5��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			if(i%5==0){
				System.out.println();
			}
		}
	}
}

public class RunnableTest01 {
	public static void main(String[] args) {
		System.out.println("********main������ ����********");
		//1. Runnable�� ����ؼ� �ۼ��� ��ü�� ����
		Runnable obj1 = new RunnableDemo01();
		Runnable obj2 = new RunnableDemo01();
		//2. ������ Runnable��ü�� �̿��ؼ� Thread��ü�� ����
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(new RunnableDemo01());
		//3. ������ Runnable��ü�� start�� ȣ���ؼ� �۾��Ƿ�
		t1.start();
		t2.start();
		
		for(int i = 1; i<=10;i++){
			System.out.println("main");
			try {
				Thread.sleep(200);	//0.2��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("********main������ ����********");
	}
}
