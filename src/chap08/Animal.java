package chap08;

public abstract class Animal {
	int speed; 			// 속도 km/h
	double distance; 	// 이동거리 km

	//생성자
	public Animal() {

	}

	public Animal(int speed) {
		super();
		this.speed = speed;
	}

	// 추상클래스
	abstract void run(int hours);

	// getDistance()
	public double getDistance() {
		return distance;
	}
}
