package ans.chap03;

public class Ch03_Exam09 {

	public static void main(String[] args) {
		int money =45763;
		int num1;

		System.out.println(money +"���� ");
		num1 = money/500;
		System.out.println("500�� : " + num1+"��");
		
		money= money%500;
		num1 = money/100;
		System.out.println("100�� : " + num1 +"��");
		
		money = money%100;
		num1 = money/50;
		System.out.println("50�� : "+ num1 + "��");
		
		money = money%50;
		num1 = money/10;
		System.out.println("10�� : "+num1 + "��");
		
		money = money%10;
		num1 = money/1;
		System.out.println("1�� : "+num1 + "�� �̴� ");


	}

}
