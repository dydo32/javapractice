package chap13.sync;

public class ThreadSyncTest02 {

	public static void main(String[] args) {
		// ������ü ����
		Obj obj = new Obj();
		obj.acc1 = new Account("111-222-333", 50000000, "�嵿��");
		obj.acc2 = new Account("777-777-777", 10000000, "�輭��");

		// ������ ����
		AccountTransferThread t1 = new AccountTransferThread(obj);
		AccountSumThread t2 = new AccountSumThread(obj);

		// ������ start
		t1.start();
		t2.start();
	}

}