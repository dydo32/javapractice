package ans.chap13;

import java.util.concurrent.TimeUnit;

public class Ch13_Exam02 {
	public static void main(String[] args) {
		Runnable runnable = () -> {
		    try {
		        String name = Thread.currentThread().getName();
		        System.out.println(name);
		        TimeUnit.SECONDS.sleep(1);
		        System.out.println("��~~~ ");
		    }
		    catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		};

		Thread thread = new Thread(runnable, "�۸۾� ");
		Thread thread01 = new Thread(runnable, "�߿˾�  ");
		thread.start();	
		try {
			thread.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		thread01.start();
	}

}
