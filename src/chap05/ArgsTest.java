package chap05;
//����� �Ű�����
/*
 * �ۼ��� ���α׷��� java��ɾ �̿��ؼ� ������ �� 
 * �ܺο��� �����͸� �Է¹޾� ó���ؾ� �ϴ� ��� ��� �� �� �ֵ��� ����
 * ���α׷� ���� ������ �Է¹����� ������ ���� �������� ����Ѵ�.
 * java .class���ϸ� �����Ű�����1 �����Ű�����2.....
 * .class���ϸ� ���Ŀ� �Է��� �����͸� space�� �����Ͽ� �߶� �Ű������� �ν�
 * ����ڰ� � Ÿ���� �����͸� �� �� �Է����� ������ �Ұ����ϹǷ� ���� �⺻Ÿ����
 * String�� �迭�� ���� 
 * 
 * {���࿹}
 * java ArgsTest 192.168.9.44 20000 jang
 * ���� ���� ��ɹ��� �Է��ϸ�
 * ���ο�����
 * args = new String[3];
 * args[0] = "192.168.9.44"
 * args[1] = "20000"
 * args[2] = "jang"
 * ���� ���� �ڵ尡 �ڵ����� ����
 */
public class ArgsTest {
	public static void main(String[] args) {
		System.out.println("�����ip:"+args[0]);
		System.out.println("�����ip:"+args[1]);
		System.out.println(Integer.parseInt(args[2])+Integer.parseInt(args[3]));  	
												//String���� ������, Ÿ�� �ٲپ� �־�� ���ڷ� ������
												
	}

}
