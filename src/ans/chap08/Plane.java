package ans.chap08;

abstract class Plane {
	private String planeName;
	private int fuelSize;

	public Plane() {
	}
	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public void refuel(int fuel) {
		fuelSize+=fuel;
		System.out.println(planeName+"\t"+fuelSize);
	}

	public abstract void flight(int distance) ;

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
}
