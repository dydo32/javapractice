package chap08;

public class Circle extends Shape {
	private double radius;
	
	public Circle(){
		
	}
	public Circle(String name, double radius){
		super(name);
		this.radius=radius;
	}

	@Override
	public void calculationArea() {
		area = radius*radius/Math.PI;
		//setArea(radius*radius/Math.PI);
	}
	
	// getter/setter
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
