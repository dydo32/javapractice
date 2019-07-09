package chap11.collection;

import java.util.Random;
import java.util.Vector;

public class VectorExam02 {

	public static void main(String[] args) {
		// 50���� �������� 6�� �߻����Ѽ� Vector�� �����ϰ� ����� ���ڸ� ������ ���� ������·� ����ϼ���.
		// ex)������ 5,7,9,10,22,33
		// [�������]
		// 5(Ȧ��),7(Ȧ��),9(Ȧ��),10(¦��),22(¦��),33(Ȧ��)

		Vector<Integer> v = new Vector<Integer>();
		Random rand = new Random();

		// ���Ϳ� �����͸� �����ϴ� for��
		for (int i = 0; i < 6; i++) {
			v.add(rand.nextInt(50)+1);
		}
		
		for(int i =0; i<v.size();i++){
			int data = v.get(i);
			if(data%2==0){
				System.out.print(data+"(¦��) ");
			}else{
				System.out.print(data+"(Ȧ��) ");
			}
		}
	}

}
