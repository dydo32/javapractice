package chap06.constructor;

public class Rectangle2 {
	private int width; // ������ ����
	private int length; // ����
	private String color; // ����

	//�޼ҵ�δ� ������ ���̸� �����ϰ� �������� setWidth�� getWidth, 
	//������ ���̸� �����ϰ� �������� setLength�� getLength
	//������ �����ϰ� �������� setColor�� getColor
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
	
	//���簢���� ���̸� ����ϴ� area
	public int area(){
		return width*length;
	}
	//�ѷ��� ���̸� ����ϴ� perimeter
	public int perimeter(){
		return 2*(width+length);
	}


	
	
}
