package ans.chap08;

public class Airplane extends Plane {	

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	public void flight(int distance) {
		setFuelSize((getFuelSize()-(distance*3)));
		System.out.println(getPlaneName()+"\t"+getFuelSize());
	}
}
