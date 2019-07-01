package chap05;

/*문제2.
 * 다음과같은 결과가 출력 되도록 Exam02_0508.java 를 완성하시오. 
 * 		    원본 배열
 * =====================
 * A	B	C	D	E
 * F	G	H	I	J
 * K	L	M	N	O
 * P	Q	R	S	T
 * U	V	W	X	Y
 *      수정된 배열
 * =====================
 * *	B	C	D	E
 * F	*	H	I	J
 * K	L	*	N	O
 * P	Q	R	*	T
 * U	V	W	X	*
 * */
public class Exam02_0508 {

	public static void main(String[] args) {
		char[][] alphabet = new char[5][5];
		char start = 'A';

		System.out.println("                           원본 배열");
		System.out.println("===================================");
		// 1.배열에 알파벳 입력
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				alphabet[i][j] = start;
				start++;
			}
		}
		// 2.원본 배열 출력
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				System.out.print(alphabet[i][j] + "\t");
			}
			System.out.println();
		}

		// 3. 배열 수정
		System.out.println("                           수정된 배열");
		System.out.println("===================================");
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				if (i == j) {
					alphabet[i][j] = '*';
				}
			}
		}
		// 4. 수정된 배열 출력
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				System.out.print(alphabet[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
