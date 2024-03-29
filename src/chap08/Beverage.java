package chap08;

public abstract class Beverage {
	private String name;
	protected int price;

	// 생성자
	public Beverage() {
	}

	public Beverage(String name) {
		super();
		this.name = name;
	}

	// 추상메소드
	public abstract void caloPrice();

	public void print() {
		System.out.println("번째 판매 음료는 " + name + "이며, " + "가격은 " + price);
	}

	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
