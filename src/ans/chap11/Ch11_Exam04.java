package ans.chap11;

import java.util.Iterator;
import java.util.TreeSet;

public class Ch11_Exam04 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("C");
		ts.add("E");
		ts.add("A");
		ts.add("F");
		ts.add("B");
		ts.add("G");
		ts.add("D");
		ts.add("A");

		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.printf("%3s", it.next());
		}
		System.out.println("\n\n특정 범위 추출");

		TreeSet<String> ts02 = new TreeSet<String>();
		ts02 = (TreeSet<String>) ts.subSet("B", "G");

		Iterator<String> it02 = ts02.iterator();
		while (it02.hasNext()) {
			System.out.printf("%3s", it02.next());
		}
		System.out.println("\n\n  FFF 추가 후 전체 출력");

		ts02.add("FFF");
		ts.addAll(ts02);
		Iterator<String> it03 = ts.iterator();
		while (it03.hasNext()) {
			System.out.printf("%3s", it03.next());
		}

	}
}
