package chap13;
/*
 * 1. 쓰레드 프로그래밍을 하고 싶은 경우 클래스를 작성할 때  java.lang.Thread라는 클래스를 상속한다.
 * 2. 쓰레드로 동작하며 동시에 실행하고 싶은 기능을 run메소드를 오버라이딩해서 작성
 * 	 	=> 직접호출해서 실행하지 않는다.
 * 3. run메소드를 직접 호출하지 않고 Thread클래스에 정의되어있는 start메소드를 호출한다.
 * 		=> start메소드를 호출하면 JVM내부의 스케쥴러에 의해서 run메소드가 적절한 시점에 호출된다.	    
 */
class ThreadDemo01 extends Thread{
	public ThreadDemo01(String name){
		super(name);
	}
	public void run(){
		for(int i=1; i<=20; i++){
			System.out.print(i+"("+getName()+")");
			try {
				Thread.sleep(500);	//잠깐 멈춰줌(안에는 시간) 0.5초
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
		System.out.println("********main쓰레드 시작********");
		ThreadDemo01 thread1 = new ThreadDemo01("t1");
		ThreadDemo01 thread2 = new ThreadDemo01("t2");
		//thread1.run();		//단순 메소드 call
		thread1.start();		//JVM스케줄러에게 의뢰하는 작업 - 자동으로 run이 호출
		thread2.start();
		
		for(int i=1; i<=10; i++){
			System.out.println("main");
			try {
				Thread.sleep(200);		//0.2초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("********main쓰레드 종료********");		
	}
}
