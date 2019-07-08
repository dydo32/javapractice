package chap09;

public  class CashPayment extends Payment{
	private String cashReceiptNumber;	//현금영수증번호
	
	public CashPayment(){}
	public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber) {
		super(shopName, productName, productPrice);
		this.cashReceiptNumber = cashReceiptNumber;
	}

	
	@Override
	public String toString() {
		String str = "현금이 정상적으로 지불되었습니다.\n"
				+"[ 현금 결제 정보  ] \n"
				+"상점명 : "+ shopName 
				+"\n상품명 : " + productName
				+"\n상품가격 : " + productPrice
				+"\n현금영수증번호 : " + cashReceiptNumber;
		return str;
	}
	@Override
	public void pay() throws PayException {
		if(productPrice<=0){
			throw new PayException("가격이 잘못되었습니다.");
		}else{
			toString();
		}
	}
}
