package chap04;
/* 3.
 *  AlphaTest.java
 *  A부터 Z까지 출력하세요.
 *  ABCDEFG...Z
 */
/*
public class AlphaTest {
	public static void main(String[] args) {
		for(char ch='A'; ch<='Z'; ch++){
			System.out.print(ch);
		}
		System.out.println();
	}
}
*/
public class AlphaTest {
	public static void main(String[] args) {
		char c = 'Z';
		System.out.println((int)c);
		for(int i=65;i<=90;i++){
			System.out.print((char)i);
		}
		System.out.println();
		
		for(char alpha='A' ;alpha<='Z'; alpha++){
			System.out.print(alpha);
		}
		System.out.println();
	}
}
