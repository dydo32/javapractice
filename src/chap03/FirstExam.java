package chap03;
public class FirstExam{
	public static void main(String[] args){
		//num1과 num2를 각각 선언(100,31)
		//각 연산의 결과를 출력(+,-,*,/,%)
		//ex) "더하기=>131" 의 유형으로 각각 출력하세요
		int num1 = 100;
		int num2 = 31;
		int result = 0; //처음에는 결과값이 없기 때문에 0으로 초기화.(지역변수는 초기값이 없으면 안됨)

		result = num1 + num2;
		System.out.println("더하기=>"+result);

		result = num1 - num2;
		System.out.println("빼기=>"+result);

		result = num1 * num2;
		System.out.println("곱하기=>"+result);

		result = num1 / num2;
		System.out.println("나누기,몫=>"+result);

		result = num1 % num2;
		System.out.println("나누기,나머지=>"+result);
	}
}