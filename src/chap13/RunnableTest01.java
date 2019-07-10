package chap13;

//RunnableTest01은 Thread01을 Runnable로 변경
/*
* Thread프로그래밍을 구현해야 하는데 이미 상속하고 있는 클래스가 있으면 Thread클래스를 상속할 수 없다.
* 1. Runnable 인터페이스를 상속한다. (implements)
* 2. run메소드를 오버라이딩해서 쓰레드프로그래밍으로 적용하고 싶은 내용을 구현한다.
* 3. 쓰레드를 시작하는 곳에서
* 	  Runnable객체 (Runnable의 하위객체)를 이용해서 Thread객체를 생성
*    => 작성해놓은 Runnable객체를 생성한 후에 Thread생성자 중 Runnable을 매개변수로 받는
*       생성자를 이용해서 Thread를 생성한다.
* 4. 생성한 Thread객체의 start를 호출한다.
* 
*/
class A {

}

class RunnableDemo01 extends A implements Runnable {// extends Thread못함
	// 생성자필요없음
	public void run() {
		// Thread.currentThread()는 Thread클래스에서 제공하는 static메소드
		// =>현재 실행중인 쓰레드를 리턴
		for(int i=1; i<=20; i++){
			System.out.print(i+"("+Thread.currentThread().getName()+")");	//getName못씀
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

public class RunnableTest01 {
	public static void main(String[] args) {
		System.out.println("********main쓰레드 시작********");
		//1. Runnable을 상속해서 작성한 객체를 생성
		Runnable obj1 = new RunnableDemo01();
		Runnable obj2 = new RunnableDemo01();
		//2. 생성한 Runnable객체를 이용해서 Thread객체를 생성
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(new RunnableDemo01());
		//3. 생성한 Runnable객체의 start를 호출해서 작업의뢰
		t1.start();
		t2.start();
		
		for(int i = 1; i<=10;i++){
			System.out.println("main");
			try {
				Thread.sleep(200);	//0.2초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("********main쓰레드 종료********");
	}
}
