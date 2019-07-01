package ans.chap03;

public class Ch03_Exam09 {

	public static void main(String[] args) {
		int money =45763;
		int num1;

		System.out.println(money +"원은 ");
		num1 = money/500;
		System.out.println("500원 : " + num1+"개");
		
		money= money%500;
		num1 = money/100;
		System.out.println("100원 : " + num1 +"개");
		
		money = money%100;
		num1 = money/50;
		System.out.println("50원 : "+ num1 + "개");
		
		money = money%50;
		num1 = money/10;
		System.out.println("10원 : "+num1 + "개");
		
		money = money%10;
		num1 = money/1;
		System.out.println("1원 : "+num1 + "개 이다 ");


	}

}
