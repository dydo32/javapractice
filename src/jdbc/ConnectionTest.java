package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";

		try {
			// 1.JDBC드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공");

			// 2.커넥션 설정
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공: " + con);

			// 3.SQL문을 실행하기 위한 객체를 설정
			Statement stmt = con.createStatement();
			System.out.println("Statement객체 생성 성공: "+ stmt);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
