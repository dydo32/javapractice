package ans.chap04;
import java.util.*;

public class Ch04_Exam02 {

	public static void main(String[] args) {

		while(true){
		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.print("�� ���� �Է��ϼ��� ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % 3 == 0 & b % 6 == 0) {
			System.out.println(a + "*" + b + "=" + (a * b));
			break;
		} else {
			System.out.println(a + "��" + b + "�� 3�� 6�� ����� �ƴմϴ�");
		  }
		}

	}

}
