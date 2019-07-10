package chap13;
/*
 * 쓰레드 종료
 * 1. 임의의 변수를 선언해서 종료하는 방법
 * 	  -------
 * 	  flag변수
 * 		- 변수값에 따라서 작업을 처리할 수 있도록 구현 (실행 or 종료 - boolean)
 * 		- 변수값을 체크 (오래걸리는 작업이 있는 경우 중간에 stop할 수 없다.)
 */
class StopThread01 extends Thread{
	//현재 상태값을 저장할 변수 선언
	private boolean state = true;
	public void run(){
		while(state){
			System.out.println("현재 쓰레드의 상태: 실행중~~~~~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("현재 쓰레드 상태: 종료상태");
	}
	public void stopThread(){
		state = false;
	}
}
public class StopThreadTest01 {
	public static void main(String[] args) {
		System.out.println("main쓰레드 시작");
		StopThread01 t1 = new StopThread01();
		t1.start();
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		t1.stopThread();
		System.out.println("main쓰레드 종료");
	}
}
