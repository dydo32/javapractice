package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		// String sql =
		// "delete from kitridept where deptname = '����1' " ;
		StringBuffer sql = new StringBuffer();
		sql.append("delete from kitridept ");
		sql.append("where deptname = '����1'");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection(url, user, password);

			Statement stmt = con.createStatement();

			int result = stmt.executeUpdate(sql.toString()); // �Ǵ� sql+" "
			System.out.println(result + "���� �� ���� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
