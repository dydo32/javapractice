package chap04;

import java.util.Scanner;

/*1.
 *  WhileExam01.java
 * 	Scanner를 이용하여 단을 입력받은 후 입력받은 단의 구구단을 출력
 *  [출력형태]
 *  단:7
 *  7*1 = 7
 *  ...
 *  7*9 = 63
 */
public class WhileExam_GuGu {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("구구단 단을 입력하세요.");
		System.out.print("단: ");
		 
		int dan = key.nextInt();
		int i = 1;
		int result = 0;
		while(i<=9){
			result = dan * i;
			System.out.println(dan + "*" + i + " = " + result);
			i++;
		}
	}
}
