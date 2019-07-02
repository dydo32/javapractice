package chap07;

public class CheckingAccount extends Account{
	private String cardNo; //카드번호

	public CheckingAccount(){}
	public CheckingAccount(String accId, String ownerName, long balance,String cardNo){
		super(accId, balance, ownerName);
		this.cardNo=cardNo;
	}

	public void pay(String cardNo, long amount){
		if(this.cardNo.equals(cardNo) & getBalance()>=amount){ //문자열은 equals로 비교
			withdraw(amount);
		}else{
			System.out.println("지불이 불가능합니다.");
		}
	}
}
