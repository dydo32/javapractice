package ans.chap07;

import java.util.Scanner;

class Sales {
	protected String article;
	protected int qty;
	protected int cost;
	protected static int cnt = 0;
	protected static float discount;
	Scanner sc;

	public Sales() {
		sc = new Scanner(System.in);
		System.out.print("ǰ��:");
		article = sc.nextLine();
		System.out.print("����:");
		qty = sc.nextInt();
		System.out.print("�ܰ�:");
		cost = sc.nextInt();
		cnt += qty;
	}
}

public class Ch07_Exam05 extends Sales {
	int amount;

	public Ch07_Exam05() {
		setProcess();
	}

	public void setProcess() {
		amount = qty * cost;
	}

	public void getDisplay() {
		int price = amount - (int) (amount * discount);
		System.out.println(article + "        " + price + "��");
	}

	public static void setDiscount(float d) {
		discount = d;
	}

	public static void main(String[] args) {
		Ch07_Exam05[] op = new Ch07_Exam05[2];
		for (int i = 0; i < op.length; i++)
			op[i] = new Ch07_Exam05();
		Scanner sc = new Scanner(System.in);
		float dis = 0.0f;

		System.out.print("������ : ");
		dis = sc.nextFloat();

		Ch07_Exam05.setDiscount(dis);

		System.out.println("[[�ǸŰ�]]");
		for (int k = 0; k < op.length; k++)
			op[k].getDisplay();
		System.out.println("�ǸŰǼ� : " + Ch07_Exam05.cnt);
	}

}
