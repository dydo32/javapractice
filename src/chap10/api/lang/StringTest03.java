package chap10.api.lang;
//String class 주요 method
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다.");
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));	//a 처음 인덱스
		System.out.println("str1.indexOf('합')=>"+str1.indexOf("합"));	//해당글자가 없을 때는 -1 
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));	//마지막 a 인덱스
		System.out.println("str1.length()=>"+str1.length());
		System.out.println("str1.equals('java programming')=>"+str1.equals("java programming"));
		System.out.println("str1.equalsIgnoreCase('java programming')=>"+str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equals('Java programming')=>"+str1.equals("Java programming"));	//대소문자까지 정확하게 비교
		System.out.println("str1.equalsIgnoreCase('Java programming')=>"+str1.equalsIgnoreCase("Java programming"));	// 대문자소문자 상관없이 문자열 비교
		System.out.println("str1.startsWith('java')=>"+str1.startsWith("java"));	//지정한 문자열로 시작하는가
		System.out.println("str1.endsWith('java')=>"+str1.endsWith("java"));		//지정한 문자열로 끝나는가
		System.out.println("str1.endsWith('mming')=>"+str1.endsWith("mming"));
		//String객체는 원본이 변경되지 않고 메소드 실행결과로 새로운 String객체가 만들어진다.
		//문자열 조작이 많은 곳에서 String을 쓰는 것은 부담.
		System.out.println(str1);
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());  
		System.out.println("str1.toUpperCase().toLowerCase()=>"+(str1.toUpperCase().toLowerCase()));
		System.out.println();
		System.out.println();
		System.out.println();
		String data = new String("java programming");
		//GNIMMARGORP AVAJ
		//또는 data = data.toUpperCase(); 후 data.CharAt(i);
		for(int i=data.length()-1; i>=0; i--){
			System.out.print(data.toUpperCase().charAt(i));
		}
		System.out.println();
	}
}
