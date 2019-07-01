package ans.chap11;

import java.util.HashMap;
import java.util.Map;

public class Ch11_Exam02 {
	public static void main(String[] args) {
		  Map<String, Integer> m = new HashMap<String, Integer>();

		   String  str="Map은  Key & Value 의 형태로 입력 이 되며, "
		   		+ "  Key 을 입력 하면 해당하는 Value 을 리턴 할수 있다. ";
		   
		   String []args1=str.split("\\s");
	        for (String a : args1) {
	            Integer freq = m.get(a);
	            m.put(a, (freq == null) ? 1 : freq + 1);
	        }
	        System.out.println(m.size() + " 's  distinct words:");
	      
	        for(Map.Entry<String, Integer> e : m.entrySet()) {
	            System.out.println(e.getKey() + " : " + e.getValue());
	        }

	}

}