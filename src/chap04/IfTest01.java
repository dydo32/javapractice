package chap04;
import java.util.Random;
//if��
public class IfTest01 {
	public static void main(String[] args) {
		//��� ����� �ݵ�� {}�� ǥ���ϰ� ����Ѵ�.
		//{}�� ���� �ʾ��� ��� ������ �����ϸ� �ٷ� �Ʒ� �� ���常 ����ȴ�.
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		//int test = 51;
		System.out.println(num);
		if(num>=90){
			System.out.println("����");
			System.out.println("if�����ϱ�??");
		}
		System.out.println("����");
	}
}
