package ans.chap03;

public class Ch03_Exam06 {

	public static void main(String[] args) {
		
		int money=65430;
		int a=money/10000;
		money=money%10000; 	
		
		int b=money/1000;
		money=money%1000; 
		
		int c=money/100;
		money=money%100; 
		
		int d=money/10;

		System.out.println("만원 : "+a);
		System.out.println("천원 : "+b);
		System.out.println("백원 : "+c);
		System.out.println("십원 : "+d);	

	}

}
