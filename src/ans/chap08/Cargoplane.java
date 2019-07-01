package ans.chap08;

public class Cargoplane extends Plane {
	public Cargoplane() {
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	public void flight(int distance) {
		setFuelSize((getFuelSize()-(distance*5)));
		System.out.println(getPlaneName()+" \t\t"+getFuelSize()+"\n");
	}
}
