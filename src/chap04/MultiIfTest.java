package chap04;

import java.util.Scanner;

public class MultiIfTest {
	public static void main(String[] args) {
		Scanner ssn = new Scanner(System.in);
		System.out.print("1,2,3,4 중 입력하세요: ");
		int num = ssn.nextInt();
		if(num==1 | num==3){
			System.out.println("남자");
		} else if(num==2 | num ==4){
			System.out.println("여자");
		} else{
			System.out.println("기타");
		}
	}
}
