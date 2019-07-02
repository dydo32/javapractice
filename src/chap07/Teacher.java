package chap07;

public class Teacher extends Emp{
	private String subject;
	
	//생성자 메소드
	public Teacher(){}
	public Teacher(String name, int age, String subject){
		super(name,age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print(){
		super.print();
		System.out.println("\t담당과목 : "+subject);
	}
	
}
