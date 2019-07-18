package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DAO가 접미사로 붙는 클래스는 DB를 액세스하기 위한 기능이 분리된 클래스
//테이블명+DAO
public class KitriDeptDAO {
	public void select() {
		String sql = "select * from kitridept";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnect(); // NullPointerException 나오면 디비연결에 실패했다는 뜻
			ptmt = con.prepareStatement(sql.toString());
			System.out.println("객체 생성 성공: " + ptmt);

			rs = ptmt.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.println(rs.getString("mgr"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
			// rs 없을때는 null
		}
	}
	
	public void insert(String deptno, String deptname, String loc, String telnum, String mgr) {
		String sql = "insert into kitridept values(?,?,?,?,?)";
		Connection con = null;
		PreparedStatement ptmt = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			System.out.println("객체 생성 성공: " + ptmt);

			ptmt.setString(1, deptno);
			ptmt.setString(2, deptname);
			ptmt.setString(3, loc);
			ptmt.setString(4, telnum);
			ptmt.setString(5, mgr);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삽입 성공!");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
	}

	public void update(String deptno, String mgr) {
		String sql = "update kitridept set mgr = ? where deptno = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		// sql작성
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			System.out.println("객체 생성 성공: " + ptmt);

			ptmt.setString(1, mgr);
			ptmt.setString(2, deptno);

			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 수정 성공!");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
	}

	public void delete(String deptname) {
		String sql = "delete from kitridept where deptname = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		// sql작성
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql.toString());
			System.out.println("객체 생성 성공: " + ptmt);

			ptmt.setString(1, deptname);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삭제 성공!");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
	}
}
