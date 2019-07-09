package chap11.collection;

import java.util.Vector;

public class ArrayCopy {

	public static void main(String[] args) {
		String[] datas =  { "1", "2", "3", "4", "5" };
		Vector<String> v = new Vector<String>();
		
		v = moveToVector(datas);
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}
	}
	
	public static Vector<String> moveToVector(String[] datas) {
		Vector<String> v = new Vector<String>();
		
		for(int i=datas.length-1; i>=0; i--){
			v.add(datas[i]);
		}
		return v;
	}
}
