package chap01;
/*"i like java"���ڿ��� �Ʒ� ���ǿ� �°� ó���ϼ���
1.StringŬ������ �����մϴ�.(����������: str)
2.StringŬ������ ���ǵǾ� �ִ� length��� �޼ҵ带 ã�Ƽ� ȣ��
3.������¿� ���� �޼ҵ� ȣ������ ����մϴ�.
	[�������]
	���ڿ��� ����=>________
*/
public class APITest2{
	public static void main(String[] args){
		String str = new String("i like java");//�޸𸮿� �ø��� �۾�
		int l = str.length();
		System.out.println("���ڿ��� ����=>"+l);
	}
}