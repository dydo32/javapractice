package chap10.api.util;

import java.util.Scanner;

//java.util��Ű���� ScannerŬ������ �׽�Ʈ
//==> ǥ���Է�(Ű����)���� �Էµ� ���� �о �����ϴ� ����
public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ű���带 �̿��ؼ� ���ڿ��� �Է��غ�����: ");
		//next()�� Ű���带 �Է��� ���ڿ��� ���� ������� spacebar�� enter�� �ԷµǱ� ���� �ܾ �о �����Ѵ�.
		String data = scan.next();
		System.out.println("�Է¹��� ���ڿ�=>"+data);

		String line = scan.nextLine();
		System.out.println("�Է¹��� ����=>"+line);  //nextline�̶� next�� ��ġ �ٲ�� console�� �޶���
		
		System.out.print("�����Է�: ");
		int num = scan.nextInt();
		System.out.println("�Է��� ����==>"+num);  //intŸ�� �ƴϸ� �������. , �ڹٿ����� ��������� Exception�̶��Ѵ�.
	}

}
