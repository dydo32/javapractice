package chap11.util;

import java.util.StringTokenizer;

public class StringTokenizerTest {
//StringŬ������ split()�� ����� ����
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("java:servlet:jdbc:spring",":");
		System.out.println(st.countTokens());	//:���� �и��� ��ū�� ��ü����
		while(st.hasMoreTokens()){
			System.out.println("�ݺ���");
			String token = st.nextToken(); //nextToken�ϸ� ��ū �ϳ� ���� ��
			System.out.println("token: "+token);
		}
	}
}
