package chap04;

import java.util.Scanner;

public class MultiIfTest {
	public static void main(String[] args) {
		Scanner ssn = new Scanner(System.in);
		System.out.print("1,2,3,4 �� �Է��ϼ���: ");
		int num = ssn.nextInt();
		if(num==1 | num==3){
			System.out.println("����");
		} else if(num==2 | num ==4){
			System.out.println("����");
		} else{
			System.out.println("��Ÿ");
		}
	}
}
