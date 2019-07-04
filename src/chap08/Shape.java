package chap08;

public abstract class Shape {
	protected double area;
	private String name;
	//������
	public Shape(){
		
	}
	public Shape(String name) {
		super();
		this.name = name;
	}

	//abstract�޼ҵ�-
	public abstract void calculationArea();
	
	//print()
	public void print(){
		System.out.println(name+"�� ������ "+area);
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
