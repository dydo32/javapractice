package chap03;
public class PrimitiveTypeLiteral{
	public static void main(String[] args){
		boolean bool = true; //true or false
		System.out.println(bool);
		char c = 'a'; //char타입의 리터럴은 ''로 표현한다.
		System.out.println(c);

		//정수형
		//정수형 변수에 할당되는 리터럴은 기본 데이터 타입이 int
		byte b = 127; //byte = int  
		System.out.println(b);
		
		short s = 32767; //short = int
		System.out.println(s);

		int i = 2147483647;
		System.out.println(i);

		long l = 1000; //long = int
		long l2 = 1000L;	//숫자뒤에 접미사 L이나 l을 추가하면 리터럴의 타입이 long형으로 변환된다.
							//long = long
		System.out.println(l);
		System.out.println(l2);

		//실수형 - 소숫점을 표현(리터럴의 기본 타입은 double)
		float f = 10.5f;	//float = double
							//실수 뒤에 f나 F를 추가하면 float형의 리터럴로 변경된다.
		System.out.println(f);
		
		double d = 10.5;
		System.out.println(d);

		double num = 10/3;
		System.out.println(num);
	}
}
