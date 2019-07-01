package chap04;
/*
	1.IfExam01.java작성하기
	  랜덤수를 입력받아 음수, 양수를 평가하여 출력합니다.
	  단, 양수인 경우 짝수홀수도 같이 평가하여 출력합니다.
	  ex) -111123
	      -111123은 음수입니다.

		  123458
		  123458은 양수이며 짝수입니다.

		  123457
		  123457은 양수이며 홀수입니다.
*/
import java.util.Random;

public class IfExam01{
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt();

		System.out.println(num);
		if(num>=0){
			if(num%2==0){
				System.out.println(num+"은 양수이며, 짝수입니다.");
			} else {
				System.out.println(num+"은 양수이며, 홀수입니다.");
			}
		} else {
			System.out.println(num+"은 음수입니다.");
		}
	}
}
