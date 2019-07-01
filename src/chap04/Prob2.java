package chap04;
/*문제 2. 
 * 초기 값, 마지막 값, 증가분을 입력 받아서, 초기값부터 마지막 값까지, 
 * 증가분씩 값을 증가시키면서 각 값들의 총합을 구하는 프로그램을 작성하세요. 
 * 단, 합을 구한 결과가 1000 을 넘으면, 결과에 2000 을 한번 더 더하여 출력합니다.   
 * 실행 예 1)
 * 초기값을 정수로 입력하세요. : 1 
 * 마지막 값을 정수로 입력하세요. : 10    
 * 증가분을 정수로 입력하세요. : 1   
 * 총합은 55 입니다.  
 * 실행 예 2) 
 * 초기값을 정수로 입력하세요. : 10 
 * 마지막값을 정수로 입력하세요. : 100  
 * 증가분을 정수로 입력하세요. : 5   
 * 총합은 3045 입니다.  
 */
import java.util.Scanner;
public class Prob2 {
	
	public static void main(String[] args) {
		int start = 0 ;
		int end = 0;
		int step = 0 ;
		int sum = 0;
		
		Scanner keyboard = new Scanner(System.in); 

		System.out.print("초기 값을 정수로 입력하세요. : ");
		start = keyboard.nextInt();
		System.out.print("마지막 값을 정수로 입력하세요. : ");
		end = keyboard.nextInt();
		System.out.print("증가분을 정수로 입력하세요. : ");
		step =  keyboard.nextInt();
		
		/*  이곳에 프로그램을 완성하십시오. */
		int count=0;  
	
		for(int i=start; i<=end; i=i+step){
			sum = sum + start + (step*count);
			count++;
		}
		if(sum>1000){
			sum = sum+2000;
		}
		System.out.println("총합은 " + sum +" 입니다. "); 
		
	} 
	
}
