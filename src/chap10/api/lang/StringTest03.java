package chap10.api.lang;
//String class �ֿ� method
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�.");
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));	//a ó�� �ε���
		System.out.println("str1.indexOf('��')=>"+str1.indexOf("��"));	//�ش���ڰ� ���� ���� -1 
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));	//������ a �ε���
		System.out.println("str1.length()=>"+str1.length());
		System.out.println("str1.equals('java programming')=>"+str1.equals("java programming"));
		System.out.println("str1.equalsIgnoreCase('java programming')=>"+str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equals('Java programming')=>"+str1.equals("Java programming"));	//��ҹ��ڱ��� ��Ȯ�ϰ� ��
		System.out.println("str1.equalsIgnoreCase('Java programming')=>"+str1.equalsIgnoreCase("Java programming"));	// �빮�ڼҹ��� ������� ���ڿ� ��
		System.out.println("str1.startsWith('java')=>"+str1.startsWith("java"));	//������ ���ڿ��� �����ϴ°�
		System.out.println("str1.endsWith('java')=>"+str1.endsWith("java"));		//������ ���ڿ��� �����°�
		System.out.println("str1.endsWith('mming')=>"+str1.endsWith("mming"));
		//String��ü�� ������ ������� �ʰ� �޼ҵ� �������� ���ο� String��ü�� ���������.
		//���ڿ� ������ ���� ������ String�� ���� ���� �δ�.
		System.out.println(str1);
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());  
		System.out.println("str1.toUpperCase().toLowerCase()=>"+(str1.toUpperCase().toLowerCase()));
		System.out.println();
		System.out.println();
		System.out.println();
		String data = new String("java programming");
		//GNIMMARGORP AVAJ
		//�Ǵ� data = data.toUpperCase(); �� data.CharAt(i);
		for(int i=data.length()-1; i>=0; i--){
			System.out.print(data.toUpperCase().charAt(i));
		}
		System.out.println();
	}
}
