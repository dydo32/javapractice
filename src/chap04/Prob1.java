package chap04;
/*문제 1. 
 * 1 보다 크고 10 보다 작은 정수를 입력받아서 아래와 같은 실행 결과가 나타나도록 
 * Prob1 클래스의 main 메소드를 완성하십시오. 
 * 입력받은 숫자에 해당하는 구구단을 완성시키는 프로그램입니다.   
 * 2 보다 작거나 9 보다 큰 정수가 입력될 경우에는 “잘못된 숫자가 입력되었습니다.”
 * 라는 경고 메 시지를 출력하고 프로그램을 종료합니다.  
 * 1 보다 크고 10 보다 작은 정수를 입력하세요. : 3  
 * 3 * 1 = 3  
 * 3 * 2 = 6  
 * 3 * 3 = 9  
 *  ...    
 * 3 * 9 = 27     
 */
import java.util.Scanner;
public class Prob1 {

	public static void main(String[] args) {

		int inputInt = 0;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		inputInt = keyboard.nextInt();
		// 프로그램을 구현하세요.
		if(inputInt<2 | inputInt>9){
			System.out.println("잘못된 숫자가 입력되었습니다.");
		} else{
			for(int i = 1; i<=9; i++){
				System.out.println(inputInt+" * "+i+ " = " +inputInt*i);
			}
		}
	}
}
