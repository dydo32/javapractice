package chap09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//throws를 이용해서 예외처리
//==> 예외가 발생한 곳에서 처리하지 않고 호출한 곳에서 예외를 처리할 수 있도록 구현
public class ThrowsTest01 {
	// 1. 예외가 발생한 곳에서 직접 처리하기.
	public void test(String fileName) {
		try {
			FileInputStream fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("예외처리완료");
		}
	}

	// 2. 예외가 발생한 곳에서 처리하지 않고 호출하는 곳에서 처리하도록 예외를 던진다.
	// => 이 메소드는 예외가 발생할 수 있는 메소드이므로 예외를 처리하라고 알려준다.
	public void test2(String fileName) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
	}

	// 예외가 발생되는 메소드를 호출해서 사용하기
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01(); // static에서 non-static메소드 쓰려면
												// 객체생성해주어야함.
		// 가정) A라는 위치에서 메소드 호출
		obj.test("test2.txt");
		// 가정) B라는 위치에서 메소드 호출
		obj.test("test2.txt");
		// ===> test메소드 내부에서 예외가 발생했는지 여부를 확인할 수 없다.

		// ===>test2메소드 내부에서 예외를 처리하지 않고 호출한 곳에서 처리하도록 예외를 던진 경우
		// 각각 다른 방법으로 예외를 처리할 수 있다.
		// 가정) A라는 위치에서 메소드 호출
		try {
			obj.test2("test2.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다. 다른 파일을 선택할까요? -  A방법");
		}
		// 가정) B라는 위치에서 메소드 호출
		try {
			obj.test2("test2.txt");
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일명을 입력했습니다. - B방법");
		}
	}
}
