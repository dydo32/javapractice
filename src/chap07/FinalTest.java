package chap07;

final class AA {
	public final void display() {
		System.out.println("������ display");
	}
}

class BB extends AA { 		// AAŬ������ finalŬ�����̹Ƿ� ����� ���� �� ����.
	public void display() { // �θ� ���� �ִ� display�� ������(�������̵�)
							// display�� final�޼ҵ��̹Ƿ� �������̵� �� �� ����.
		System.out.println("������ display");

	}
}

public class FinalTest {
	int num = 1000; //�Ϲݺ���
	static final int START_CODE = 2000; // ���, ���: ����� �빮�ڷ�
	public void chang() {
		num = 1;
		START_CODE = 200; // ����� ���� ������ �� ����.
	}
}
