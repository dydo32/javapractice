package chap05;

//예제2 - 배열에 저장된 모든 숫자의 합과 평균을 구하기
//[출력형태]
//총합:___
//평균:___
public class ArrayExam03 {

	public static void main(String[] args) {
		int[] myarr = { 98, 88, 78, 100, 98, 56 };
		int total = 0;
		int avg = 0;

		for (int i = 0; i < myarr.length; i++) {
			total = total + myarr[i];
		}
		avg = total / myarr.length;

		System.out.println("총합: " + total);
		System.out.println("평균: " + avg);

	}
}
