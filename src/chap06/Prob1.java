package chap06;

/*����1.
 * Prob1�� main()�޼ҵ忡�� ������ �迭�� �ʱ�ȭ�Ǿ� �ִ�.
 * �� �迭�� �Ű������� �޾Ƽ� �迭�� ������ Ȧ��, ¦������ �����Ͽ�
 * Ȧ���� �հ� ¦���� ���� �Ʒ��� ���� ����� �� �ֵ��� �����ϼ���.
 * [��°��]
 * (�迭 ia)
 * Ȧ���� �� : 26
 * ¦���� �� : 32
 * (�迭 ib)
 * Ȧ���� �� : 9
 * ¦���� ��: 6

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
