package chap04;
//if else if�� ǥ���ߴ� �ڵ带 switch�� ����
import java.util.Random;

public class SwitchTest03{
	public static void main(String[] args) {
		//switch�� �� ������ int�� casting �� �� �ִ� ���� ����� ����
		double d = 10.5; //switch�������� doubleŸ���� ��� �Ұ���
		/*switch(d){
			case 10.0:
				System.out.println("A");
		}*/

		int data = 5;
		switch(data+60){
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
			    break;
		}
		String code = new String("A01");
		switch(code){
			case "A01":
				System.out.println("A01");
				break;
		    case "B01":
				System.out.println("B01");
				break;
		}
	}
}
