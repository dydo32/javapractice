package chap01;
/*"i like java"문자열을 아래 조건에 맞게 처리하세요
1.String클래스를 생성합니다.(참조변수명: str)
2.String클래스에 정의되어 있는 length라는 메소드를 찾아서 호출
3.출력형태와 같이 메소드 호출결과를 출력합니다.
	[출력형태]
	문자열의 길이=>________
*/
public class APITest2{
	public static void main(String[] args){
		String str = new String("i like java");//메모리에 올리는 작업
		int l = str.length();
		System.out.println("문자열의 길이=>"+l);
	}
}