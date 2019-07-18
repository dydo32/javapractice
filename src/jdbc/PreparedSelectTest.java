package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//PreparedStatement�� �̿��ؼ� update���� ����
public class PreparedSelectTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		KitriDeptDAO obj = new KitriDeptDAO();
		//PreparedSelectTest obj = new PreparedSelectTest();
		obj.select();
	}
	public void select(){
		String url = "jdbc:oracle:thin:@192.168.56.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select * from kitridept";
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
			PreparedStatement ptmt = con.prepareStatement(sql.toString());
			System.out.println("��ü ���� ����: "+ ptmt);
			
			ResultSet rs = ptmt.executeQuery();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
