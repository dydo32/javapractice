package chap03;
public class Ch03_Exam09{
	public static void main(String[] args) {
		int money = 45763;
		int fh = 0;
		int h = 0;
		int ft = 0;
		int t = 0;
		int o = 0;

		fh = money / 500;
		money = money%500;
		h = money / 100;
		money = money % 100;
		ft = money / 50;
		money = money % 50;
		t = money / 10;
		money = money % 10;
		o = money;
		System.out.println("45763����");
		System.out.println("500�� : "+fh+"��");
		System.out.println("100�� : "+h+"��");
		System.out.println("50�� : "+ft+"��");
		System.out.println("10�� : "+t+"��");
		System.out.println("1�� : "+o+"��");
	}
}
