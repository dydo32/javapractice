package ans.chap03;

public class Ch03_Exam07 {

	public static void main(String[] args) {
	int su = 27890;
	System.out.println("�����ʿ��� 8��° ��Ʈ   : " + ((su >> 7) & 1));
	System.out.println("�����ʿ��� 9��° ��Ʈ   : " + ((su >> 8) & 1));

	}
}
