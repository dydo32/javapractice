package chap04;

import java.util.Scanner;

/*문제 3. 
 * 소수란 자신과 1 외의 다른 수로는 나누어 떨어지지 않는 정수입니다.  
 * 아래와 같이 2~100사이의 숫자를 입력하면 소수인지 여부를 판별하는 프로그램을 작성하십시오.
 * 실행 예 1)
 *  2 ~ 100 사이의 정수를 입력하세요. : 47 
 *  47 는(은) 소수입니다.  
 * 실행 예 2) 
 *  2 ~ 100 사이의 정수를 입력하세요. : 93
 *  93 는(은) 소수가 아닙니다. 
 *   
 *  *참고 : 2 부터 100 사이의 소수는 다음과 같습니다.  프로그램 테스트에 참고하기 바랍니다.
 *    2,  3,  5,  7,  11,  13,  17,  19,  23,  29,  31,  
 *    37,  41,  43,  47,  53,  59, 61,  67,  71,  73,  
 *    79,  83,  89,  97  
 */
public class Prob3 {
	public static void main(String[] ars){
		Scanner scn = new Scanner(System.in);
		int num = 0;
		
		System.out.print("2 ~ 100사이의 정수를 입력하세요.: ");
		num = scn.nextInt();
		
		int check = 0;
		for(int i = 2; i < num; i++){
			if(num%i==0){
				check++;
			}
		}
		
		if(check == 0){
			System.out.println(num+" 는(은) 소수입니다.");
		}else{
			System.out.println(num+" 는(은) 소수가아닙니다.");
		}
	}
}
