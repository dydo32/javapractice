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
		return "[색상] " + color + "\t[생산수량] " + account + "\t";
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
		return super.toString() + "[용도] " + use + "\t[시리즈] " + series;
	}
}

public class Ch07_Exam06 {
	public static void main(String[] args) {
		Monata monata[] = { new Monata("흰색", 5000, "NF", "승용"),
				new Monata("은색", 7000, "Brilliant", "업무"),
				new Monata("감홍색", 4000, "EF", "택시"),
				new Monata("검정색", 6000, "Hybrid", "승용") };

		System.out
				.println("======================== Monata 생산 시작 ========================");
		int len = monata.length;
		for (int i = 0; i < len; i++) {
			System.out.println(monata[i].toString());
		}
	}
}
