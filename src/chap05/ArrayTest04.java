package chap05;
//�迭�� ����� ������ �ʱ�ȭ�� �� �������� ����
public class ArrayTest04 {
	public static void main(String[] args) {
		// Ÿ���� �ַ� ����ϴ� �迭���� ������� ','�� ���е� ������ �迭 ����� ����
		int[] myarr = { 10, 20, 30, 40, 50 };
		System.out.println(myarr.length);
		for (int i = 0; i < myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		
		// �ڹٴ�� �迭�� ����� ������ �ʱ�ȭ�� ���ÿ� �۾�
		int[] myarr2 = new int[] { 10, 20, 30, 40, 50, 60 };
		System.out.println(myarr2.length);
		for (int i = 0; i < myarr2.length; i++) {
			System.out.println(myarr2[i]);
		}
		
		// StringŸ���� �迭 - String�⺻��ó�� ���ͷ��� ǥ���� ����
		String str = new String("java");
		String srt2 = "java"; // ���� �⺻���� ������ ������ ��Ȯ�ѵ� String�� ���� ����
								// ���ͷ��� ǥ���� �����ϰ� ��, �׷��� �⺻�� �ƴϰ� �������̴�.
		String[] myarr3 = { "java", "oracle", "jdbc" };
		for (int i = 0; i < myarr3.length; i++) {
			System.out.println(myarr3[i]);
		}
		System.out.println("�迭�� ���� " + myarr3.length);
	}
}
