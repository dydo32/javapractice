package chap11.collection;

import java.util.Vector;

public class StringTest {
	// main 메서드는 수정하지 마세요.
	public static void main(String[] args) {
		// String[] 에는 데이터가 더 추가될 수 있습니다~!
		StringTest st = new StringTest();
		String[] strData = { "Java Programming", "JDBC", "Oracle10g", "JSP/Servlet" };
		Vector<String> v = new Vector<String>();
		v = st.dataChange(strData);
		for( int i=0 ; i < v.size(); i++ ){
			System.out.println(v.elementAt(i) );
			System.out.println(v.get(i));
		}
	}

	// 메소드 시그니처 변경 금지.
	public Vector<String> dataChange( String[] strData ){ 
		// 구현하세요 ------------------------------------
		Vector<String> v = new Vector<String>();
		
		for(int i=strData.length-1;i>=0;i--){
			String str = "";
			for(int j=strData[i].length()-1; j>=0; j--){
				str = str + strData[i].charAt(j);
			}
			v.add(str);
		}
		return v;
		//-----------------------------------------------
	}
}
