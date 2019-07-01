package ans.chap13;

public class Ch13_Exam01 {

	public static void main(String[] args) {
		Runnable r = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		};

		for (int i = 0; i < 5; i++) {
			new Thread(r).start();
		}
		System.out.println("main!");

	}

}
