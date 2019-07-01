package chap06;

//여러 유형의 메소드를 정의하고 호출해보는 연습
public class MyMethod {
	// 4. 매개변수가 있고 리턴타입이 있는 메소드
	public int add(int num1, int num2){
		int result = 0;
		result = num1+num2;
		
		return result; //또는 return num1+num2;
	}
	
	// 2. 매개변수가 있고 리턴타입이 없는 메소드
	public void display(String str) { // 메소드 오버로딩(메소드명이 같은것), 사용자의 편의를 위해서.
		for (int i = 1; i <= 10; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	// 3. 매개변수 여러개 있고, 리턴타입이 없는 메소드
	public void display(String str, int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print(str);
		}
		System.out.println();
	}

	// 1. 매개변수가 없고 리턴타입도 없는 메소드
	// => *을 10개 출력하는 기능의 메소드
	public void display() { // ()는 메소드임을 구분하기위함 + 매개변수를 위함
		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
