package ans.chap12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class Ch12_Exam06 {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(new Integer[] { 1, 2, 3, 4,
				5, 6, 8, 9, 11, 13, 14, 15, 17, 18, 19, 20 });

		Map<String, Integer> evenOddSumMap = integerList.stream().collect(
				Collectors.groupingBy((i) -> (i % 2 == 0) ? "even" : "odd",
						Collectors.reducing(0, (i1, i2) -> i1 + i2)));
		System.out.println(evenOddSumMap);

	}

}
