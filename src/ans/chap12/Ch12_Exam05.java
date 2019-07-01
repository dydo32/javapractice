package ans.chap12;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ch12_Exam05{

	public static void main(String[] args) {
		String[] values = { "风府", "风技", "风坷", "风摹酒" };

		Stream<String> stream = Arrays.stream(values);
		Object[] objects = stream.toArray();
		for (Object result : objects) {
			System.out.println(result);
		}

		Arrays.stream(values).toArray(count -> {
			System.out.println("count=" + count);
			return new String[count];
		});

	}

}
