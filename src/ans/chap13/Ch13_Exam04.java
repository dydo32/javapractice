package ans.chap13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Ch13_Exam04 {

	public static void main(String[] args) {
		AtomicInteger atomicInt = new AtomicInteger(0);
		ExecutorService executor = Executors.newFixedThreadPool(2);
		IntStream.range(0, 1000).forEach(
				i -> executor.submit(atomicInt::incrementAndGet));
		try {
			executor.awaitTermination(3, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executor.shutdown();
		System.out.println(atomicInt.get());
	}

}
