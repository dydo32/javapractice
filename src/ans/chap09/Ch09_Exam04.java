package ans.chap09;

public class Ch09_Exam04 {

	public static void main(String[] args) {			
			
			System.out.println ( "���� ����");
			try {
				int i=0 , j = 100;
				System.out.println ( "j :"+ j);			
				System.out.println ( "j / i :"+ j / i);			
				System.out.println ( "try ��� ����");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println ( "���� :"+ e);
				System.out.println ( "�μ��� �ϳ� �Է��Ͻʽÿ�.");
			} catch (NumberFormatException e) {
				System.out.println ( "���� :"+ e);
				System.out.println ( "�μ��� ������ �Է��Ͻʽÿ�.");
			} catch (ArithmeticException e) {
				System.out.println ( "���� :"+ e);
				System.out.println ( "�μ��� 0�� �ƴ� ������ �Է��Ͻʽÿ�.");
			} catch (Exception e) {
				System.out.println ( "� ���ܰ� �߻��߽��ϴ�.");
				e.printStackTrace ();
			}
			System.out.println ( "���� ����");
		}
	}

