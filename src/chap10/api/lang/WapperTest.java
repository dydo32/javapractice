package chap10.api.lang;

public class WapperTest {

	public static void main(String[] args) {
		// 5.0이전
		int i = 100;
		Integer obj = new Integer(10);
		Integer obj2 = new Integer(i);
		run(i); // 참조형변수 = 기본형
		run(obj);
		run(obj2);

		// 5.0이후 - Wrapper클래스에 대해서
		int num = 1000;
		run(num); 	// 5.0이후 버전의 jdk에서는 컴파일러가 자동으로 변환해준다.
					// 참조형으로 매개변수가 정의되어 있는 메소드에 기본형을 전달해도
					// 자동으로 Integer in = new Integer(num)와 같은 코드를 실행해서 전달
					// 이를 오토박싱이라 한다.
		Integer mynum = num;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}

	public static void run(Object obj) {
		System.out.println(obj);

		// 5.0이전 버전
		Integer in = (Integer) obj;
		int num = in.intValue();

		// 5.0이후버전
		int i = (Integer) obj; 	// 오토언박싱
								// int형 변수에 참조형 변수를 전달하는 경우
								// 컴파일러가 자동으로 객체로 포장된 값을 풀러서 기본형으로 변환
								// 이를 오토언박싱이라 한다.
		System.out.println("5.0이전버전에서 변환=>" + num);
		System.out.println("5.0이후버전에서 변환=>" + i);
	}
}
