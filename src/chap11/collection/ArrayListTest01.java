package chap11.collection;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("oracle");
		list.add("swing");
		list.add("html5");
		list.add("css");
		list.add("java");
		
		System.out.println("¿ä¼ÒÀÇ °¹¼ö: "+ list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
