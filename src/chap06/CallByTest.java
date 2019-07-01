package chap06;

public class CallByTest {
	public static void main(String[] args) {
		int num = 10;
		int[] myarr = { 100, 200, 300, 400, 500 };
		System.out.println("*****change호출전*****");
		display(num, myarr);
		
		change(num, myarr);
		System.out.println();
		System.out.println("*****change호출후*****");
		display(num, myarr);
		
	}
	// 값을 변경하는 메소드
	private static void change(int num, int[] myarr) {
		num = 20;
		myarr[1] = 7777777;
	}
	// 값을 출력하는 메소드
	public static void display(int num, int[] myarr){ // static없으면 main에서 호출못함->7장에서배움
		System.out.println("기본형(int) 매개변수 num==>" + num);
		System.out.println("참조형(int[]) 매개변수 myarr");
		for (int i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i] + "\t");
		}
		System.out.println();
	}
}
