package ans.chap11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ch11_Exam01 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name", "RuRi");
		hm.put("address", "Alberta");
		hm.put("tel", "999-999-9999");	



		for (Map.Entry<String, String> e : hm.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		Prn(hm);
	}

	private static void Prn(HashMap<String, String> hm) {
		System.out.println("=====================================");
		for (Iterator<Map.Entry<String, String>> it = hm.entrySet().iterator(); it
				.hasNext();) {
			Map.Entry<String, String> entry = it.next();
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " : " + val);
		}
	}

}
