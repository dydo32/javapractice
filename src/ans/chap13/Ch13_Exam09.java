package ans.chap13;

class AppleBox {
	static private int apple = 10;
	private boolean available = false;

	public synchronized int get(int value) {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		if (apple - value < 0) {
			System.out.println("사과를 가져갈 수 없습니다.  현재 사과 : " + apple
					+ " 가지려는 수량: " + value);
			notify();
			return 0;
		}
		apple -= value;
		System.out.println("현재 사과 : " + apple);
		notify();
		return value;
	}

	public synchronized void save(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("사과담을 수량 : " + value + ",  현재 수량 : "
				+ (apple + value));
		apple += value;
		available = true;
		notify();
	}
}

class CatIn extends Thread {
	private AppleBox applebox;
	private String name;

	public CatIn(AppleBox a, String name) {
		applebox = a;
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			applebox.save(1);
			System.out.println("++++" + this.name + ", 담을 수량 : 1");
		}
	}
}

class PuppyOut extends Thread {
	private AppleBox applebox;
	private String name;

	public PuppyOut(AppleBox a, String name) {
		applebox = a;
		this.name = name;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 5; i++) {
			value = applebox.get((int) (Math.random() * 5 + 1));
			System.out.println("-----" + this.name + ", 가지려는 수량:" + value);
		}
	}
}

public class Ch13_Exam09 {
	public static void main(String[] args) {
		AppleBox a = new AppleBox();
		CatIn cat = new CatIn(a, "야옹이");
		PuppyOut puppy = new PuppyOut(a, "멍멍이");
		cat.start();
		puppy.start();
	}
}
