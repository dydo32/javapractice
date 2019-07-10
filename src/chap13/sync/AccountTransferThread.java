package chap13.sync;

public class AccountTransferThread extends Thread{
	Obj obj;
	
	public AccountTransferThread(Obj obj){
		super();
		this.obj = obj;
	}
	
	public void run(){
		for(int i = 1; i<=20; i++){
			synchronized (obj) {	//�޼ҵ� ��ü�� �ƴ϶� ��ɹ� �Ϻο� lock�� ������ �� 
									//����ϴ� synchronized�� ()�ȿ��� ������ü�� ����
				obj.acc1.withdraw(1000000);
				System.out.println("100������ ����߽��ϴ�.");
				obj.acc2.deposit(1000000);
				System.out.println("100������ �Ա��߽��ϴ�.");
			}
		}
	}
}
