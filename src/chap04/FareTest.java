package chap04;

import java.util.Scanner;

//수도요금 프로그램
public class FareTest {
	public static void main(String[] args) {
		int menu = 0;
		int use = 0;
		int useTotal;
		int liter = 0;
		double total = 0;
		Scanner key = new Scanner(System.in);

		System.out.println("----Menu------------");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("2. 상업용 (liter당 45원)");
		System.out.println("3. 공업용 (liter당 30원)");
		System.out.println("--------------------");
		System.out.println("메뉴를 선택하세요=>");
		System.out.println("--------------------");
		menu = key.nextInt();
		System.out.println("사용량을 입력하세요=>");
		use = key.nextInt();

		switch (menu) {
		case 1:
			liter = 50;
			break;
		case 2:
			liter = 45;
			break;
		case 3:
			liter = 30;
			break;
		}
		useTotal = use * liter;
		total = useTotal + useTotal*0.05; 
		System.out.println("====================");
		System.out.println("사용자 코드: " + menu);
		System.out.println("사용 요금: " + useTotal); // 사용요금= 사용량*리터당가격
		System.out.println("총수도 요금: " + total); // 총수도 요금= 수도사용요금+세금(요금의 5%)
		System.out.println("====================");
	}

}
