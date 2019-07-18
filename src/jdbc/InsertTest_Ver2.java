package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest_Ver2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		InsertTest_Ver2 obj = new InsertTest_Ver2();
		System.out.print("�μ���ȣ: ");
		String deptno = key.next();
		System.out.print("�μ���: ");
		String deptname = key.next();
		System.out.print("��ġ: ");
		String loc = key.next();
		System.out.print("��ȭ��ȣ: ");
		String telnum = key.next();
		System.out.print("������: ");
		String mgr = key.next();
		obj.insert(deptno, deptname, loc, telnum, mgr);
	}

	public void insert(String deptno, String deptname, String loc, String telnum, String mgr) {
		String url = "jdbc:oracle:thin:@192.168.56.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert into kitridept values('" + deptno + "','" + deptname + "','" + loc + "','" + telnum + "','"
				+ mgr + "')";
		// sql�ۼ�
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
			System.out.println(result + "�� ���� ����");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
