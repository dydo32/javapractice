package chap07;

public class Staff extends Emp {
	private String dept;
 
	// ������ �޼ҵ�
	public Staff() {}	
	public Staff(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return this.dept;
	}

	public void print() {
		super.print();
		System.out.println("\t��     �� : " + dept);
	}
}
