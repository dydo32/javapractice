package chap07;

public class Truck extends Wheeler {
	
	public Truck(String carName, int velocity, int wheelNumber){
		super(velocity, carName, wheelNumber);
	}
	
	public void speedUp(int speed) {
		velocity = velocity + 5*speed;
		if(velocity>100){
			velocity = 100;
			System.out.println("Ʈ���� ���� �ӵ��� " + velocity+"�Դϴ�.");
		}else{
			System.out.println("Ʈ���� ���� �ӵ��� " + velocity+"�Դϴ�.");
		}
	}
	
	public void speedDown(int speed){
		velocity = velocity - 5*speed;
		if(velocity<50){
			velocity = 50;
			System.out.println("Ʈ���� �����ӵ��������� �ӵ��� "+velocity+"���� �ø��ϴ�.");
		} else{
			System.out.println("Ʈ���� ���� �ӵ��� " + velocity+"�Դϴ�.");
		}
	}
	
}
