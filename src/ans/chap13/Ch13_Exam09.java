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
			System.out.println("����� ������ �� �����ϴ�.  ���� ��� : " + apple
					+ " �������� ����: " + value);
			notify();
			return 0;
		}
		apple -= value;
		System.out.println("���� ��� : " + apple);
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
		System.out.println("������� ���� : " + value + ",  ���� ���� : "
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
			System.out.println("++++" + this.name + ", ���� ���� : 1");
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
			System.out.println("-----" + this.name + ", �������� ����:" + value);
		}
	}
}

public class Ch13_Exam09 {
	public static void main(String[] args) {
		AppleBox a = new AppleBox();
		CatIn cat = new CatIn(a, "�߿���");
		PuppyOut puppy = new PuppyOut(a, "�۸���");
		cat.start();
		puppy.start();
	}
}
