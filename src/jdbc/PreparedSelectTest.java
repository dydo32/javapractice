package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//PreparedStatement를 이용해서 update문을 실행
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
		//sql작성
		try {
			//1. JDBC드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공");
			
			//2. 커넥션 설정
			Connection con = 
					DriverManager.getConnection(url, user, password);
			System.out.println("연결성공: "+ con);
			
			//3. SQL문을 실행하기 위한 객체를 생성
			PreparedStatement ptmt = con.prepareStatement(sql.toString());
			System.out.println("객체 생성 성공: "+ ptmt);
			
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
