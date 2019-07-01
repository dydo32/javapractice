package ans.chap13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Ch13_Exam05{
	static AtomicReferenceArray<String>
	 ara = new AtomicReferenceArray<String>(10);

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(2);

		Runnable r1 = () -> {
			ara.set(0, "Dominica_kim");
			ara.compareAndSet(0, "Dominica_kim", "RuRi_Lee");
			System.out.println(ara.get(0));
			ara.weakCompareAndSet(0, "Dominica_kim", "RuRo");
			System.out.println(ara.get(0));
		};
		executor.execute(r1);
		executor.shutdown();	
	
	}
}
