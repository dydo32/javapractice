package chap11.collection;

import java.util.Vector;

public class VectorExam01 {
	public static void main(String[] args) {
		// 78,99,100,95,100���� Vector�� �����ϰ� ������ ����� ����ϼ��� (����)
		Vector<Integer> v = new Vector<Integer>();
		v.add(78);
		v.add(99);
		v.add(100);
		v.add(95);
		v.add(100);
		
		int sum = 0;
		
		for(int i=0; i<v.size(); i++){
			int num = v.get(i);
			sum = sum + num;
		}
		
		System.out.println("����: "+sum);
		System.out.println("���: "+sum/v.size());
	}
}
