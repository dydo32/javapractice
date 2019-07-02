package chap07;

public class Alcohol extends Drink {
	private double alcper; //알코올 도수

	public Alcohol(){}
	 //멤버변수를 초기화하는 생성자 메서드
	public Alcohol(int alcper) {
		super();
		this.alcper = alcper;
	}
	public Alcohol(String name, int price, int count, double alcper) {
		super(name, price, count);
		this.alcper=alcper;
	}
	
	//부모 클래스인 Drink 의 printTitle() 메서드의 기능을 재정의(오버라이딩)
	public static void printTitle(){
		System.out.println("상품명(도수[%])\t단가\t수량\t금액");
	}
	public void printData(){
		System.out.println(name+"("+this.alcper+")\t"+price+
												"\t"+count+"\t"+ getTotalPrice());
	}
	
}
