package chap06.constructor;

public class Rectangle2 {
	private int width; // 가로의 길이
	private int length; // 높이
	private String color; // 색깔

	//메소드로는 가로의 길이를 설정하고 가져오는 setWidth와 getWidth, 
	//세로의 길이를 설정하고 가져오는 setLength와 getLength
	//색깔을 설정하고 가져오는 setColor와 getColor
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	//직사각형의 넓이를 계산하는 area
	public int area(){
		return width*length;
	}
	//둘레의 길이를 계산하는 perimeter
	public int perimeter(){
		return 2*(width+length);
	}


	
	
}
