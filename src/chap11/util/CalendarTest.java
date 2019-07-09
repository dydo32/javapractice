package chap11.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

//��¥, �ð��� ���� �۾�
public class CalendarTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		System.out.println(cal);
		System.out.print(cal.get(Calendar.YEAR) + "��");
		// Calendar.MONTH�� �ε����� 0���� ������
		System.out.print((cal.get(Calendar.MONTH) + 1) + "��");
		System.out.print(cal.get(Calendar.DATE) + "��");
		System.out.print(cal.get(Calendar.HOUR) + "��");
		System.out.print(cal.get(Calendar.MINUTE) + "��");
		System.out.println(cal.get(Calendar.SECOND) + "��");
		System.out.println(cal.getTimeInMillis());
		
		//�̼�1. ���ú��� ___�� ���� dday���.
		Calendar today = new GregorianCalendar();
		Calendar dday = new GregorianCalendar();
		dday.set(2019, 6, 21); 	//month the value used to set the MONTH 
								//calendar field.Month value is 0-based. e.g., 0 for January
		System.out.println(today.getTime());
		System.out.println(dday.getTime());
		long time = dday.getTimeInMillis() - today.getTimeInMillis();
		System.out.println(time);
		System.out.println(time/(1000*60*60*24));
		
		// �޼ҵ�� ����� �̿� - �Ϸ縦 24��, 12�� ����� ���
		// - ������ ����
	}
}
