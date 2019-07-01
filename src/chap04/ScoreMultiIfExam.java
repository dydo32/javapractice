package chap04;
//if~else if...else... - 다중 if문

/*
	4. ScoreMultifIfExam.java
	   1부터 120까지의 랜덤수를 이용해서 학점을 출력
	   90~100: A학점
	   80~89 : B학점
	   70~79 : C학점
	   60~69 : D학점
	   1~59	 : F학점
	   단, 1보다 작고 100보다 큰 값이 입력되면 잘못입력이라는 메시지를 출력

	   제출
*/
import java.util.Random;

public class ScoreMultiIfExam{
	public static void main(String[] args) {
		Random rand = new Random();
		int score = rand.nextInt(120)+1;

		System.out.println("score=>"+score);
		if(score<1 | score>100){
			System.out.println("잘못입력");
		} else if(score>=90){
			System.out.println("A학점");
		} else if(score>=80){
			System.out.println("B학점");
		} else if(score>=70){
			System.out.println("C학점");
		} else if(score>=60){
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
	}
}
