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
			//1. JDBC드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공");
			
			//2. 커넥션 설정
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공: "+ con);
			
			//3. SQL문을 실행하기 위한 객체를 생성
			Statement stmt = con.createStatement();
			System.out.println("Statement 객체 생성 성공: "+stmt);
			
			//4. SQL문 실행
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("성공:"+rs);
			
			//5. 결과처리
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
