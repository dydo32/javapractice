package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionBasicTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "";
		Connection con = null;
		PreparedStatement ptmt = null;
		// 현재작업에 진행상태를 저장하기 위한 플래그변수 선언 - 정상상태인지 오류상태인지를 판단.
		boolean state = false;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			// 트랜잭션 처리를 하려면 autocommit을 해제.
			con.setAutoCommit(false);

			sql = "insert into kitridept values('7777','7777','444','444','4444')";
			ptmt = con.prepareStatement(sql);
			ptmt.executeUpdate();

			sql = "insert into kitridept values('8888','8888','5555','5555','5555')";
			ptmt = con.prepareStatement(sql);
			ptmt.executeUpdate();

			sql = "insert into kitridept values('8888','9999','6666','6666','6666')";
			// 오류났으니 다른것도 들어가지 않아야함.
			ptmt = con.prepareStatement(sql);
			ptmt.executeUpdate();

			// 이 line이 실행된다는 것은 정상적으로 작업이 완료 되었다는 것을 의미
			state = true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정산완료나 오류거나 모두 실행되는 finally안에서 db에 최종반영될수있도록 처리한다.
			try {
				if (state) {
					con.commit();	// db의 모든작업을 commit시킨다.
				}else{
					con.rollback(); //db의 모든작업을 rollback시킨다.
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
	}
}
