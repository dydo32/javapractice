package chap03;
public class Ch03_Exam06{
	public static void main(String[] args) {
		int money = 65430;
		int tenthou = 0;
		int thou = 0;
		int hund = 0;
		int ten = 0;
		
		tenthou = money / 10000;
		thou = (money%10000) / 1000;
		hund = (money%1000) / 100;
		ten =  (money%100) / 10;

		System.out.println("만원 : "+tenthou);
		System.out.println("천원 : "+thou);
		System.out.println("백원 : "+hund);
		System.out.println("십원 : "+ten);
	
	}
}
