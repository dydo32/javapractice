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
			// 1.JDBC����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε�����");

			// 2.Ŀ�ؼ� ����
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ��: " + con);

			// 3.SQL���� �����ϱ� ���� ��ü�� ����
			Statement stmt = con.createStatement();
			System.out.println("Statement��ü ���� ����: "+ stmt);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
