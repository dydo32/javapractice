package chap07;

public class Emp {
	private String name;
	private int age;
	
	public Emp(){
		
	}
	public Emp(String name, int age){
		super();
		this.name=name;
		this.age=age;
	}
	
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
	
	public void print() {
		System.out.print("이 름 : " + name + "\t나     이 : " + age); 
	}
}

