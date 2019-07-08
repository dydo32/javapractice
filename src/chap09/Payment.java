package chap09;

public abstract class Payment implements Payable{
	protected String shopName;		//������
	protected String productName;	//��ǰ��
	protected long productPrice;	//��ǰ����
	
	public Payment(){}
	//��������� �ʱ�ȭ�ϴ� ������
	public Payment(String shopName, String productName, long productPrice) {
		super();
		this.shopName = shopName;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
}
