package ans.chap05;

public class Ch05_Exam09 {
	
	 public static void main(String[] args) {
		 int i, j;
	     int AB[][]={{1,2,3,},{4,5,6},{7,8,9}};
	     System.out.println("변경 전");
	     for(i=0;i<3;i++)
	     {
	         for(j=0;j<3;j++)
	        	 System.out.printf("%3d",AB[i][j]);
	         System.out.println();
	     }
	     System.out.printf("\n변경 후\n");
	     for(i=0;i<3;i++)
	     {
	         for(j=0;j<3;j++)
	        	 System.out.printf("%3d", AB[j][i]);
	         System.out.println();
	     }
	}
}
