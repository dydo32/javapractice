package chap10.api.lang;

public class StringTest01 {
	public static void main(String[] args) {
		// String ��� Ǯ�� ����
		String str1 = "java";
		String str2 = "java";
		// �ν��Ͻ� �Ҵ�
		String str3 = new String("java");
		String str4 = new String("java");

		if (str1 == str2) { // ����.
			System.out.println("����. ");
		} else {
			System.out.println("�ٸ���.");
		}

		if (str1 == str3) { // �ٸ���.
			System.out.println("����. ");
		} else {
			System.out.println("�ٸ���.");
		}
		if (str3 == str4) { // �ٸ���.
			System.out.println("����. ");
		} else {
			System.out.println("�ٸ���.");
		}

		// String��ü�� ���ڿ��� � ������� �Ҵ�Ǵ��� ������� ���ڿ���
		// ���ϰ� ���� ��� equals�� ���
		if (str1.equals(str3)) { // ����.
			System.out.println("����. ");
		} else {
			System.out.println("�ٸ���.");
		}

	}
}
