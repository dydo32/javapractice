package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * DB������ ���õ� ����� ��ƿ��Ƽó�� �����ϴ� Ŭ����
 * 1. ����̹��ε�
 * 2. DB��������
 * 3. �ڿ��ݳ�
 * => ��ƿ��Ƽó�� ����� ���̹Ƿ� static���� ����
 */
public class DBUtil {
	// 1. ����̹��ε�
	// ==> �޼ҵ帶�� ����̹��� �ε��ϴ� �۾��� �������� �ʰ� Ŭ�����δ��� �۾�Ŭ������ �ε��� ��
	// �ѹ��� ����ǵ��� �۾��ϱ� ���ؼ� static���� �����ϰ� �ڵ带 �ۼ�
	static {// DBUtil�� ����� �� �굵 ����
		try {
			// 1. JDBC����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 2. DB���� ���� - Ŀ�ؼǼ���
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

	// 3. �ڿ��ݳ� - ������ �޼ҵ�� ���� or �Ѳ����� �ݳ��ϴ� �޼ҵ带 ����
	// �Ѳ����� �ݳ��ϴ� �޼ҵ�.
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

	// Ŀ�ؼ��� �ݳ��ϴ� �޼ҵ�(������ �޼ҵ�� �ݳ�)
	public static void close(Connection con) {
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
		}
	}
}
