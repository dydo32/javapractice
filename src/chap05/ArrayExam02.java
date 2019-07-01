package chap05;

import java.util.Random;

public class ArrayExam02 {

	public static void main(String[] args) {
		// int형 배열변수를 선언하고
		// 1부터 10까지 5개의 랜덤수를 배열의 각 요소에 저장되도록 작성하세요.
		// for문을 이용합니다.
		// 저장된 랜덤수를 출력하세요

		int[] arr = new int[5];
		Random rand = new Random();
		//배열의 요소에 값을 저장하기 위한 for
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1;
		}
		//저장이 완료된 후에 배열이 저장된 값을 꺼내서 출력하는 for
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
