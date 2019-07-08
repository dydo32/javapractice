package chap10.api.lang;

public class StringTest01 {
	public static void main(String[] args) {
		// String 상수 풀에 저장
		String str1 = "java";
		String str2 = "java";
		// 인스턴스 할당
		String str3 = new String("java");
		String str4 = new String("java");

		if (str1 == str2) { // 같다.
			System.out.println("같다. ");
		} else {
			System.out.println("다르다.");
		}

		if (str1 == str3) { // 다르다.
			System.out.println("같다. ");
		} else {
			System.out.println("다르다.");
		}
		if (str3 == str4) { // 다르다.
			System.out.println("같다. ");
		} else {
			System.out.println("다르다.");
		}

		// String객체의 문자열이 어떤 방법으로 할당되는지 상관없이 문자열을
		// 비교하고 싶은 경우 equals를 사용
		if (str1.equals(str3)) { // 같다.
			System.out.println("같다. ");
		} else {
			System.out.println("다르다.");
		}

	}
}
