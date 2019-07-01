package ans.chap08;

public class Ch08_Exam05 {
	public static void main(String[] args) {
		Airplane ap = new Airplane("L747", 1000);
		Cargoplane cg = new Cargoplane("C40", 1000);

		System.out.println("Plane fuelSize\n" + "---------------");
		System.out.println(ap.getPlaneName() + "\t" + ap.getFuelSize());
		System.out.println(cg.getPlaneName() + "\t" + cg.getFuelSize()
				+ "\n");

		System.out.println("100 운항후");
		System.out.println("Plane fuelSize\n" + "---------------");
		ap.flight(100);
		cg.flight(100);

		System.out.println("200 주유후");
		System.out.println("Plane fuelSize\n" + "---------------");
		ap.refuel(200);
		cg.refuel(200);
	}
}
