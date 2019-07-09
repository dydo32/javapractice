package chap11.collection;

import java.util.Vector;

//배열을 벡터로 변환해서 리턴하는 메소드를 정의하세요.
//myarr를 매개변수로 받아서 벡터로 변환하여 리턴하는 메소드를 정의. - changeVector
//main메소드에서는 changeVector를 호출하여 Vector에 저장된 결과가 출력되도록 정의
public class VectorExam03 {

	public static void main(String[] args) {
		int[] myarr = { 99, 100, 150, 77, 50 };
		Vector<Integer> v = new Vector<Integer>();

		// 2. 1번에서 구현한 changeVector메소를 호출하고
		// 3. 호출결과로 리턴받은 Vector에 저장된 요소를 sysout으로 출력
		v = changeVector(myarr);
		for(int i=0; i<v.size(); i++){
			System.out.print(v.get(i) + "\t");
		}
	}

	// 1. changeVector메소드를 정의하고 내부 코드를 구현하세요
	// => static메소드로 작성하여 매개변수로 전달받은 배열을 벡터로 변환해서 리턴
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
