package chap05;

public class ArgsExam {

	public static void main(String[] args) {
		// ����� �Ű������� �Է¹��� ���ڿ��� �ݴ�� ����ϼ���
		// ex) java �Է� -> avaj
		for (int i = 0; i < args[0].length(); i++) { //length()�� ���ڿ��� ����
			System.out.print(args[0].charAt(i));
		}
		System.out.println();
		for (int i = args[0].length()-1; i >= 0; i--) { //length()�� ���ڿ��� ����
														//length-1�������(�������ε���)
			System.out.print(args[0].charAt(i));
		}
	}

}
