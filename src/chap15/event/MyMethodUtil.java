package chap15.event;

public class MyMethodUtil {
	// num을 입력받아서 check하는 메소드
	public void scoreCheck(int num) {
		if (num >= 90) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

	// 1. 메소드명: getGenderData - IfExam03의 로직을 메소드로 분리 시킨 후 호출
	public void getGenderData(int age, int gender) {
		String genderCheck = "";
		if (gender == 1 | gender == 3) { // 성별
			genderCheck = "남자";
		} else {
			genderCheck = "여자";
		}
		System.out.println(ageCheck(age) + genderCheck + "(" + age + "," + gender + ")");
		// ageCheck(age) 바로쓰는이유는 같은 클래스에 있기때문에
	}

	public String ageCheck(int age) {
		String check = "";
		if (age >= 20) { // 나이
			check = "성인";
		} else {
			check = "청소년";
		}
		return check;
	}

	// 2. 메소드명: calc - Calc.java의 계산로직을 메소드로 분리 시킨 후 호출
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

	// 3.printHap - 배열을 매개변수
	public void printHap(int[] arr, String name) {  //배열도 리턴타입으로 올 수 있다.
		int oddSum = 0; // 홀수합
		int evenSum = 0; // 짝수합

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num % 2 == 0) {
				evenSum = evenSum + num;
			} else {
				oddSum = oddSum + num;
			}
		}

		System.out.println("(배열" + name + ")");
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 : " + evenSum);

	}
}
