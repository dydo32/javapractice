package chap08;

public abstract class Shape {
	protected double area;
	private String name;
	//생성자
	public Shape(){
		
	}
	public Shape(String name) {
		super();
		this.name = name;
	}

	//abstract메소드-
	public abstract void calculationArea();
	
	//print()
	public void print(){
		System.out.println(name+"의 면적은 "+area);
	}
	// getter/setter
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
