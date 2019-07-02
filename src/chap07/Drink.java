package chap07;

public class Drink {
	String name; //상품명
	int price; //단가
	int count; //수량
	
	public Drink(){}
	//멤버변수 초기화하는 생성자메소드
	public Drink(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	//금액(단가*수량)을 계산하는 getTotalPrice() 메서드
	public int getTotalPrice(){
		return price*count;
	}
	//타이틀을 출력하는 printTitle() 메서드
	public static void printTitle(){
		System.out.println("상품명\t단가\t수량\t금액");
	}
	//상품의 정보를 출력하는 printData() 메서드
	public void printData(){
		System.out.println(name+"\t"+price+"\t"+count+"\t"+getTotalPrice());
	}
	
}
