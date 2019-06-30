package chap03;
//비교연산자(수치비교) - true나 false의 결과를 리턴
public class OprTest02 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		int num3 = 100;
		//num1이 +연산자에 의해서 문자열화 되므로 >연산을 할 수 없다.
		//=> 연산자 우선순위에 의해서 +연산이 먼저 실행되어
		//num1>num2==>100이라는 문자열과 200을 비교하므로 비교할 수 없다. 괄호가없을경우
		System.out.println("num1>num2==>"+(num1>num2));
		System.out.println("num1>=num2==>"+(num1>=num2));
		System.out.println("num1<num2==>"+(num1<num2));
		System.out.println("num1<=num2==>"+(num1<=num2));
		System.out.println("num1==num3==>"+(num1==num3));
		System.out.println("num1!=num3==>"+(num1!=num3));
	}
}
