package chap10.api.lang;

public class Prob2 {
	public static void main(String[] args) {
		Prob2 prob2 = new Prob2();
		System.out.println(prob2.leftPad("KITRI", 8, '#'));
		System.out.println(prob2.leftPad("KITRI", 7, '$'));
		System.out.println(prob2.leftPad("KITRI", 5, '&'));
	}
	
	public String leftPad(String str, int size, char padChar) {
		/* 여기에 프로그램을 완성하십시오. */
		String result = "";
		int length = size - str.length();//new문자열의길이 - old문자열의길이 
		//new문자열의길이가 old문자열의 길이보다 큰 경우 old문자열을 그냥 리턴
		if(length<=0){
			return str;
		}
		//length의 크기만큼 padChar를 추가
		for (int i = 1; i <= length; i++) {
			result = result+padChar;
		}
		//연결한 padChar에 old문자열을 연결해서 new문자열을 생성
		result = result + str;
		
		return result;
	}
}
