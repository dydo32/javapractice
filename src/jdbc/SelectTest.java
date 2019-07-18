package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select * from kitridept";
				
		try {
			//1. JDBC����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε�����");
			
			//2. Ŀ�ؼ� ����
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ��: "+ con);
			
			//3. SQL���� �����ϱ� ���� ��ü�� ����
			Statement stmt = con.createStatement();
			System.out.println("Statement ��ü ���� ����: "+stmt);
			
			//4. SQL�� ����
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("����:"+rs);
			
			//5. ���ó��
			while(rs.next()){
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println(rs.getString("mgr"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
