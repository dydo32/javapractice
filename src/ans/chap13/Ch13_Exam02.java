package ans.chap13;

import java.util.concurrent.TimeUnit;

public class Ch13_Exam02 {
	public static void main(String[] args) {
		Runnable runnable = () -> {
		    try {
		        String name = Thread.currentThread().getName();
		        System.out.println(name);
		        TimeUnit.SECONDS.sleep(1);
		        System.out.println("匙~~~ ");
		    }
		    catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		};

		Thread thread = new Thread(runnable, "港港酒 ");
		Thread thread01 = new Thread(runnable, "具克酒  ");
		thread.start();	
		try {
			thread.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		thread01.start();
	}

}
