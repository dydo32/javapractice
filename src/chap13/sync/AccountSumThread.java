package chap13.sync;
 
public class AccountSumThread extends Thread{
	Obj obj;

	public AccountSumThread(Obj obj) {
		super();
		this.obj = obj;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			synchronized (obj) {
				long total = obj.acc1.getBalance()+ obj.acc2.getBalance();
				System.out.println("ÀüÃ¼ ÃÑ ÀÜ¾×: " + total);
			}
		}
	}
}
