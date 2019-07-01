package ans.chap06;

public class Fruit {
	private String fname;
	private int price;

	public Fruit(String fname, int price) {
		super();
		this.fname = fname;
		this.price = price;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
