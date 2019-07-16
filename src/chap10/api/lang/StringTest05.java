package chap10.api.lang;

//StringŬ������ ������ ��ȯ�� ���õ� �޼ҵ�
public class StringTest05 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("java servlet spring bigdata");

		// 1. String -> byte[]
		byte[] data1 = str1.getBytes();
		for (int i = 0; i < data1.length; i++) { // �ƽ�Ű��
			System.out.print(data1[i] + "\t");
		}
		System.out.println();

		// 2. String -> char[]
		char[] data2 = str1.toCharArray();
		for (int i = 0; i < data2.length; i++) { // ĳ���� �迭��
			System.out.print(data2[i] + "\t");
		}
		System.out.println();

		// 3. String -> String[]
		String[] data3 = str2.split(" ");
		for (int i = 0; i < data3.length; i++) { // ��ū������
			System.out.println(data3[i]);
		}
		System.out.println();

		// 4. �⺻�� -> String
		int i = 1000;
		double d = 10.5;
		//test((String)i);
		test(String.valueOf(i));
		test(String.valueOf(d));
		
		test(i+""); // ���Ұ��, ���ڿ�ȭ ����
		test(d+"");
		
		// String -> Integer/ Integer -> String
		String str = "12345";
		int num = Integer.parseInt(str);
		str = Integer.toString(num); // str = num + "";
		
	}
	public static void test(String data){
		System.out.println("��ȯ�� ������=> "+data);
	}
}
