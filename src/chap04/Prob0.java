package chap04;

/*���� 0.  
 * 1 ���� 1000 ������ Ȧ���� ��,¦���� ��, ������ ����ϼ���  
 * <�������>  
 * 1 ���� 1000 ������ ����________  
 * 1 ���� 1000 ���� Ȧ���� ��_______  
 * 1 ���� 1000 ���� ¦���� ��_______
 */
public class Prob0 {
	public static void main(String[] args) {
		int sum = 0;
		int odd = 0;
		int even = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
			sum = sum + i;
		}
		System.out.println("1 ���� 1000������ ���� "+sum);
		System.out.println("1 ���� 1000���� Ȧ���� �� "+odd);
		System.out.println("1 ���� 1000���� ¦���� �� "+even);
	}
}
