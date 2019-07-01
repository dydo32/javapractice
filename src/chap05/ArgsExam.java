package chap05;

public class ArgsExam {

	public static void main(String[] args) {
		// 명령행 매개변수로 입력받은 문자열을 반대로 출력하세요
		// ex) java 입력 -> avaj
		for (int i = 0; i < args[0].length(); i++) { //length()는 문자열의 길이
			System.out.print(args[0].charAt(i));
		}
		System.out.println();
		for (int i = args[0].length()-1; i >= 0; i--) { //length()는 문자열의 길이
														//length-1해줘야함(마지막인덱스)
			System.out.print(args[0].charAt(i));
		}
	}

}
