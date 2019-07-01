package ans.chap04;

public class Ch04_Exam09 {

	public static void main(String[] args) {
		
		int i=0,j=0;
		for(i=1;i<=5;i++){
			for(j=5;j>i;j--){
				System.out.print("  "  );
			}
			for(j=0;j<i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}		   
		}
	}


