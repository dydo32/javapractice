package chap11.collection;

import java.util.Vector;

public class VectorExam01 {
	public static void main(String[] args) {
		// 78,99,100,95,100점을 Vector에 저장하고 총점과 평균을 출력하세요 (제출)
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
		
		System.out.println("총점: "+sum);
		System.out.println("평균: "+sum/v.size());
	}
}
