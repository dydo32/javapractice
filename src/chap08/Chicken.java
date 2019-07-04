package chap08;

public class Chicken extends Animal implements Cheatable{

	public Chicken(){
		super();
	}
	public Chicken(int speed){
		super(speed);
	}
	
	@Override
	public void run(int hours) {
		distance = distance + speed*hours;
	}
	
	@Override
	public void fly() {
		speed = 2*speed;
	}
}
