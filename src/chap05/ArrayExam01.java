package chap05;

import java.util.Scanner;

//기본형 배열을 선언, 생성, 초기화
public class ArrayExam01 {

	public static void main(String[] args) {
		//int형 배열변수 myarr선언 100,200,300을 할당하고
		//2번째 요소의 값을 출력하기
		int[] myarr = new int[] {100, 200, 300};
		System.out.println(myarr[1]);
		
		//int형 배열 myarr2를 선언하고 Scanner를 이용해서 입력받은 숫자 3개를  초기값으로 설정
		int[] myarr2 = new int[3];
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자1: ");
		myarr2[0] = scn.nextInt();
		System.out.print("숫자2: ");
		myarr2[1] = scn.nextInt();
		System.out.print("숫자3: ");
		myarr2[2] = scn.nextInt();
		System.out.println(myarr2[2]);
	}

}
