package chap09;

public class CardPayment extends Payment{
	private String cardNumber;		//�ſ�ī���ȣ
	private String cardPassword;	//ī���й�ȣ
	private int monthlyInstallment;	//�Һΰ���
	
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
		String str = "�ſ�ī�尡 ���������� ���ҵǾ����ϴ�.\n"
				+"[ �ſ�ī�� ���� ����  ] \n"
				+"������ : "+ shopName 
				+"\n��ǰ�� : " + productName
				+"\n��ǰ���� : " + productPrice
				+"\n�ſ�ī���ȣ : " + cardNumber
				+"\n�Һΰ��� : " + monthlyInstallment;
		return str;
				
	}

	@Override
	public void pay() throws PayException {
		if(productPrice<=0 | monthlyInstallment<0){
			throw new PayException("�����̳� �Һΰ������� �߸��Ǿ����ϴ�.");
		}else{
			toString();
		}
	}
}
