package chap08;

public abstract class Content {
	//����
	private String title; 
	private int price;
	
	//������
	public Content(){
		
	}
	public Content(String title) {
		super();
		this.title = title;
	}
	
	//abstract�޼ҵ�
	public abstract void totalPrice();
	//setter/getter�޼ҵ�
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//show�޼ҵ�
	public void show(){
		System.out.println(title+" ������ ������ "+price+"�� �Դϴ�.");
	}
}
