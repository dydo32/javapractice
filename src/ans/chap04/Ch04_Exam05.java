package ans.chap04;

public class Ch04_Exam05 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){
			 System.out.print("*");
			 for(int j=i;j<=i+3;j++){
				 if(i%2 != 0)
				  System.out.print("*");
			 }
			 System.out.println();
		}
	}

}
