package chap03;
//논리연산자 - shortcut
public class OprTest04_shortcut{
	public static void main(String[] args) {
		int num=100;
		String str = null;
		System.out.println("shortcut연산자 테스트"); 
		//str.length(); //에러
		
		System.out.println(num>=100 || str.length()==0);
		//System.out.println(num>=100 | str.length()==0);
		
		System.out.println(num<100 && str.length()==0);
		//System.out.println(num<100 & str.length()==0); // 왠만하면 하나짜리 쓰는게 좋아, 오류잡음
		
		System.out.println(!(num<100));
		System.out.println(!(num>=100));

	}
}
