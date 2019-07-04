package chap08;

public class Rectangular extends Shape {
	private double width;
	private double height;

	// »ý¼ºÀÚ
	public Rectangular() {

	}

	public Rectangular(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	@Override
	public void calculationArea() {
		area = width*height;
		//setArea(width * height);
	}

	// getter/setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return height;
	}

	public void setHight(double height) {
		this.height = height;
	}
}
