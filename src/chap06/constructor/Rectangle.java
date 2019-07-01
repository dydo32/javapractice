package chap06.constructor;

public class Rectangle {
	private int width; // 가로의 길이
	private int height; // 높이
	private String color = "흰색"; // 색깔
	private int area; // 면적

	// 생성자
	public Rectangle() {

	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int width, int height, String color) {
		this(width, height);
		this.color = color;
	}

	// getter/setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	// 면적계산 Method
	public void calculateArea() {
		area = width * height;
	}

}
