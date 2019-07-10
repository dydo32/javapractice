package chap13;


class AlphaThread extends Thread {
	public AlphaThread(String name) {
		super(name);
	}

	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
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
class DigitThread extends Thread {
	public DigitThread(String name) {
		super(name);
	}
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
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
public class ThreadTest02 {
	public static void main(String[] args) {
		System.out.println("********main쓰레드 시작********");
		AlphaThread thread1 = new AlphaThread("t1");
		DigitThread thread2 = new DigitThread("t2");
		thread1.start();
		thread2.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("********main쓰레드 종료********");
	}
}
