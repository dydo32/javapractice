package chap04;

import java.util.Scanner;

/* 4-6. 성적처리프로그램
 *  [조건]
 *  1)중간고사, 기말고사, 레포트, 출석 점수를 입력받아서 계산한다.
 *  2)성적은 아래에 준한 점수를 합산 하되 소수 이하 2자리까지 출력하라.
 *   a)(중간+기말)/2 -> 60%
 *   b)레포트 -> 20%
 *   c)출석 -> 20%
 *  3)학점의 기준. (if~else if문 이용)
 *   a)90점 이상 'A'학점
 *   b)80점 이상 'B'학점
 *   c)70점 이상 'C'학점
 *   d)60점 이상 'D'학점
 *   e)나머지 'F'학점
 *  4)평가기준(switch문 이용)
 *   a)A, B학점 -> "excellent"
 *   b)C, D학점 -> "good"
 *   c)F학점 -> "poor"
 *  5)출력 화면
 *   점수를 입력 하세요(중간고사, 기말고사, 레포트, 출석점수) : 90 89 99 100
 *    -----결과입니다-----
 *   중간고사 : 90
 *   기말고사 : 89
 *   과제점수 : 99
 *   출석점수 : 100
 *   성적 : 93.20
 *   학점 : A
 *   평가 : excellent
 */
public class Ch04_Exam06 {
	public static void main(String[] args) {
		int midterm = 0;
		int finals = 0;
		int report = 0;
		int attend = 0;
		double score = 0;
		char grade;
		String evalu = null;
		Scanner key = new Scanner(System.in);

		System.out.print("점수를 입력 하세요(중간고사, 기말고사, 레포트, 출석점수) : ");
		midterm = key.nextInt();
		finals = key.nextInt();
		report = key.nextInt();
		attend = key.nextInt();
		score = (midterm + finals) / 2 * 0.6 + report * 0.2 + attend * 0.2;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else  {
			grade = 'F';
		}
		
		switch(grade){
		case 'A':
		case 'B':
			evalu = "excellent";
			break;
		case 'C':
		case 'D':
			evalu = "good";
			break;
		case 'F':
			evalu = "poor";
			break;
		}

		System.out.println(" -----결과입니다-----");
		System.out.println("중간고사 : " + midterm);
		System.out.println("기말고사 : " + finals);
		System.out.println("과제점수 : " + report);
		System.out.println("출석점수 : " + attend);
		System.out.println("성적 : " + score);
		System.out.println("학점 : " + grade);
		System.out.println("평가 : " + evalu);

	}
}
