package chap09;

public class ExceptionTest02 {
	public static void main(String[] args) {

		try {
			// ���ܹ߻� ���ɼ��� �ִ� �ڵ�
			System.out.println("try start.....");
			//���ܰ� �߻��ϸ� try������ �ڵ带 �� �̻� �������� �ʰ� catch������ �Ѿ��.
			//(catch���� ����ȴ�.)
			//Exception�� �߻����� ������ catch���� ������� �ʴ´�.
			System.out.println(args[0]);
			System.out.println("try end...");
		} catch (Exception e) {
			// ���ܰ� �߻��ϸ� ó���� ����
			System.out.println("���ܹ߻�");
		}
	}
}
