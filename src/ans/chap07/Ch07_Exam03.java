package ans.chap07;

class Salary {
	String name;
	int salary;

	public Salary(String n, int s) {
		name = n;
		salary = s;
	}

	public void getInfomation() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + salary);
	}
}

public class Ch07_Exam03 extends Salary {
	String department;

	public Ch07_Exam03(String n, int s, String d) {
		super(n, s);
		department = d;
	}

	public void getInfomation() {
		super.getInfomation();
		System.out.println("�μ� : " + department);
	}

	public static void main(String[] args) {
		Ch07_Exam03 ob = new Ch07_Exam03("Dominica", 85000000, "ERP-*");
		ob.getInfomation();

	}
}