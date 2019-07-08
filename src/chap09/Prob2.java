package chap09;

public class Prob2 {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("홍길동", 100);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

//따로 클래스만들어서 해도 됨
class BankCustomer{
	// 문제를 잘 읽고 구현하세요.
	String name; //고객 이름
	int currentMoney; //현재 잔액
	
	public BankCustomer(){}
	
	// 고객 이름과 잔액을 인자로 받는 생성자 
	public BankCustomer (String name, int currentMoney){
		super();
		this.name=name;
		this.currentMoney=currentMoney;
	}
	
	// 현재 잔액을 리턴한다. 
	public int getCurrentMoney(){
		return currentMoney;
	}
	
	// 현재 잔액에서 일정 금액을 인출한다. 
	// 현재 잔액이 인출하려는 금액보다 적은 경우,   
	// IllegalArgumentException(“잔액이 부족하여 인출 할 수 없습니다.”)을 발생시킨다. 
	public void withdraw(int money) throws IllegalArgumentException{
		if(currentMoney < money){
			throw new IllegalArgumentException("잔액이 부족하여 인출 할 수 없습니다.");
		}else{
			currentMoney=currentMoney-money;
		}
	}
}

