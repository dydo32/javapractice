package chap10.api.lang;
//StringŬ������  �ֿ� �޼ҵ�
public class StringTest04 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�.");
		System.out.println("str1.substring(5)=>"+str1.substring(5)); //index 5����
		System.out.println("str1.substring(5,8)=>"+str1.substring(5,8));	//index 5~7(8-1) -> index~index-1
		System.out.println("str1.replace('a','A')=>"+str1.replace('a','A')); //a�� ã�Ƽ� A�� 
		System.out.println("����=>"+str1);
	}
}
