package chap10.api.lang;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		System.out.println("원본=>"+sb);
		
		sb.append("재밌다."); //맨뒤에추가
		System.out.println("원본=>"+sb);
		
		sb.insert(2, "자바");	//지정한 위치에 지정한 문자열을 삽입
		System.out.println("원본=>"+sb);
		
		sb.delete(2, 6); //(start,end) start~end-1위치의 문자열을 삭제
		System.out.println("원본=>"+sb);
		
		sb.reverse(); //거꾸로 출력
		System.out.println("원본=>"+sb);
	}

}
