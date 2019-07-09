package chap11.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//������ ���� - �����͸� �ߺ��ؼ� ������ �� ����.
//�ڷᱸ���� �������� ����/�����Ͳ����Ⱑ ���� �߿�.
public class HashSetTest02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("oracle");
		set.add("swing");
		set.add("html5");
		set.add("css");
		set.add("java");
		System.out.println("set ����� ����: " + set.size());
		
		//������ - Set�� �����Ҷ� �Ű������� �ٸ� Set��ü�� �̿��ؼ� �۾�
		HashSet<String>	set2 = new HashSet<String>(set);
		set2.add("java");
		set2.add("hadoop");
		System.out.println("set2 ����� ����: " + set2.size());
		
		//������
		HashSet<String>	set3 = new HashSet<String>();
		set3.add("java");
		set3.add("hadoop");
		set3.add("raspberry");
		
		print(set);
		print(set3);
		set.retainAll(set3);	//�� ���� Set���� �ߺ��Ǵ� ���� ���Ӱ� ���õȴ�.
		System.out.println("set ����� ����: " + set.size());
		print(set);
	}
	
	public static void print(Set<String> set) {
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String element = it.next();
			System.out.println("set�� ����ȿ��=>" + element);
		}
		System.out.println("==================================");
	}
}
