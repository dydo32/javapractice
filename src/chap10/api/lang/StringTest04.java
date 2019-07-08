package chap10.api.lang;
//String클래스의  주요 메소드
public class StringTest04 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다.");
		System.out.println("str1.substring(5)=>"+str1.substring(5)); //index 5부터
		System.out.println("str1.substring(5,8)=>"+str1.substring(5,8));	//index 5~7(8-1) -> index~index-1
		System.out.println("str1.replace('a','A')=>"+str1.replace('a','A')); //a를 찾아서 A로 
		System.out.println("원본=>"+str1);
	}
}
