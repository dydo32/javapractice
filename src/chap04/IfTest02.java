package chap04;
////if ~ else문
import java.util.Random;
public class IfTest02{
	public static void main(String[] args) {
		//num이라는 랜덤수를 발생시키고 값이 90이상이면 합격출력
		//90미만이면 불합격 출력
		Random rand = new Random();
		int num = rand.nextInt(100)+1;

		System.out.println(num);
		if (num>=90){
			System.out.println("합격");
		}
		else{
			System.out.println("불합격");
		}
	}
}
