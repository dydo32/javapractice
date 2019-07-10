package chap13;
//ThreadTest02 변경한것
class AlphaThread02 implements Runnable  {
	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i+"("+Thread.currentThread().getName()+")");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}
}

class DigitThread02 implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i+"("+Thread.currentThread().getName()+")");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}
}
public class RunnableTest02 {
	public static void main(String[] args) {
		System.out.println("********main쓰레드 시작********");
		Thread t1 = new Thread(new AlphaThread02());
		Thread t2 = new Thread(new DigitThread02());
		t1.start();
		t2.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("********main쓰레드 종료********");
	}
}
