package chap06;

//�⺻���� ������������ ������ ����, �ڹ� ����
public class TypeTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		System.out.println("**�⺻����**");
		if (i == j) {
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���");
		}

		System.out.println("**��������**");
		String str1 = new String("java");
		String str2 = new String("java");
		// str1=str2; �ϸ� �������� �ٸ��ٶ�� ���´�.
		if (str1 == str2) {
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���");
		}

		System.out.println("**���ڿ���**");
		if (str1.equals(str2)) {
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���");
		}
	}

}
