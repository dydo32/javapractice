package chap09;
//try~catch~finally
//=> ������ �߻��ϰų� ���� �ʰų� ������� �ݵ�� �����ؾ��ϴ� ��ɹ��� finally ���ȿ� �����ϰ� ����Ѵ�.
public class ExceptionTest05 {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println("���α׷�����");
			System.out.println(str.length());
			System.out.println("���α׷�����");
		} catch (NullPointerException e) {
			System.out.println("�����߻�");
		} finally {
			System.out.println("***********�ݵ�� ����� ����***********");
		}

	}

}
