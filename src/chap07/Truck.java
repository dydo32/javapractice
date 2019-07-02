package chap07;

public class Truck extends Wheeler {
	
	public Truck(String carName, int velocity, int wheelNumber){
		super(velocity, carName, wheelNumber);
	}
	
	public void speedUp(int speed) {
		velocity = velocity + 5*speed;
		if(velocity>100){
			velocity = 100;
			System.out.println("트럭의 현재 속도는 " + velocity+"입니다.");
		}else{
			System.out.println("트럭의 현재 속도는 " + velocity+"입니다.");
		}
	}
	
	public void speedDown(int speed){
		velocity = velocity - 5*speed;
		if(velocity<50){
			velocity = 50;
			System.out.println("트럭의 최저속도위반으로 속도를 "+velocity+"으로 올립니다.");
		} else{
			System.out.println("트럭의 현재 속도는 " + velocity+"입니다.");
		}
	}
	
}
