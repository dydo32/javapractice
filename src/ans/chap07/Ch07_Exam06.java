package ans.chap07;

class Car {
	private String color;
	private int account;

	public Car(String color, int account) {
		super();
		this.color = color;
		this.account = account;
	}

	public String getColor() {
		return color;
	}

	public int getAccount() {
		return account;
	}

	public String toString() {
		return "[����] " + color + "\t[�������] " + account + "\t";
	}

}

class Monata extends Car {
	private String series;
	private String use;

	public Monata(String color, int account, String series, String use) {
		super(color, account);
		this.series = series;
		this.use = use;
	}

	public String toString() {
		return super.toString() + "[�뵵] " + use + "\t[�ø���] " + series;
	}
}

public class Ch07_Exam06 {
	public static void main(String[] args) {
		Monata monata[] = { new Monata("���", 5000, "NF", "�¿�"),
				new Monata("����", 7000, "Brilliant", "����"),
				new Monata("��ȫ��", 4000, "EF", "�ý�"),
				new Monata("������", 6000, "Hybrid", "�¿�") };

		System.out
				.println("======================== Monata ���� ���� ========================");
		int len = monata.length;
		for (int i = 0; i < len; i++) {
			System.out.println(monata[i].toString());
		}
	}
}
