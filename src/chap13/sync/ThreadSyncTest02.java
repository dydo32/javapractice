package chap13.sync;

public class ThreadSyncTest02 {

	public static void main(String[] args) {
		// 공유객체 생성
		Obj obj = new Obj();
		obj.acc1 = new Account("111-222-333", 50000000, "장동건");
		obj.acc2 = new Account("777-777-777", 10000000, "김서연");

		// 쓰레드 생성
		AccountTransferThread t1 = new AccountTransferThread(obj);
		AccountSumThread t2 = new AccountSumThread(obj);

		// 쓰레드 start
		t1.start();
		t2.start();
	}

}
