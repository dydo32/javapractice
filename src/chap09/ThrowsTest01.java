package chap09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//throws�� �̿��ؼ� ����ó��
//==> ���ܰ� �߻��� ������ ó������ �ʰ� ȣ���� ������ ���ܸ� ó���� �� �ֵ��� ����
public class ThrowsTest01 {
	// 1. ���ܰ� �߻��� ������ ���� ó���ϱ�.
	public void test(String fileName) {
		try {
			FileInputStream fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("����ó���Ϸ�");
		}
	}

	// 2. ���ܰ� �߻��� ������ ó������ �ʰ� ȣ���ϴ� ������ ó���ϵ��� ���ܸ� ������.
	// => �� �޼ҵ�� ���ܰ� �߻��� �� �ִ� �޼ҵ��̹Ƿ� ���ܸ� ó���϶�� �˷��ش�.
	public void test2(String fileName) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
	}

	// ���ܰ� �߻��Ǵ� �޼ҵ带 ȣ���ؼ� ����ϱ�
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01(); // static���� non-static�޼ҵ� ������
												// ��ü�������־����.
		// ����) A��� ��ġ���� �޼ҵ� ȣ��
		obj.test("test2.txt");
		// ����) B��� ��ġ���� �޼ҵ� ȣ��
		obj.test("test2.txt");
		// ===> test�޼ҵ� ���ο��� ���ܰ� �߻��ߴ��� ���θ� Ȯ���� �� ����.

		// ===>test2�޼ҵ� ���ο��� ���ܸ� ó������ �ʰ� ȣ���� ������ ó���ϵ��� ���ܸ� ���� ���
		// ���� �ٸ� ������� ���ܸ� ó���� �� �ִ�.
		// ����) A��� ��ġ���� �޼ҵ� ȣ��
		try {
			obj.test2("test2.txt");
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�. �ٸ� ������ �����ұ��? -  A���");
		}
		// ����) B��� ��ġ���� �޼ҵ� ȣ��
		try {
			obj.test2("test2.txt");
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� ���ϸ��� �Է��߽��ϴ�. - B���");
		}
	}
}
