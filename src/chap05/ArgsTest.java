package chap05;
//명령행 매개변수
/*
 * 작성한 프로그램을 java명령어를 이용해서 실행할 때 
 * 외부에서 데이터를 입력받아 처리해야 하는 경우 사용 할 수 있도록 지원
 * 프로그램 실행 시점에 입력받으며 다음과 같은 형식으로 사용한다.
 * java .class파일명 명령행매개변수1 명령행매개변수2.....
 * .class파일명 이후에 입력한 데이터를 space로 구분하여 잘라 매개변수로 인식
 * 사용자가 어떤 타입의 데이터를 몇 개 입력할지 예측이 불가능하므로 가장 기본타입인
 * String의 배열로 정의 
 * 
 * {실행예}
 * java ArgsTest 192.168.9.44 20000 jang
 * 위와 같은 명령문을 입력하면
 * 내부에서는
 * args = new String[3];
 * args[0] = "192.168.9.44"
 * args[1] = "20000"
 * args[2] = "jang"
 * 위와 같은 코드가 자동으로 실행
 */
public class ArgsTest {
	public static void main(String[] args) {
		System.out.println("사용자ip:"+args[0]);
		System.out.println("사용자ip:"+args[1]);
		System.out.println(Integer.parseInt(args[2])+Integer.parseInt(args[3]));  	
												//String으로 더해짐, 타입 바꾸어 주어야 숫자로 더해짐
												
	}

}
