package chap13;

/*
 * 쓰레드 종료
 * 2. 인터럽트를 발생시키고 현재 상태를 확인한 후 작업하기.
 */
class StopThread02 implements Runnable {

	@Override
	public void run() {
		// 현재 상태가 인터럽트 상태인지 판단
		try {
			while (!Thread.currentThread().isInterrupted()) { // 인터럽트상태가 아닐 때
				System.out.println("현재 쓰레드 상태: 실행중~~~~");
				Thread.sleep(500);
				
				 // try { 
				 // 	Thread.sleep(500); 
				 // } catch (InterruptedException e) { //-> while문 안에서 exception처리해서 나오지 못하고 인터럽트 발생 X
				 // e.printStackTrace(); 
				 // }
				 //
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("현재 쓰레드 상태: 종료");
		}
	}
}

public class StopThreadTest02 {
	public static void main(String[] args) {
		System.out.println("main시작");
		Thread t = new Thread(new StopThread02());
		t.start();
		System.out.println("쓰레드이름: "+ t.getName());
		System.out.println("인터럽트상태: " + t.isInterrupted());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 인터럽트 발생
		t.interrupt();
		//System.out.println("쓰레드이름: "+ t.getName());
		System.out.println("인터럽트상태: " + t.isInterrupted());	//인터럽트 발생하고 바로 찍어야 true로 나온다.
		System.out.println("인터럽트상태: " + t.isInterrupted());
		System.out.println("main종료");
	}
}
