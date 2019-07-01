package ans.chap03;

public class Ch03_Exam08 {

	public static void main(String[] args) {
		
		int Egg = 456;
		
		int box=   Egg%12 != 0  ? (Egg/12)+1   : Egg/12;

		System.out.println("달걀 "+ Egg+ "개를 12개씩 담을 수 있는 상자의 수는  "+box +"개");

	}

}





