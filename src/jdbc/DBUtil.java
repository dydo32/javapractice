package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * DB연동과 관련된 기능을 유틸리티처럼 제공하는 클래스
 * 1. 드라이버로딩
 * 2. DB서버연결
 * 3. 자원반납
 * => 유틸리티처럼 사용할 것이므로 static으로 구현
 */
public class DBUtil {
	// 1. 드라이버로딩
	// ==> 메소드마다 드라이버를 로딩하는 작업을 구현하지 않고 클래스로더가 작업클래스를 로딩할 때
	// 한번만 실행되도록 작업하기 위해서 static블럭을 선언하고 코드를 작성
	static {// DBUtil이 실행될 때 얘도 실행
		try {
			// 1. JDBC드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 2. DB서버 연결 - 커넥션설정
	public static Connection getConnect() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	// 3. 자원반납 - 각각의 메소드로 구현 or 한꺼번에 반납하는 메소드를 구현
	// 한꺼번에 반납하는 메소드.
	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
		}
	}

	// 커넥션을 반납하는 메소드(각각의 메소드로 반납)
	public static void close(Connection con) {
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
		}
	}
}
