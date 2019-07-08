package chap09;

public class CardPayment extends Payment{
	private String cardNumber;		//신용카드번호
	private String cardPassword;	//카드비밀번호
	private int monthlyInstallment;	//할부개월
	
	public CardPayment() {
		super();
	}

	public CardPayment(String shopName, String productName, long productPrice, 
						String cardNumber, String cardPassword, int monthlyInstallment) {
		super(shopName, productName, productPrice);
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlyInstallment = monthlyInstallment;
	}

	@Override
	public String toString() {
		String str = "신용카드가 정상적으로 지불되었습니다.\n"
				+"[ 신용카드 결제 정보  ] \n"
				+"상점명 : "+ shopName 
				+"\n상품명 : " + productName
				+"\n상품가격 : " + productPrice
				+"\n신용카드번호 : " + cardNumber
				+"\n할부개월 : " + monthlyInstallment;
		return str;
				
	}

	@Override
	public void pay() throws PayException {
		if(productPrice<=0 | monthlyInstallment<0){
			throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
		}else{
			toString();
		}
	}
}
