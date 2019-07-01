package ans.chap11;

import java.util.Calendar;
import java.util.Scanner;

public class Ch11_Exam07 {

	public static void main(String[] args) {		

		Scanner scan = new Scanner(System.in);
		System.out.print("year : ");
		String year = scan.next();
		System.out.print("month : ");
		String month = scan.next();
		
		Calendar c = Calendar.getInstance(); // Calendar 객체 생성
		// set메소드를 통해 연도 월 일 을 설정
		c.set(Calendar.YEAR, Integer.valueOf(year));
		c.set(Calendar.MONTH, Integer.valueOf(month) - 1); // 시작 일이 1이 아닌 0부터
															// 시작하여 1을 빼줌니다
		c.set(Calendar.DAY_OF_MONTH, 1); // 처음 시작요일설정

		int dayofweek = c.get(Calendar.DAY_OF_WEEK);
		// 일 = 1 월 =2 화 =3 ..
		c.set(Calendar.DAY_OF_MONTH, 32); // 32 이상일땐 마지막 요일로 자동 설정
		int lastday = 32 - c.get(Calendar.DAY_OF_MONTH);

		int i = 0;

		System.out.println("일\t월\t화\t수\t목\t금\t토");

		for (; i < dayofweek - 1; i++) {
			System.out.print("\t");
		}

		for (int day = 1; day <= lastday; day++, i++) {
			if (i % 7 == 0) {
				System.out.println("");
			}
			System.out.print(day + "\t");
		}
	}

}
