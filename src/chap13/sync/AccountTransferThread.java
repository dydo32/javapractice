package chap13.sync;

public class AccountTransferThread extends Thread{
	Obj obj;
	
	public AccountTransferThread(Obj obj){
		super();
		this.obj = obj;
	}
	
	public void run(){
		for(int i = 1; i<=20; i++){
			synchronized (obj) {	//메소드 전체가 아니라 명령문 일부에 lock을 적용할 때 
									//사용하는 synchronized블럭 ()안에는 공유객체를 정의
				obj.acc1.withdraw(1000000);
				System.out.println("100만원을 출금했습니다.");
				obj.acc2.deposit(1000000);
				System.out.println("100만원을 입급했습니다.");
			}
		}
	}
}
