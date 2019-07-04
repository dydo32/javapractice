package chap08;

public abstract class Content {
	//변수
	private String title; 
	private int price;
	
	//생성자
	public Content(){
		
	}
	public Content(String title) {
		super();
		this.title = title;
	}
	
	//abstract메소드
	public abstract void totalPrice();
	//setter/getter메소드
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
	//show메소드
	public void show(){
		System.out.println(title+" 비디오의 가격은 "+price+"원 입니다.");
	}
}
