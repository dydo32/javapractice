package chap08;

public class Dog extends Animal {
	//������
	public Dog(){
		super();
	}
	public Dog(int speed){
		super(speed);
	}
	
	@Override
	void run(int hours) {
		distance = distance + speed*0.5*hours;
	}
}
