package chap11.util;

import java.util.StringTokenizer;

public class StringTokenizerTest {
//String클래스의 split()과 비슷한 개념
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("java:servlet:jdbc:spring",":");
		System.out.println(st.countTokens());	//:으로 분리한 토큰의 전체갯수
		while(st.hasMoreTokens()){
			System.out.println("반복문");
			String token = st.nextToken(); //nextToken하면 토큰 하나 빼는 것
			System.out.println("token: "+token);
		}
	}
}
