package chap06;

/*문제1.
 * Prob1의 main()메소드에는 정수형 배열이 초기화되어 있다.
 * 이 배열을 매개변수로 받아서 배열의 내용을 홀수, 짝수인지 구분하여
 * 홀수의 합과 짝수의 합을 아래와 같이 출력할 수 있도록 구현하세요.
 * [출력결과]
 * (배열 ia)
 * 홀수의 합 : 26
 * 짝수의 합 : 32
 * (배열 ib)
 * 홀수의 합 : 9
 * 짝수의 합: 6

*/
public class Prob1 {
	public static void main(String[] args) {

		int[] ia = new int[] { 3, 7, 1, 8, 10, 2, 15, 2, 10 };
		int[] ib = new int[] { 1, 2, 3, 4, 5 };

		MyMethodUtil myutil = new MyMethodUtil();

		myutil.printHap(ia, "ia");
		myutil.printHap(ib, "ib");

	}
}
