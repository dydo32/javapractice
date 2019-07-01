package ans.chap06;

public class BookShop {

	private String bname;
	private String author;
	private int price;

	public BookShop() {
	}

	public BookShop(String bname, String author, int price) {
		this.bname = bname;
		this.author = author;
		this.price = price;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBname() {
		return this.bname;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}
}
