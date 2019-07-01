package ans.chap12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ch12_Exam08 {

	public static void main(String[] args) {
		List<Car> m_list = new ArrayList<>();
		m_list.addAll(Arrays.asList(new Car(2500, "blue"), new Car(3000,
				"green"), new Car(1500, "red")));

		m_list.sort((a1, a2) -> a1.getDisplacement().compareTo(
				a2.getDisplacement()));
		System.out.print(m_list);
	}

}

class Car {
	private Integer displacement;

	public Integer getDisplacement() {
		return displacement;
	}

	public void setDisplacement(Integer displacement) {
		this.displacement = displacement;
	}

	private String color;

	public Car(Integer displacement, String color) {
		this.displacement = displacement;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Car {" + "color='" + color + '\'' + ", displacement="
				+ displacement + "CC}\n";
	}
}
