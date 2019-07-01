package ans.chap11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Ch11_Exam10 {
	public static String convert(Calendar date, int type) {

		SimpleDateFormat df = null;

		switch (type) {
		case 1: {
			df = new SimpleDateFormat("yyyy- MM- dd");
			String today = df.format(date.getTime());
			return today;
		}
		case 2: {
			df = new SimpleDateFormat("yy년 M월 d일 E요일");
			String today = df.format(date.getTime());
			return today;

		}

		case 3: {
			df = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 a");
			String today = df.format(date.getTime());
			return today;
		}
		}
		return null;

	}

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(" 오늘 날짜 출력 서식의  타입을 고르시오 ");

		System.out.println(" Type 1. 2016- 02- 11");
		System.out.println("Type 2. 16년 2월 11일 목요일");
		System.out.println("Type 3. 2016-2-11	16 : 56 : 24  오후");

		Scanner sc = new Scanner(System.in);
		System.out.print("선택 (1,2,3) : ");
		int type = sc.nextInt();

		System.out.println(convert(today, type));
	}
}
