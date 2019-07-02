package chap07;

class Bike extends Wheeler{

	Bike(String carName, int velocity, int wheelNumber){
		super(velocity, carName, wheelNumber);
	}
	
	public void speedUp(int speed) {
		velocity = velocity + speed;
		if(velocity>40){
			velocity = 40;
			System.out.println("트럭의 현재 속도는 " + velocity+"입니다.");
		}else{
			System.out.println("트럭의 현재 속도는 " + velocity+"입니다.");
		}
	}
	
	public void speedDown(int speed){
		velocity = velocity - speed;
		if(velocity<10){
			velocity = 10;
			System.out.println("트럭의 최저속도위반으로 속도를 "+velocity+"으로 올립니다.");
		} else{
			System.out.println("트럭의 현재 속도는 " + velocity+"입니다.");
		}
	}
}
