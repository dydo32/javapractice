package chap11.collection;

import java.util.Vector;

public class StringTest {
	// main �޼���� �������� ������.
	public static void main(String[] args) {
		// String[] ���� �����Ͱ� �� �߰��� �� �ֽ��ϴ�~!
		StringTest st = new StringTest();
		String[] strData = { "Java Programming", "JDBC", "Oracle10g", "JSP/Servlet" };
		Vector<String> v = new Vector<String>();
		v = st.dataChange(strData);
		for( int i=0 ; i < v.size(); i++ ){
			System.out.println(v.elementAt(i) );
			System.out.println(v.get(i));
		}
	}

	// �޼ҵ� �ñ״�ó ���� ����.
	public Vector<String> dataChange( String[] strData ){ 
		// �����ϼ��� ------------------------------------
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
