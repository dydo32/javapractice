package chap09;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		
		if(num%2==1){
			//���ܻ�Ȳ - ����� ���� ���ܸ� �߻���Ų��.
			try{
				throw new MyException();		// ���� �߻� ���ɼ��� �ִ� �ڵ�
			}catch(MyException e){				// �ݵ�� try~catch�� ó���ϰų�
				System.out.println(e.getMessage());	// �޼ҵ��� ���� throws�� ȣ���ϴ� ������
				e.printStackTrace();			// ó���ϵ��� �� �� �ִ�.
			}
		}else{
			//�����Ȳ
			System.out.println("�Է¹��� ����=>" + num);
		}
	}

}