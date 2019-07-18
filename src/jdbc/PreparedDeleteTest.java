package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//PreparedStatement를 이용해서 update문을 실행
public class PreparedDeleteTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		KitriDeptDAO obj = new KitriDeptDAO();
		//PreparedDeleteTest obj = new PreparedDeleteTest();
		System.out.print("삭제할 부서명: ");
		String deptname = key.next();
		obj.delete(deptname);
	}
	public void delete(String deptname){
		String url = "jdbc:oracle:thin:@192.168.56.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = 
			"delete from kitridept where deptname = ?";
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
			
			ptmt.setString(1, deptname);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삭제 성공!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
