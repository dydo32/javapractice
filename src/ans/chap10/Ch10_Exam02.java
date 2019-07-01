package ans.chap10;

class Car {
	String car_name;
	int car_year;

	public Car() {
		super();
	}

	public Car(String car_name, int car_year) {
		super();
		this.car_name = car_name;
		this.car_year = car_year;
	}

	public boolean equals(Object obj) {
		Car other = (Car) obj;
		if (car_name == null) {
			if (other.car_name != null)
				return false;
		} else if (!car_name.equals(other.car_name))// ����
			return false;
		if (car_year != other.car_year)
			return false;
		return true;
	}
}

public class Ch10_Exam02 {
	public static void main(String[] args) {
		Car c1 = new Car("bm9", 2018);
		Car c2 = new Car("bm9", 2018);
		if (c1.equals(c2)) {
			System.out.println("���� �����̾� ");
		} else {
			System.out.println("�ٸ� �����̾� ");
		}
	}
}
