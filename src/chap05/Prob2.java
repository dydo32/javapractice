package chap05;

import java.util.Random;

/*2.
 * 1부터 100사이의 난수를 발생시켜서 배열의 원소로 초기화하고 출력하기 (Prob2.java)
 * 1)생성 할 배열은 int 타입이며, 개수는 5개입니다.
 * 2)1부터 100사이의 난수를 발생시켜 배열 원소들을 초기화합니다.
 * - Random클래스 nextInt(정수)를 이용
 * 3)각 배열의 원소들을 출력합니다
 * [결과]
 * 39 24 36 42 81 */
public class Prob2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++){
			arr[i]= rand.nextInt(100)+1;
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

}
