package chap09;

public class Prob2 {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("ȫ�浿", 100);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

//���� Ŭ�������� �ص� ��
class BankCustomer{
	// ������ �� �а� �����ϼ���.
	String name; //�� �̸�
	int currentMoney; //���� �ܾ�
	
	public BankCustomer(){}
	
	// �� �̸��� �ܾ��� ���ڷ� �޴� ������ 
	public BankCustomer (String name, int currentMoney){
		super();
		this.name=name;
		this.currentMoney=currentMoney;
	}
	
	// ���� �ܾ��� �����Ѵ�. 
	public int getCurrentMoney(){
		return currentMoney;
	}
	
	// ���� �ܾ׿��� ���� �ݾ��� �����Ѵ�. 
	// ���� �ܾ��� �����Ϸ��� �ݾ׺��� ���� ���,   
	// IllegalArgumentException(���ܾ��� �����Ͽ� ���� �� �� �����ϴ�.��)�� �߻���Ų��. 
	public void withdraw(int money) throws IllegalArgumentException{
		if(currentMoney < money){
			throw new IllegalArgumentException("�ܾ��� �����Ͽ� ���� �� �� �����ϴ�.");
		}else{
			currentMoney=currentMoney-money;
		}
	}
}

