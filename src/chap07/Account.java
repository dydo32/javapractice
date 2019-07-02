package chap07;

class Account{
	private String accId; //���¹�ȣ
	private long balance;  //�ܾ�
	private String ownerName; //������̸�

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
	
	public void deposit(long amount){ //�Ա�
		balance = balance + amount;
	}
	public void withdraw(long amount){ //���
		balance = balance - amount;
	}
	
	
}