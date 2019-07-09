package chap11.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//key와 value의 형태로 저장되는 데이터
//key에 대한 타입과 value에 대한 타입을 모두 명시
public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		//HashMap에 동일한 키로 데이터를 put하면 덮어쓰기가 된다.
		map1.put(1, "java");
		map1.put(1, "oracle");
		map1.put(1, "swing");
		System.out.println(map1.get(1));
		System.out.println(map1.size());
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("1", "html5");
		map2.put("2", "css");	
		map2.put("3", "javascript");
		map2.put("4", "jquery");
		map2.put("5", "servlet");
		map2.put("6", "jsp");
		map2.put("7", "ajax");
		map2.put("8", "MEAN Stack");
		map2.put("9", "json");
		map2.put("10", "open API");
		map2.put("11", "web socket");
		System.out.println("전체 map의 요소의 갯수=> "+map2.size());
		System.out.println("5번 key로 저장된 요소의 값=> "+map2.get("5"));
		
		//Map을 뽑을 때 Set으로 뽑아낸 다음에 뽑아냄 (Set은 Iterator로 바꾸고 뽑아냄)
		//map에 저장된 데이터를 꺼내기
		//1. map이 갖고 있는 키값들을 Set으로 변환
		Set<String> keylist = map2.keySet();
		Iterator<String> it = keylist.iterator();
		
		while(it.hasNext()){
			String key = it.next();
			String value = map2.get(key);
			System.out.println(key + " : "+value);
		}
	}
}
