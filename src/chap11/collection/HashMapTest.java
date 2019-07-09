package chap11.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//key�� value�� ���·� ����Ǵ� ������
//key�� ���� Ÿ�԰� value�� ���� Ÿ���� ��� ���
public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		//HashMap�� ������ Ű�� �����͸� put�ϸ� ����Ⱑ �ȴ�.
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
		System.out.println("��ü map�� ����� ����=> "+map2.size());
		System.out.println("5�� key�� ����� ����� ��=> "+map2.get("5"));
		
		//Map�� ���� �� Set���� �̾Ƴ� ������ �̾Ƴ� (Set�� Iterator�� �ٲٰ� �̾Ƴ�)
		//map�� ����� �����͸� ������
		//1. map�� ���� �ִ� Ű������ Set���� ��ȯ
		Set<String> keylist = map2.keySet();
		Iterator<String> it = keylist.iterator();
		
		while(it.hasNext()){
			String key = it.next();
			String value = map2.get(key);
			System.out.println(key + " : "+value);
		}
	}
}
