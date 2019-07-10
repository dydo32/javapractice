package chap13;

/*
 * ������ ����
 * 2. ���ͷ�Ʈ�� �߻���Ű�� ���� ���¸� Ȯ���� �� �۾��ϱ�.
 */
class StopThread02 implements Runnable {

	@Override
	public void run() {
		// ���� ���°� ���ͷ�Ʈ �������� �Ǵ�
		try {
			while (!Thread.currentThread().isInterrupted()) { // ���ͷ�Ʈ���°� �ƴ� ��
				System.out.println("���� ������ ����: ������~~~~");
				Thread.sleep(500);
				
				 // try { 
				 // 	Thread.sleep(500); 
				 // } catch (InterruptedException e) { //-> while�� �ȿ��� exceptionó���ؼ� ������ ���ϰ� ���ͷ�Ʈ �߻� X
				 // e.printStackTrace(); 
				 // }
				 //
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("���� ������ ����: ����");
		}
	}
}

public class StopThreadTest02 {
	public static void main(String[] args) {
		System.out.println("main����");
		Thread t = new Thread(new StopThread02());
		t.start();
		System.out.println("�������̸�: "+ t.getName());
		System.out.println("���ͷ�Ʈ����: " + t.isInterrupted());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ���ͷ�Ʈ �߻�
		t.interrupt();
		//System.out.println("�������̸�: "+ t.getName());
		System.out.println("���ͷ�Ʈ����: " + t.isInterrupted());	//���ͷ�Ʈ �߻��ϰ� �ٷ� ���� true�� ���´�.
		System.out.println("���ͷ�Ʈ����: " + t.isInterrupted());
		System.out.println("main����");
	}
}
