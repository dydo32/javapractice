package chap04;

/*문제 0.  
 * 1 부터 1000 까지의 홀수의 합,짝수의 합, 총합을 출력하세요  
 * <출력형태>  
 * 1 부터 1000 까지의 총합________  
 * 1 부터 1000 까지 홀수의 합_______  
 * 1 부터 1000 까지 짝수의 합_______
 */
public class Prob0 {
	public static void main(String[] args) {
		int sum = 0;
		int odd = 0;
		int even = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
			sum = sum + i;
		}
		System.out.println("1 부터 1000까지의 총합 "+sum);
		System.out.println("1 부터 1000까지 홀수의 합 "+odd);
		System.out.println("1 부터 1000까지 짝수의 합 "+even);
	}
}
