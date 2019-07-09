package chap11.collection;

import java.util.Vector;

public class VectorExam04 {

	public static void main(String[] args) {
		/*
		 * 번호 성명 국어 수학 영어 1 장동건 100 99 88 2 이민호 89 100 78 3 김범룡 95 89 100
		 * 
		 * => 제목 빼고 데이터만 벡터에 저장하기: Vector<Vector<String>>
		 */
		// 하나의 벡터로 표현된 레코드를 담을 벡터를 정의
		// => 벡터가 저장된 벡터
		Vector<Vector<String>> vlist = new Vector<Vector<String>>();

		// 한 학생의 데이터를 저장할 벡터들을 생성하고 데이터를 add(벡터-3개)
		Vector<String> v1 = new Vector<String>();
		v1.add("장동건");
		v1.add("100");
		v1.add("99");
		v1.add("88");
		Vector<String> v2 = new Vector<String>();
		v2.add("이민호");
		v2.add("89");
		v2.add("100");
		v2.add("78");
		Vector<String> v3 = new Vector<String>();
		v3.add("김범룡");
		v3.add("95");
		v3.add("89");
		v3.add("100");

		vlist.add(v1);
		vlist.add(v2);
		vlist.add(v3);
		
		display(vlist);
	}
	// 메소드 정의 - 매개변수로 vlist를 전달받아서 값을 출력하는 메소드를 구현 display
	// hint) 매개변수로 전달된 벡터에서 벡터를 꺼내서 출력해야 하므로 이중 for를 이용
	// =>파일과 출력화면 캡쳐 제출
	public static void display(Vector<Vector<String>> vlist){
		for(int row = 0; row < vlist.size(); row++){
			//벡터에 저장된 요소를 꺼낸다. 이 요소가 DB의 한 레코드라고 생각
			Vector<String> v = vlist.get(row);
			//꺼낸 레코드 (벡터)안에 저장되어있는 컬럼의 값들을 다시 꺼낸다.
			for(int col = 0; col < v.size(); col++){
				String colValue = v.get(col);
				System.out.print(colValue + "\t");
			}
			System.out.println();
		}
		/*for (int i = 0; i < vlist.size(); i++) {
			for(int j = 0; j < (vlist.get(i)).size(); j++){
				System.out.print((vlist.get(i)).get(j)+"\t");
			}
			System.out.println();
		}*/
		
	}
}
