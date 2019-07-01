package ans.chap08;


interface Circle {
	String Calc(double d);
}

class Circum implements Circle {
	public String Calc(double r) {
		double circum = 2.0 * Math.PI * r;
		return "�ѷ� :" + circum;
	}
}

class Area implements Circle {
	public String Calc(double r) {
		double area = Math.PI * r * r;
		return "���� :" + area;
	}

}

public class Ch08_Exam01 {
	public static void main(String[] args) {
		Circle[] obj = new Circle[] { new Circum(), new Area() };
		System.out.print("�ݰ� :" + 10 + ":  \n");
		
		for (Circle res : obj) {	
			System.out.println(res.Calc(10));
		}
	}
}