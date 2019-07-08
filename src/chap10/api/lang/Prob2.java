package chap10.api.lang;

public class Prob2 {
	public static void main(String[] args) {
		Prob2 prob2 = new Prob2();
		System.out.println(prob2.leftPad("KITRI", 8, '#'));
		System.out.println(prob2.leftPad("KITRI", 7, '$'));
		System.out.println(prob2.leftPad("KITRI", 5, '&'));
	}
	
	public String leftPad(String str, int size, char padChar) {
		/* ���⿡ ���α׷��� �ϼ��Ͻʽÿ�. */
		String result = "";
		int length = size - str.length();//new���ڿ��Ǳ��� - old���ڿ��Ǳ��� 
		//new���ڿ��Ǳ��̰� old���ڿ��� ���̺��� ū ��� old���ڿ��� �׳� ����
		if(length<=0){
			return str;
		}
		//length�� ũ�⸸ŭ padChar�� �߰�
		for (int i = 1; i <= length; i++) {
			result = result+padChar;
		}
		//������ padChar�� old���ڿ��� �����ؼ� new���ڿ��� ����
		result = result + str;
		
		return result;
	}
}
