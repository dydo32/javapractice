package chap15.event;

public class MyMethodUtil {
	// num�� �Է¹޾Ƽ� check�ϴ� �޼ҵ�
	public void scoreCheck(int num) {
		if (num >= 90) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
	}

	// 1. �޼ҵ��: getGenderData - IfExam03�� ������ �޼ҵ�� �и� ��Ų �� ȣ��
	public void getGenderData(int age, int gender) {
		String genderCheck = "";
		if (gender == 1 | gender == 3) { // ����
			genderCheck = "����";
		} else {
			genderCheck = "����";
		}
		System.out.println(ageCheck(age) + genderCheck + "(" + age + "," + gender + ")");
		// ageCheck(age) �ٷξ��������� ���� Ŭ������ �ֱ⶧����
	}

	public String ageCheck(int age) {
		String check = "";
		if (age >= 20) { // ����
			check = "����";
		} else {
			check = "û�ҳ�";
		}
		return check;
	}

	// 2. �޼ҵ��: calc - Calc.java�� �������� �޼ҵ�� �и� ��Ų �� ȣ��
	public int calc(int opr, int num1, int num2) {
		int result = 0;

		switch (opr) {
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 * num2;
			break;
		case 3:
			result = num1 - num2;
			break;
		case 4:
			result = num1 / num2;
			break;
		}
		return result;
	}

	// 3.printHap - �迭�� �Ű�����
	public void printHap(int[] arr, String name) {  //�迭�� ����Ÿ������ �� �� �ִ�.
		int oddSum = 0; // Ȧ����
		int evenSum = 0; // ¦����

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num % 2 == 0) {
				evenSum = evenSum + num;
			} else {
				oddSum = oddSum + num;
			}
		}

		System.out.println("(�迭" + name + ")");
		System.out.println("Ȧ���� �� : " + oddSum);
		System.out.println("¦���� �� : " + evenSum);

	}
}
