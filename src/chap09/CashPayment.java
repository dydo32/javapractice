package chap09;

public  class CashPayment extends Payment{
	private String cashReceiptNumber;	//���ݿ�������ȣ
	
	public CashPayment(){}
	public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber) {
		super(shopName, productName, productPrice);
		this.cashReceiptNumber = cashReceiptNumber;
	}

	
	@Override
	public String toString() {
		String str = "������ ���������� ���ҵǾ����ϴ�.\n"
				+"[ ���� ���� ����  ] \n"
				+"������ : "+ shopName 
				+"\n��ǰ�� : " + productName
				+"\n��ǰ���� : " + productPrice
				+"\n���ݿ�������ȣ : " + cashReceiptNumber;
		return str;
	}
	@Override
	public void pay() throws PayException {
		if(productPrice<=0){
			throw new PayException("������ �߸��Ǿ����ϴ�.");
		}else{
			toString();
		}
	}
}
