package chap05;

import java.util.Random;

public class ArrayExam02 {

	public static void main(String[] args) {
		// int�� �迭������ �����ϰ�
		// 1���� 10���� 5���� �������� �迭�� �� ��ҿ� ����ǵ��� �ۼ��ϼ���.
		// for���� �̿��մϴ�.
		// ����� �������� ����ϼ���

		int[] arr = new int[5];
		Random rand = new Random();
		//�迭�� ��ҿ� ���� �����ϱ� ���� for
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1;
		}
		//������ �Ϸ�� �Ŀ� �迭�� ����� ���� ������ ����ϴ� for
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
