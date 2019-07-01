package ans.chap05;

import java.util.Scanner;

public class Ch05_Exam08 {
	 public static void main(String[] args) {
	     int  []  money={10000,5000,1000,500,100,50,10};
	     int a[]=new int[7];
	     int b[]=new int [7];
		 int won=0;
	     int  i=0;
	     
	     Scanner sc=new Scanner(System.in);	     
	     
	 System.out.print("금액을 입력: ");
	    won=sc.nextInt();
	     System.out.printf("화폐단위\n");
	     a[0] = won/money[0];
	     b[0] = won-money[0]*a[0];
	     System.out.printf("%5d원권 :\t%d\n", money[0], a[0]);
	     for(i=1;i<7;i++)
	     {
	         a[i] = b[i-1]/money[i];
	         b[i] = b[i-1]-money[i]*a[i];
	         System.out.printf("%5d원권 : \t%d\n", money[i], a[i]);
	     }
		
		
	}
}
