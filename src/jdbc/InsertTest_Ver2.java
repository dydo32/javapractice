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
		System.out.print("부서번호: ");
		String deptno = key.next();
		System.out.print("부서명: ");
		String deptname = key.next();
		System.out.print("위치: ");
		String loc = key.next();
		System.out.print("전화번호: ");
		String telnum = key.next();
		System.out.print("관리자: ");
		String mgr = key.next();
		obj.insert(deptno, deptname, loc, telnum, mgr);
	}

	public void insert(String deptno, String deptname, String loc, String telnum, String mgr) {
		String url = "jdbc:oracle:thin:@192.168.56.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert into kitridept values('" + deptno + "','" + deptname + "','" + loc + "','" + telnum + "','"
				+ mgr + "')";
		// sql작성
		try {
			// 1. JDBC드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공");

			// 2. 커넥션 설정
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공: " + con);

			// 3. SQL문을 실행하기 위한 객체를 생성
			Statement stmt = con.createStatement();
			System.out.println("Statement객체 생성 성공: " + stmt);

			// 4. SQL실행, 5. 결과처리
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "개 삽입 성공");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
