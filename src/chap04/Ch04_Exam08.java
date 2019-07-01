package chap04;

import java.util.Random;

/*4-8. 50개의 난수 출력
 * [조건]
 * 1) 1-100 사이의 수만 출력 되게 한다.
 * 2) 1중에 6개씩 표시한다.
 * [실행 결과]
 * 18	11	4	27	55	6
 * 62	86	84	89	82	57
 * ...
 * 41	32
 * 합:____
 */
public class Ch04_Exam08 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		Random rand = new Random();
		
		for (int i = 1; i <= 50; i++) {
			num = rand.nextInt(100) + 1;
			sum = sum + num;
			System.out.print(num + "\t");
			if (i % 6 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("합: " + sum);
	}
}
