package chap04;
/*
	2.IfExam02.java작성하기
	  jumsu와 count변수를 int로 선언하고 랜덤수를 저장합니다.
	  jumsu -> 1부터 100까지 (실기점수)
	  count -> 1부터 3까지 (응시횟수)

	  - 점수가 60점 이상이면 "통과"출력
	  - 60점 미만인 경우 응시횟수가 3번 미만이면 "재시험"출력
	  - 응시횟수가 3번이면 "필기부터 다시" 출력

	  완료 후 제출하기.
*/
import java.util.Random;

public class IfExam02{
	public static void main(String[] args) {
		Random rand = new Random();
		int jumsu = rand.nextInt(100)+1;
		int count = rand.nextInt(3)+1;

		System.out.println("실기점수=>"+jumsu+", 응시횟수=>"+count);
		if(jumsu>=60){
			System.out.println("통과");
		} else{
			if(count<3){
				System.out.println("재시험");
			}
			else{
				System.out.println("필기부터 다시");
			}
		}
	}
}
