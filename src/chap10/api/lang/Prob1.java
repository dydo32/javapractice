package chap10.api.lang;

public class Prob1 {

	public static void main(String[] args) {
		System.out.println("���ڿ��� Ư������ �����ϴ� �׽�Ʈ");
		System.out.println("-------------Sample 1 --------------");
		String str1 = myReplace("hello world", 'l', '*');
		System.out.println(str1);

		System.out.println("-------------Sample 2 --------------");
		String str2 = myReplace("hello world", ' ', '-');
		System.out.println(str2);

		System.out.println("-------------Sample 3 --------------");
		String str3 = myReplace("hello world", 'a', '*');
		System.out.println(str3);
	}

	public static String myReplace(String str, char oldChar, char newChar) {
		// �� �κ��� �����Ͻÿ�.
		// ���ڸ� �ϳ��� �����ؼ� oldChar�� ��
		// �����ϳ��� ������ ���� �ٽ� ���ļ� ���
		// - oldChar�� ��ġ�ϴ� ���� newChar�� �����ؼ� ����
		// - ��ġ�����ʴ� ���ڴ� �������� ����
		String result = "";
		int size = str.length();
		for(int i=0; i<size ;i++){
			if(str.charAt(i) == oldChar){
				result = result + newChar;
			}else{
				result = result + str.charAt(i);
			}
		}
		return result;
	}
}
