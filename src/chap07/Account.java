package chap07;

class Account{
	private String accId; //계좌번호
	private long balance;  //잔액
	private String ownerName; //사용자이름

	Account(){}
	Account(String accId, long balance, String ownerName){
		this.accId=accId;
		this.balance=balance;
		this.ownerName=ownerName;
	}
	
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void deposit(long amount){ //입금
		balance = balance + amount;
	}
	public void withdraw(long amount){ //출금
		balance = balance - amount;
	}
	
	
}