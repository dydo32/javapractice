package chap06;

//기본형과 참조형변수의 차이점 설명, 자바 시험
public class TypeTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		System.out.println("**기본형비교**");
		if (i == j) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다");
		}

		System.out.println("**참조형비교**");
		String str1 = new String("java");
		String str2 = new String("java");
		// str1=str2; 하면 참조형비교 다르다라고 나온다.
		if (str1 == str2) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다");
		}

		System.out.println("**문자열비교**");
		if (str1.equals(str2)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다");
		}
	}

}
