package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//PreparedStatement�� �̿��ؼ� insert���� ����
public class PreparedInsertTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		KitriDeptDAO obj = new KitriDeptDAO();
		// PreparedInsertTest obj = new PreparedInsertTest();
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
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert into kitridept values(?,?,?,?,?)";
		// sql�ۼ�
		try {
			// 1. JDBC����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε�����");

			// 2. Ŀ�ؼ� ����
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ��: " + con);

			// 3. SQL���� �����ϱ� ���� ��ü�� ����
			PreparedStatement ptmt = con.prepareStatement(sql);
			System.out.println("��ü ���� ����: " + ptmt);

			ptmt.setString(1, deptno);
			ptmt.setString(2, deptname);
			ptmt.setString(3, loc);
			ptmt.setString(4, telnum);
			ptmt.setString(5, mgr);
			int result = ptmt.executeUpdate();
			System.out.println(result + "�� �� ���� ����!");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
