package chap10.api.lang;

public class Prob1 {

	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스트");
		System.out.println("-------------Sample 1 --------------");
		String str1 = myReplace("hello world", 'l', '*');
		System.out.println(str1);

		System.out.println("-------------Sample 2 --------------");
		String str2 = myReplace("hello world", ' ', '-');
		System.out.println(str2);

		System.out.println("-------------Sample 3 --------------");
		String str3 = myReplace("hello world", 'a', '*');
		System.out.println(str3);
	}

	public static String myReplace(String str, char oldChar, char newChar) {
		// 이 부분을 구현하시오.
		// 문자를 하나씩 추출해서 oldChar와 비교
		// 문자하나씩 추출한 것을 다시 합쳐서 출력
		// - oldChar와 일치하는 것은 newChar로 변경해서 연결
		// - 일치하지않는 문자는 원본으로 연결
		String result = "";
		int size = str.length();
		for(int i=0; i<size ;i++){
			if(str.charAt(i) == oldChar){
				result = result + newChar;
			}else{
				result = result + str.charAt(i);
			}
		}
		return result;
	}
}
