package chap03;
//�������� - shortcut
public class OprTest04_shortcut{
	public static void main(String[] args) {
		int num=100;
		String str = null;
		System.out.println("shortcut������ �׽�Ʈ"); 
		//str.length(); //����
		
		System.out.println(num>=100 || str.length()==0);
		//System.out.println(num>=100 | str.length()==0);
		
		System.out.println(num<100 && str.length()==0);
		//System.out.println(num<100 & str.length()==0); // �ظ��ϸ� �ϳ�¥�� ���°� ����, ��������
		
		System.out.println(!(num<100));
		System.out.println(!(num>=100));

	}
}
