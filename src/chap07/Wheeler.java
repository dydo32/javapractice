package chap07;

public class Wheeler {
	protected int velocity;
	protected String carName;
	protected int wheelNumber;

	public Wheeler(int velocity, String carName, int wheelNumber) {
		super();
		this.velocity = velocity;
		this.carName = carName;
		this.wheelNumber = wheelNumber;
	}

	public void speedUp(int speed) {

	}

	public void speedDown(int speed) {
	}

	public void stop() {
		velocity = 0;
		System.out.println("�������·� �ӵ��� 0���� �ʱ�ȭ�մϴ�.");
	}
}
