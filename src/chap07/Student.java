package chap07;
//Source�� getter,setter ���.
public class Student extends Emp{
	private int id;
	
	//������ �޼ҵ�
	public Student(){}
	public Student(String name, int age, int id) {
		super(name,age);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		super.print();
		System.out.println("\t��     �� : " + id);
	}

}
