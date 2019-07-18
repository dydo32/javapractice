package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//자원반납
public class CloseTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PreparedSelectTest obj = new PreparedSelectTest();
		obj.select();
	}
	public void select(){
		String url = "jdbc:oracle:thin:@192.168.56.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select * from kitridept";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		//sql작성
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql.toString());
			rs = ptmt.executeQuery();
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
		} finally {
			try{
				if(rs != null) rs.close();
				if(ptmt != null) ptmt.close();
				if(con != null) con.close();
			}catch(SQLException e){}
		}
	}
}
