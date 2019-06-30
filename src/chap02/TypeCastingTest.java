package chap02;
//기본형에서 형변환
public class TypeCastingTest {
	public static void main(String[] args) {
		//1. 자동형변환
		byte b1 = 100;
		short s1 = b1;
		int i = s1;
		long l = i;
		float f = l;
		double d = f;
		System.out.println(d);
		
		char c = 'A';
		System.out.println(c);
		//char타입인 'A'가 저장된 c변수를 int형 변수에 전달
		int data = c;
		System.out.println(data);
		
		//int형 데이터를 char에 전달할 수 없다.(자동형변환이 안된다.)
		//char data2 = data;
		
		
		//2. 명시적형변환 - 강제로 타입을 변경
		//	데이터타입1 변수1 = (데이터타입1) 변수2
		byte b2 = (byte)200;
		System.out.println(b2);
		
		int chardata = 112;	//ascii
		char chardata2 = (char)chardata;
		System.out.println(chardata2);
		
		double per = (double)60/200*100;
		System.out.println(per+"%");
	}
}
