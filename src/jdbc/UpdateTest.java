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
		//	"update kitridept set mgr = 'lee' where deptname = '인사부' " ;
		String sql = "update kitridept ";
		sql = sql + "set mgr = 'lee' ";
		sql = sql + "where deptname = '인사부'";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = 
					DriverManager.getConnection(url, user, password);
			
			Statement stmt = con.createStatement();
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개의 행 수정 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
