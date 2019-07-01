package chap05;
//배열의 선언과 생성과 초기화를 한 문장으로 정의
public class ArrayTest04 {
	public static void main(String[] args) {
		// 타언어에서 주로 사용하는 배열선언 방식으로 ','로 구분된 갯수가 배열 요소의 갯수
		int[] myarr = { 10, 20, 30, 40, 50 };
		System.out.println(myarr.length);
		for (int i = 0; i < myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		
		// 자바답게 배열의 선언과 생성과 초기화를 동시에 작업
		int[] myarr2 = new int[] { 10, 20, 30, 40, 50, 60 };
		System.out.println(myarr2.length);
		for (int i = 0; i < myarr2.length; i++) {
			System.out.println(myarr2[i]);
		}
		
		// String타입의 배열 - String기본형처럼 리터럴로 표현이 가능
		String str = new String("java");
		String srt2 = "java"; // 원래 기본형과 참조형 구분이 명확한데 String은 자주 쓰여
								// 리터럴로 표현이 가능하게 함, 그러나 기본형 아니고 참조형이다.
		String[] myarr3 = { "java", "oracle", "jdbc" };
		for (int i = 0; i < myarr3.length; i++) {
			System.out.println(myarr3[i]);
		}
		System.out.println("배열의 길이 " + myarr3.length);
	}
}
