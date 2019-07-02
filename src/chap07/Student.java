package chap07;
//Source에 getter,setter 사용.
public class Student extends Emp{
	private int id;
	
	//생성자 메소드
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
		System.out.println("\t학     번 : " + id);
	}

}
