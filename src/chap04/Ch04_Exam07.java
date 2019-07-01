package chap04;

import java.util.Scanner;

/*4-7. 평년,윤년 구하는 프로그램
 * [조건]
 * 두 조건을 모두 만족해야 윤년임
 * 1)년도가 4로 나누어 떨어져야함.
 * 2)년도가 100으로 나누어 떨어지지 않거나 년도를 400으로 나누어 떨어져야함
 * [tip]
 * 4(윤년), 100(평년), 400(윤년)임.
 * [실행결과]
 * 년도 입력 : 2014
 * 평년
 * 년도 입력 : 2017
 * 평년
 * 년도 입력 : 4
 * 윤년
 * 년도 입력 :
 */
public class Ch04_Exam07 {
	public static void main(String[] args) {
		int year = 0;
		Scanner key = new Scanner(System.in);

		for (;;) {
			System.out.print("년도 입력 : ");
			year = key.nextInt();
			
			if(year % 4==0){
				if(year % 400 ==0){
					System.out.println("윤년");
				} else if(year % 100==0){
					System.out.println("평년");	
				}else{
					System.out.println("윤년");
				}
			} else{
				System.out.println("평년");
			}
		}
	}
}
