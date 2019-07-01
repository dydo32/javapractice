package chap04;
/*
 2. 원하는 달을 랜덤숫자로 발생시킨 후 12, 1, 2면 "겨울"
    3,4,5이면 "봄" 6,7,8이면 "여름" 9,10,11 "가을" 
    SwitchExam01.java
*/
import java.util.Random;

public class SwitchExam01{
	public static void main(String[] args){
		Random rand = new Random();
		int month = rand.nextInt(12)+1;

		System.out.println(month+"월");

		switch (month){
			case 12:
			case 1:
			case 2: 
				System.out.println("겨울");
				break;
			case 3:
			case 4:
			case 5: 
				System.out.println("봄");
				break;

			case 6:
			case 7:
			case 8: 
				System.out.println("여름");
				break;

			case 9:
			case 10:
			case 11: 
				System.out.println("가을");
				break;		
		}
	}
}
