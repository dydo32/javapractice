package ans.chap06;

public class Ch06_Exam03 {

	public static void main(String[] args) {
		Fruit f1 = new Fruit("jujube", 24000);
		Fruit f2 = new Fruit("strawberry", 21000);
		Fruit f3 = new Fruit("persimmon", 19000);
		Fruit f4 = new Fruit("cherry", 12000);

		int totalPrice = f1.getPrice() + f2.getPrice() + f3.getPrice()
				+ f4.getPrice();
		int savePrice = (int) (totalPrice * 0.15);
		System.out.println("===== 과일구입 목록 =====");
		System.out.println(f1.getFname() + " : " + f1.getPrice());
		System.out.println(f2.getFname() + " : " + f2.getPrice());
		System.out.println(f3.getFname() + " : " + f3.getPrice());
		System.out.println(f4.getFname() + " : " + f4.getPrice());
		System.out.println("---------------------------------");
		System.out.println("추문 총금액 : " + totalPrice + "원");
		System.out.println("할인후 결제 금액 : " + (totalPrice - savePrice) + "원");
	}

}
