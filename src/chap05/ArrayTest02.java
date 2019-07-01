package chap05;

import java.util.Random;
import java.util.Scanner;

//참조형 배열 변수를 사용
public class ArrayTest02 {
	public static void main(String[] args) {
		Random[] rand = new Random[3];
		System.out.println(rand);
		System.out.println(rand[0]);
		System.out.println(rand[1]);
		System.out.println(rand[2]);
		rand[0] = new Random();
		rand[1] = new Random();
		rand[2] = new Random();
		System.out.println(rand[0]);
		System.out.println(rand[1]);
		System.out.println(rand[2]);
		
		Scanner[] myarr = new Scanner[5];
		myarr[0] = new Scanner(System.in);
		myarr[1] = new Scanner(System.in);
		myarr[2] = new Scanner(System.in);
		myarr[3] = new Scanner(System.in);
		myarr[4] = new Scanner(System.in);
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		System.out.println(myarr[3]);
		System.out.println(myarr[4]);
	}
}
