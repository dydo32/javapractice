package chap02;
//�⺻������ ����ȯ
public class TypeCastingTest {
	public static void main(String[] args) {
		//1. �ڵ�����ȯ
		byte b1 = 100;
		short s1 = b1;
		int i = s1;
		long l = i;
		float f = l;
		double d = f;
		System.out.println(d);
		
		char c = 'A';
		System.out.println(c);
		//charŸ���� 'A'�� ����� c������ int�� ������ ����
		int data = c;
		System.out.println(data);
		
		//int�� �����͸� char�� ������ �� ����.(�ڵ�����ȯ�� �ȵȴ�.)
		//char data2 = data;
		
		
		//2. ���������ȯ - ������ Ÿ���� ����
		//	������Ÿ��1 ����1 = (������Ÿ��1) ����2
		byte b2 = (byte)200;
		System.out.println(b2);
		
		int chardata = 112;	//ascii
		char chardata2 = (char)chardata;
		System.out.println(chardata2);
		
		double per = (double)60/200*100;
		System.out.println(per+"%");
	}
}
