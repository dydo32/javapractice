package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//insert���� ����
public class InsertTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert into kitridept values('009','����1','11��','02-222-222','jang')";

		try {
			// 1. JDBC����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε�����");

			// 2. Ŀ�ؼ� ����
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ��: " + con);

			// 3. SQL���� �����ϱ� ���� ��ü�� ����
			Statement stmt = con.createStatement();
			System.out.println("Statement��ü ���� ����: " + stmt);
			
			// 4. SQL����, 5. ���ó��
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"�� ���� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
