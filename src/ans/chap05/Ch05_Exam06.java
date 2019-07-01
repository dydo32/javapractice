package ans.chap05;

public class Ch05_Exam06 {
	public static void main(String[] args) {

		String[] name = { "�̷縮", "�̷缼", "�̷��" };
		int[][] score = { { 90, 75, 61, 0 }, { 55, 56, 46, 0 },
				{90, 90, 90, 0 } };
		double[] avg = new double[3];
		char[] grade = new char[3];
		String[] pass = new String[3];
		int[] rank = { 1, 1, 1 };

		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name.length; j++){
				score[i][3] += score[i][j]; // ����
			}
			avg[i] = (double) score[i][3] / 3; // ���

			if (avg[i] >= 90)
				grade[i] = 'A'; // ����
			else if (avg[i] >= 80)
				grade[i] = 'B';
			else if (avg[i] >= 70)
				grade[i] = 'C';
			else if (avg[i] >= 60)
				grade[i] = 'D';
			else
				grade[i] = 'F';

			if (avg[i] >= 60) 
				pass[i] = "pass";
			else
				pass[i] = "nopass";
			
		}
		for (int i = 0; i < name.length; i++)
			// �������ϱ�
			for (int j = 0; j < name.length; j++)
				if (avg[i] < avg[j])
					++rank[i];

		System.out.printf("%20s\n","���� ���α׷� ");
		System.out.println("============================================");
		System.out.println("��ȣ �̸�   ����  ����  ����   ����     ���     ����  �����   ����");
				System.out.println("============================================");
		for (int i = 0; i < name.length; i++)
			System.out.printf(
					"%3d %-5s  %3d   %3d   %3d   %3d %9.2f %5c   %-7s  %-3d\n",
					i + 1, name[i], score[i][0], score[i][1], score[i][2],
					score[i][3], avg[i], grade[i], pass[i], rank[i]);
	}
}
