package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//PreparedStatement�� �̿��ؼ� update���� ����
public class PreparedUpdateTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		KitriDeptDAO obj = new KitriDeptDAO();
		//PreparedUpdateTest obj = new PreparedUpdateTest();
		System.out.print("� �μ���ȣ�� ����: ");
		String deptno = key.next();
		System.out.print("������ �����ھ��̵�: ");
		String mgr = key.next();
		obj.update(deptno,mgr);
	}
	public void update(String deptno, String mgr){
		String url = "jdbc:oracle:thin:@192.168.56.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = 
			"update kitridept set mgr = ? where deptno = ?";
		//sql�ۼ�
		try {
			//1. JDBC����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε�����");
			
			//2. Ŀ�ؼ� ����
			Connection con = 
					DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ��: "+ con);
			
			//3. SQL���� �����ϱ� ���� ��ü�� ����
			PreparedStatement ptmt = con.prepareStatement(sql);
			System.out.println("��ü ���� ����: "+ ptmt);
			
			ptmt.setString(1, mgr);
			ptmt.setString(2, deptno);
			
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
