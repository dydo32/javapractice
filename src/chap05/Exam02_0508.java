package chap05;

/*����2.
 * ���������� ����� ��� �ǵ��� Exam02_0508.java �� �ϼ��Ͻÿ�. 
 * 		    ���� �迭
 * =====================
 * A	B	C	D	E
 * F	G	H	I	J
 * K	L	M	N	O
 * P	Q	R	S	T
 * U	V	W	X	Y
 *      ������ �迭
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

		System.out.println("                           ���� �迭");
		System.out.println("===================================");
		// 1.�迭�� ���ĺ� �Է�
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				alphabet[i][j] = start;
				start++;
			}
		}
		// 2.���� �迭 ���
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				System.out.print(alphabet[i][j] + "\t");
			}
			System.out.println();
		}

		// 3. �迭 ����
		System.out.println("                           ������ �迭");
		System.out.println("===================================");
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				if (i == j) {
					alphabet[i][j] = '*';
				}
			}
		}
		// 4. ������ �迭 ���
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				System.out.print(alphabet[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
