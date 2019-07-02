package chap07;

public class CheckingAccount extends Account{
	private String cardNo; //ī���ȣ

	public CheckingAccount(){}
	public CheckingAccount(String accId, String ownerName, long balance,String cardNo){
		super(accId, balance, ownerName);
		this.cardNo=cardNo;
	}

	public void pay(String cardNo, long amount){
		if(this.cardNo.equals(cardNo) & getBalance()>=amount){ //���ڿ��� equals�� ��
			withdraw(amount);
		}else{
			System.out.println("������ �Ұ����մϴ�.");
		}
	}
}
