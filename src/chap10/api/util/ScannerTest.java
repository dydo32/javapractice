package chap10.api.util;

import java.util.Scanner;

//java.util패키지의 Scanner클래스를 테스트
//==> 표준입력(키보드)으로 입력된 값을 읽어서 리턴하는 연습
public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키보드를 이용해서 문자열을 입력해보세요: ");
		//next()는 키보드를 입력한 문자열을 위한 기능으로 spacebar나 enter가 입력되기 전에 단어를 읽어서 리턴한다.
		String data = scan.next();
		System.out.println("입력받은 문자열=>"+data);

		String line = scan.nextLine();
		System.out.println("입력받은 라인=>"+line);  //nextline이랑 next랑 위치 바뀌면 console도 달라짐
		
		System.out.print("숫자입력: ");
		int num = scan.nextInt();
		System.out.println("입력한 숫자==>"+num);  //int타입 아니면 오류뜬다. , 자바에서는 실행오류를 Exception이라한다.
	}

}
