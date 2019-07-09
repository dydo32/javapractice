package chap11.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

//날짜, 시간에 대한 작업
public class CalendarTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		System.out.println(cal);
		System.out.print(cal.get(Calendar.YEAR) + "년");
		// Calendar.MONTH는 인덱스가 0부터 시작함
		System.out.print((cal.get(Calendar.MONTH) + 1) + "월");
		System.out.print(cal.get(Calendar.DATE) + "일");
		System.out.print(cal.get(Calendar.HOUR) + "시");
		System.out.print(cal.get(Calendar.MINUTE) + "분");
		System.out.println(cal.get(Calendar.SECOND) + "초");
		System.out.println(cal.getTimeInMillis());
		
		//미션1. 오늘부터 ___일 까지 dday계산.
		Calendar today = new GregorianCalendar();
		Calendar dday = new GregorianCalendar();
		dday.set(2019, 6, 21); 	//month the value used to set the MONTH 
								//calendar field.Month value is 0-based. e.g., 0 for January
		System.out.println(today.getTime());
		System.out.println(dday.getTime());
		long time = dday.getTimeInMillis() - today.getTimeInMillis();
		System.out.println(time);
		System.out.println(time/(1000*60*60*24));
		
		// 메소드와 상수를 이용 - 하루를 24시, 12시 나누어서 계산
		// - 요일의 정보
	}
}
