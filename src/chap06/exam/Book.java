package chap06.exam;
public class Book {
	//�������
	private String title;
	private int price;
	//�ʱ�ȭ
	public Book(){
		this.title="";
		this.price=0;
	}
	public Book(String title, int price){
		this.title=title;
		this.price=price;
	}
	//setter/getter
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
}
