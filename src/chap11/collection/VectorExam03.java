package chap11.collection;

import java.util.Vector;

//�迭�� ���ͷ� ��ȯ�ؼ� �����ϴ� �޼ҵ带 �����ϼ���.
//myarr�� �Ű������� �޾Ƽ� ���ͷ� ��ȯ�Ͽ� �����ϴ� �޼ҵ带 ����. - changeVector
//main�޼ҵ忡���� changeVector�� ȣ���Ͽ� Vector�� ����� ����� ��µǵ��� ����
public class VectorExam03 {

	public static void main(String[] args) {
		int[] myarr = { 99, 100, 150, 77, 50 };
		Vector<Integer> v = new Vector<Integer>();

		// 2. 1������ ������ changeVector�޼Ҹ� ȣ���ϰ�
		// 3. ȣ������ ���Ϲ��� Vector�� ����� ��Ҹ� sysout���� ���
		v = changeVector(myarr);
		for(int i=0; i<v.size(); i++){
			System.out.print(v.get(i) + "\t");
		}
	}

	// 1. changeVector�޼ҵ带 �����ϰ� ���� �ڵ带 �����ϼ���
	// => static�޼ҵ�� �ۼ��Ͽ� �Ű������� ���޹��� �迭�� ���ͷ� ��ȯ�ؼ� ����
	public static Vector<Integer> changeVector(int[] myarr) {
		Vector<Integer> v = new Vector<Integer>();
		int data = 0;

		for (int i = 0; i < myarr.length; i++) {
			data = myarr[i];
			v.add(data);
		}

		return v;
	}

}
