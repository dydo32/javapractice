package ans.chap04;

import java.util.Scanner;

public class Ch04_Exam06 {

	public static void main(String[] args) {
		
		Scanner  sc=new Scanner(System.in);
		int Midterm, FinalExam, Report, Check;
		double tot;
		char grade;
		String eva=null;

		System.out.print("점수를 입력 하세요(중간고사, 기말고사, 레포트, 출석점수) :");
		Midterm=sc.nextInt();
		FinalExam=sc.nextInt();
		Report=sc.nextInt();
		Check=sc.nextInt();
		

		tot=(((Midterm+FinalExam)/2)*0.6)+(Report*0.2)+(Check*0.2);
		System.out.println("   ------ 결과입니다 ------");
		
		System.out.printf("중간고사 : %d\n기말고사 : %d\n과제점수 : %d\n출석점수 : %d\n\n",
							Midterm, FinalExam, Report, Check);

		if(tot>=90)		 grade='A';
		else if(tot>=80) grade='B';
		else if(tot>=70) grade='C';
		else if(tot>=60) grade='D';
		else grade='F';

		switch(grade)
		{
			case 'A':
			case 'B': eva="excellent"; break;
			case 'C':
			case 'D': eva="good"; break;
			case 'F': eva="poor"; break;
			default : System.out.println("error"); break;
		}

		
		System.out.printf("성적 : %.2f\n학점 : %c\n평가 : %s\n", tot, grade, eva);


	}

}
