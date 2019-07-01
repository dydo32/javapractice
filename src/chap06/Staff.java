package chap06;

public class Staff {
	private String name;
	private int age;
	private String dept;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
	public void setDept(String dept){
		this.dept=dept;
	}
	public String getDept(){
		return this.dept;
	}
	
	public void print(){
		System.out.println("이 름 : "+name+"\t나     이 : "+age+"\t부     서 : "+dept);
	}
}
