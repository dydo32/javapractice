package ans.chap12;

import java.util.*;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Ch12_Exam04 {
	public static void main(String[] args) {

		int[] intValues = { 1, 2, 3 };
		long[] longValues = { 1L, 2L, 3L };
		double[] dblValues = { 0.1, 0.2, 0.3 };

		System.out.println("----- sum ---");
		IntStream intStream = Arrays.stream(intValues);

		int intSumResult = intStream.sum();
		System.out.println("intStream.sum () :" + intSumResult);

		LongStream longStream = Arrays.stream(longValues);
		long longSumResult = longStream.sum();

		System.out.println("longStream.sum () :" + longSumResult);

		DoubleStream doubleStream = Arrays.stream(dblValues);
		double doubleSumResult = doubleStream.sum();

		System.out.println("doubleStream.sum () :" + doubleSumResult);

		System.out.println("----- average -----");
		System.out.println(Arrays.stream(intValues).average());

		System.out.println(Arrays.stream(longValues).average());

		System.out.println(Arrays.stream(dblValues).average());

	}
}
