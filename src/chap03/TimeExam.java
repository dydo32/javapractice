package chap03;
public class TimeExam {
	public static void main(String[] args){
		int time = 8888; //�� ������
		//  TimeExam�ۼ�
		//	time������ ����� ���� __�ð� __�� __�ʷ� �����ؼ� ����ϼ���.

		int h = time/60/60; // ���� �ð� ������
		int val = time % 3600; // 3600���� ���� �������� �ð��� ���ϰ� ���� ������
		int m = val/60; //�ð� �����͸� ���ϰ� ���� �������� 60���� ������ �� ������
		int s = val%60; //�� �����͸� ���ϰ� ���� �������� �� ������

		System.out.println(h+"�ð� "+m+"�� "+s+"��");
	}
}
