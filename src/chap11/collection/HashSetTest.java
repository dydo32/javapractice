package chap11.collection;

import java.util.HashSet;
import java.util.Iterator;

//집합의 구조 - 데이터를 중복해서 저장할 수 없다.
//자료구조는 데이터의 저장/데이터꺼내기가 가장 중요.
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("oracle");
		set.add("swing");
		set.add("html5");
		set.add("css");
		set.add("java");
		System.out.println("요소의 갯수: " + set.size());

		// Set은 선형구조가 아니라 순서대로 읽어올 수 없다.
		// 여러자료구조들의 표준포맷인 Iterator로 변환한 후 읽는다.
		// ==> HashSet을 Iterator로 변환
		Iterator<String> it = set.iterator();
		while (it.hasNext()) { // Iterator안에 엘리먼트가 있는지 확인 - boolean리턴
			String element = it.next(); // Iterator에 저장된 요소를 꺼내기
			System.out.println("set에 저장된요소=>" + element); // set은 순서가 없다.
		}
	}
}
