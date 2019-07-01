package chap04;

import java.util.Scanner;

/*1.
 *  ForExam01.java
 * 	Scanner를 이용하여 단을 입력받은 후 입력받은 단의 구구단을 출력
 *  [출력형태]
 *  단:7
 *  7*1 = 7
 *  ...
 *  7*9 = 63
 */
public class ForExam01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("구구단 단을 입력하세요.");
		System.out.print("단: ");
		int num = key.nextInt();
		
		int result = 0;
		for(int i=1; i<=9; i++){
			result = num*i;
			System.out.println(num+"*"+i+" = "+result);  //(dan*i)써도 됨
		}
	}

}
