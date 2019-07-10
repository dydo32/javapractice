package chap13;
/*
 * 1. ������ ���α׷����� �ϰ� ���� ��� Ŭ������ �ۼ��� ��  java.lang.Thread��� Ŭ������ ����Ѵ�.
 * 2. ������� �����ϸ� ���ÿ� �����ϰ� ���� ����� run�޼ҵ带 �������̵��ؼ� �ۼ�
 * 	 	=> ����ȣ���ؼ� �������� �ʴ´�.
 * 3. run�޼ҵ带 ���� ȣ������ �ʰ� ThreadŬ������ ���ǵǾ��ִ� start�޼ҵ带 ȣ���Ѵ�.
 * 		=> start�޼ҵ带 ȣ���ϸ� JVM������ �����췯�� ���ؼ� run�޼ҵ尡 ������ ������ ȣ��ȴ�.	    
 */
class ThreadDemo01 extends Thread{
	public ThreadDemo01(String name){
		super(name);
	}
	public void run(){
		for(int i=1; i<=20; i++){
			System.out.print(i+"("+getName()+")");
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
public class ThreadTest01 {
	public static void main(String[] args) {
		System.out.println("********main������ ����********");
		ThreadDemo01 thread1 = new ThreadDemo01("t1");
		ThreadDemo01 thread2 = new ThreadDemo01("t2");
		//thread1.run();		//�ܼ� �޼ҵ� call
		thread1.start();		//JVM�����ٷ����� �Ƿ��ϴ� �۾� - �ڵ����� run�� ȣ��
		thread2.start();
		
		for(int i=1; i<=10; i++){
			System.out.println("main");
			try {
				Thread.sleep(200);		//0.2��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("********main������ ����********");		
	}
}
