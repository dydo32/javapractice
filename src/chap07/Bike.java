package chap07;

class Bike extends Wheeler{

	Bike(String carName, int velocity, int wheelNumber){
		super(velocity, carName, wheelNumber);
	}
	
	public void speedUp(int speed) {
		velocity = velocity + speed;
		if(velocity>40){
			velocity = 40;
			System.out.println("Ʈ���� ���� �ӵ��� " + velocity+"�Դϴ�.");
		}else{
			System.out.println("Ʈ���� ���� �ӵ��� " + velocity+"�Դϴ�.");
		}
	}
	
	public void speedDown(int speed){
		velocity = velocity - speed;
		if(velocity<10){
			velocity = 10;
			System.out.println("Ʈ���� �����ӵ��������� �ӵ��� "+velocity+"���� �ø��ϴ�.");
		} else{
			System.out.println("Ʈ���� ���� �ӵ��� " + velocity+"�Դϴ�.");
		}
	}
}
