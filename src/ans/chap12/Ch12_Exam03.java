package ans.chap12;

import java.util.function.*;
import java.math.*;

public class Ch12_Exam03 {

	public static void main(String[] args) {
		
		DoublePredicate dp = value -> value > 3.14;
		boolean result = dp.test(10.0);
		System.out.println("dp.test (10.0) =" + result);

		LongSupplier ls = () -> System.currentTimeMillis();

		long result2 = ls.getAsLong();
		System.out.println("ls.getAsLong () =" + result2);

		DoubleToIntFunction dt = value -> new BigDecimal(value).intValue();

		int result3 = dt.applyAsInt(3.14);
		System.out.println("result =" + result3);
	}

}
