package chap05;

import java.util.Random;

/*2.
 * 1���� 100������ ������ �߻����Ѽ� �迭�� ���ҷ� �ʱ�ȭ�ϰ� ����ϱ� (Prob2.java)
 * 1)���� �� �迭�� int Ÿ���̸�, ������ 5���Դϴ�.
 * 2)1���� 100������ ������ �߻����� �迭 ���ҵ��� �ʱ�ȭ�մϴ�.
 * - RandomŬ���� nextInt(����)�� �̿�
 * 3)�� �迭�� ���ҵ��� ����մϴ�
 * [���]
 * 39 24 36 42 81 */
public class Prob2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++){
			arr[i]= rand.nextInt(100)+1;
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

}
