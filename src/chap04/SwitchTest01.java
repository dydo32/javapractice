package chap04;

import java.util.Random;

//if else if로 표현했던 코드를 switch로 변경
public class SwitchTest01 {
	public static void main(String[] args) {
		Random rand = new Random();
		int ssn = rand.nextInt(5)+1; //랜덤수 주민번호 7번째 숫자
		
		System.out.println(ssn);
		switch(ssn){	//ssn은 평가할 값이 저장된 변수
		case 1:			//or 연산식 or 메소드호출문을 정의할 수 있음
			System.out.println("남자");	//case문을 이용해서 ssn을 평가
			break;						//case문에 정의한 값과 정확하게 일치하는 지 비교
		case 2 :
			System.out.println("여자");
			break;
		case 3:
			System.out.println("남자");
			break;
		case 4 :
			System.out.println("여자");
			break;
		default : 	//if의 else역할
			System.out.println("기타");
		}
	}
}
