package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//insert문을 실행
public class InsertTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert into kitridept values('009','영업1','11층','02-222-222','jang')";

		try {
			// 1. JDBC드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공");

			// 2. 커넥션 설정
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공: " + con);

			// 3. SQL문을 실행하기 위한 객체를 생성
			Statement stmt = con.createStatement();
			System.out.println("Statement객체 생성 성공: " + stmt);
			
			// 4. SQL실행, 5. 결과처리
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개 삽입 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
