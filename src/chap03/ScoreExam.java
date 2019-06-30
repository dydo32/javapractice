package chap03;
/*
	1. ScoreExam.java작성
	- kor, eng, math변수를 선언
	- 임의의 점수를 할당
	- 세 과목의 합계와 평균을 다음과 같이 출력하세요
	[출력형태]
	전체 총합계=>_____
	평균=>____
*/

public class ScoreExam{
	public static void main(String[] args) {
		int kor = 100;
		int eng = 70;
		int math = 90;
		int sum = 0;
		int avg = 0;

		sum = kor + eng + math;
		avg = sum/3;

		System.out.println("전체 총합계=>"+sum);
		System.out.println("평균=>"+avg);
	}
}
