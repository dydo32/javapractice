package chap11.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//집합의 구조 - 데이터를 중복해서 저장할 수 없다.
//자료구조는 데이터의 저장/데이터꺼내기가 가장 중요.
public class HashSetTest02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("oracle");
		set.add("swing");
		set.add("html5");
		set.add("css");
		set.add("java");
		System.out.println("set 요소의 갯수: " + set.size());
		
		//합집합 - Set을 생성할때 매개변수로 다른 Set객체를 이용해서 작업
		HashSet<String>	set2 = new HashSet<String>(set);
		set2.add("java");
		set2.add("hadoop");
		System.out.println("set2 요소의 갯수: " + set2.size());
		
		//교집합
		HashSet<String>	set3 = new HashSet<String>();
		set3.add("java");
		set3.add("hadoop");
		set3.add("raspberry");
		
		print(set);
		print(set3);
		set.retainAll(set3);	//두 개의 Set에서 중복되는 것이 새롭게 셋팅된다.
		System.out.println("set 요소의 갯수: " + set.size());
		print(set);
	}
	
	public static void print(Set<String> set) {
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String element = it.next();
			System.out.println("set에 저장된요소=>" + element);
		}
		System.out.println("==================================");
	}
}
