package chap11.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

//출력되는 데이터의 형식을 변경할 수 있는 클래스
//주어진 패턴을 적용해서 출력형식을 결정
public class FormatTest {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		Calendar today = new GregorianCalendar();
		//날짜객체에 SimpleDateFormat의 format적용하기
		String date = sdf.format(today.getTime());
		System.out.println("format을 적용한 날짜 데이터=> "+date);
		
		DecimalFormat df = new DecimalFormat("#,###.##");
		try {
			double num = (Double)df.parse("123456.785");
			System.out.println(df.format(num));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
