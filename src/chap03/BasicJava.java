package chap03;

public class BasicJava {
	public static void main(String[] args) {
		int num1 = 100; // num1이라는 변수를 선언하고 100을 할당해라
		System.out.println("num1");
		System.out.println(num1);
		System.out.println("num1=>" + num1);

		/*
		 * 여러줄로 표현하는 주석문
		 */

		// num2라는 변수를 선언하고 200을 할당한 후에 num2의 값을 출력
		int num2 = 200;
		System.out.println("num2=>"+num2);

		//num1과 num2를 더해서 더한 결과를 result변수에 저장한 후에 출력
		//연산자
		/*
		 * 더하기 : +
		 * 빼기 : -
		 * 곱하기 : *
		 * 나누기 : / (몫)
		 * 		 % (나머지)
		 */
		
		int result = num1 + num2;
		System.out.println("result=>"+result);
	}
}
