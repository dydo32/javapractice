package chap03;
public class PrimitiveTypeLiteral{
	public static void main(String[] args){
		boolean bool = true; //true or false
		System.out.println(bool);
		char c = 'a'; //charŸ���� ���ͷ��� ''�� ǥ���Ѵ�.
		System.out.println(c);

		//������
		//������ ������ �Ҵ�Ǵ� ���ͷ��� �⺻ ������ Ÿ���� int
		byte b = 127; //byte = int  
		System.out.println(b);
		
		short s = 32767; //short = int
		System.out.println(s);

		int i = 2147483647;
		System.out.println(i);

		long l = 1000; //long = int
		long l2 = 1000L;	//���ڵڿ� ���̻� L�̳� l�� �߰��ϸ� ���ͷ��� Ÿ���� long������ ��ȯ�ȴ�.
							//long = long
		System.out.println(l);
		System.out.println(l2);

		//�Ǽ��� - �Ҽ����� ǥ��(���ͷ��� �⺻ Ÿ���� double)
		float f = 10.5f;	//float = double
							//�Ǽ� �ڿ� f�� F�� �߰��ϸ� float���� ���ͷ��� ����ȴ�.
		System.out.println(f);
		
		double d = 10.5;
		System.out.println(d);

		double num = 10/3;
		System.out.println(num);
	}
}
