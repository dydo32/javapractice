package chap11.collection;

import java.util.HashSet;
import java.util.Iterator;

//������ ���� - �����͸� �ߺ��ؼ� ������ �� ����.
//�ڷᱸ���� �������� ����/�����Ͳ����Ⱑ ���� �߿�.
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("oracle");
		set.add("swing");
		set.add("html5");
		set.add("css");
		set.add("java");
		System.out.println("����� ����: " + set.size());

		// Set�� ���������� �ƴ϶� ������� �о�� �� ����.
		// �����ڷᱸ������ ǥ�������� Iterator�� ��ȯ�� �� �д´�.
		// ==> HashSet�� Iterator�� ��ȯ
		Iterator<String> it = set.iterator();
		while (it.hasNext()) { // Iterator�ȿ� ������Ʈ�� �ִ��� Ȯ�� - boolean����
			String element = it.next(); // Iterator�� ����� ��Ҹ� ������
			System.out.println("set�� ����ȿ��=>" + element); // set�� ������ ����.
		}
	}
}
