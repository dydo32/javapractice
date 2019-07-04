package chap08;

public abstract class Animal {
	int speed; 			// �ӵ� km/h
	double distance; 	// �̵��Ÿ� km

	//������
	public Animal() {

	}

	public Animal(int speed) {
		super();
		this.speed = speed;
	}

	// �߻�Ŭ����
	abstract void run(int hours);

	// getDistance()
	public double getDistance() {
		return distance;
	}
}
