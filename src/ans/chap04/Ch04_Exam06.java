package ans.chap04;

import java.util.Scanner;

public class Ch04_Exam06 {

	public static void main(String[] args) {
		
		Scanner  sc=new Scanner(System.in);
		int Midterm, FinalExam, Report, Check;
		double tot;
		char grade;
		String eva=null;

		System.out.print("������ �Է� �ϼ���(�߰����, �⸻���, ����Ʈ, �⼮����) :");
		Midterm=sc.nextInt();
		FinalExam=sc.nextInt();
		Report=sc.nextInt();
		Check=sc.nextInt();
		

		tot=(((Midterm+FinalExam)/2)*0.6)+(Report*0.2)+(Check*0.2);
		System.out.println("   ------ ����Դϴ� ------");
		
		System.out.printf("�߰���� : %d\n�⸻��� : %d\n�������� : %d\n�⼮���� : %d\n\n",
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

		
		System.out.printf("���� : %.2f\n���� : %c\n�� : %s\n", tot, grade, eva);


	}

}
