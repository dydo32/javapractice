package chap10.api.lang;

public class WapperTest {

	public static void main(String[] args) {
		// 5.0����
		int i = 100;
		Integer obj = new Integer(10);
		Integer obj2 = new Integer(i);
		run(i); // ���������� = �⺻��
		run(obj);
		run(obj2);

		// 5.0���� - WrapperŬ������ ���ؼ�
		int num = 1000;
		run(num); 	// 5.0���� ������ jdk������ �����Ϸ��� �ڵ����� ��ȯ���ش�.
					// ���������� �Ű������� ���ǵǾ� �ִ� �޼ҵ忡 �⺻���� �����ص�
					// �ڵ����� Integer in = new Integer(num)�� ���� �ڵ带 �����ؼ� ����
					// �̸� ����ڽ��̶� �Ѵ�.
		Integer mynum = num;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}

	public static void run(Object obj) {
		System.out.println(obj);

		// 5.0���� ����
		Integer in = (Integer) obj;
		int num = in.intValue();

		// 5.0���Ĺ���
		int i = (Integer) obj; 	// �����ڽ�
								// int�� ������ ������ ������ �����ϴ� ���
								// �����Ϸ��� �ڵ����� ��ü�� ����� ���� Ǯ���� �⺻������ ��ȯ
								// �̸� �����ڽ��̶� �Ѵ�.
		System.out.println("5.0������������ ��ȯ=>" + num);
		System.out.println("5.0���Ĺ������� ��ȯ=>" + i);
	}
}
