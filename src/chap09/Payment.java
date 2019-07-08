package chap09;

public abstract class Payment implements Payable{
	protected String shopName;		//상점명
	protected String productName;	//상품명
	protected long productPrice;	//상품가격
	
	public Payment(){}
	//멤버변수를 초기화하는 생성자
	public Payment(String shopName, String productName, long productPrice) {
		super();
		this.shopName = shopName;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
}
