package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		//String sql =
		//	"update kitridept set mgr = 'lee' where deptname = '�λ��' " ;
		String sql = "update kitridept ";
		sql = sql + "set mgr = 'lee' ";
		sql = sql + "where deptname = '�λ��'";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = 
					DriverManager.getConnection(url, user, password);
			
			Statement stmt = con.createStatement();
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"���� �� ���� ����");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
