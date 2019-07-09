package chap11.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

//��µǴ� �������� ������ ������ �� �ִ� Ŭ����
//�־��� ������ �����ؼ� ��������� ����
public class FormatTest {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		Calendar today = new GregorianCalendar();
		//��¥��ü�� SimpleDateFormat�� format�����ϱ�
		String date = sdf.format(today.getTime());
		System.out.println("format�� ������ ��¥ ������=> "+date);
		
		DecimalFormat df = new DecimalFormat("#,###.##");
		try {
			double num = (Double)df.parse("123456.785");
			System.out.println(df.format(num));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
