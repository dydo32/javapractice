package chap06;

public class Account {
	private String accNo;
	private int balance;
	
	public void save(int money){ //�Ա�
		balance = balance + money;
		System.out.println(accNo+" ���¿� "+money+"������ �ԱݵǾ����ϴ�.");
	}
	public void deposit(int money){	//���
		balance = balance - money;
		System.out.println(accNo+" ���¿� "+money+"������ ��ݵǾ����ϴ�.");
	}
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo+" ���°� �����Ǿ����ϴ�.");
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
