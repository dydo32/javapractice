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
		// �����۾��� ������¸� �����ϱ� ���� �÷��׺��� ���� - ����������� �������������� �Ǵ�.
		boolean state = false;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			// Ʈ����� ó���� �Ϸ��� autocommit�� ����.
			con.setAutoCommit(false);

			sql = "insert into kitridept values('7777','7777','444','444','4444')";
			ptmt = con.prepareStatement(sql);
			ptmt.executeUpdate();

			sql = "insert into kitridept values('8888','8888','5555','5555','5555')";
			ptmt = con.prepareStatement(sql);
			ptmt.executeUpdate();

			sql = "insert into kitridept values('8888','9999','6666','6666','6666')";
			// ���������� �ٸ��͵� ���� �ʾƾ���.
			ptmt = con.prepareStatement(sql);
			ptmt.executeUpdate();

			// �� line�� ����ȴٴ� ���� ���������� �۾��� �Ϸ� �Ǿ��ٴ� ���� �ǹ�
			state = true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ����Ϸᳪ �����ų� ��� ����Ǵ� finally�ȿ��� db�� �����ݿ��ɼ��ֵ��� ó���Ѵ�.
			try {
				if (state) {
					con.commit();	// db�� ����۾��� commit��Ų��.
				}else{
					con.rollback(); //db�� ����۾��� rollback��Ų��.
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
	}
}
