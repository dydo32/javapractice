package chap01;
/*���ڿ��� ó���ϱ� ���� ����� ����ϱ�����
//StringŬ������ JVM�� �ν��ϴ� �۾������� �Ҵ�
//-----------------------------------
//				|_ heap�� �Ҵ��Ѵٴ� �ǹ�
//[����]
//	new heap���Ҵ��ϰ����Ŭ������()
//	or new heap���Ҵ��ϰ����Ŭ������(��1,��2,...)
*/
public class APITest {
	public static void main(String[] args) {
		String str = new String();
		//"java"���ڿ��� ó���ϱ� ���� StringŬ������ heap�� �Ҵ�
		String str2 = new String("java");
		//str2�� �����ϴ� heap�� String��ü�� ã�Ƽ� charAt�� ȣ��
		//ȣ���ϸ鼭 charAt�� int�� �Ű������� �ʿ�� �ϱ� ������ int���� ����
		char resultVal = str2.charAt(2);
		System.out.println("result=>"+resultVal);

	}
}
