package jdbc.step01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KitriEmpDAO {
	public void insert(String id, String pass, String name, String addr, String deptno) {
		String sql = "insert into kitriemp values(?,?,?,?,sysdate,'7급',1000,?)";
		Connection con = null;
		PreparedStatement ptmt = null;

		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);

			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			ptmt.setString(3, name);
			ptmt.setString(4, addr);
			ptmt.setString(5, deptno);
			
			ptmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
	}

	public void update(String id, String addr) {
		String sql = "update kitriemp set addr = ? where id = ?";
		Connection con = null;
		PreparedStatement ptmt = null;

		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);

			ptmt.setString(1, addr);
			ptmt.setString(2, id);

			ptmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
	}

	public void delete(String id) {
		String sql = ("delete from kitriemp where id = ?");
		Connection con = null;
		PreparedStatement ptmt = null;

		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);

			ptmt.setString(1, id);
			
			ptmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
	}

	public void select() {
		String sql = "select * from kitriemp";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);

			rs = ptmt.executeQuery();
			
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getDate(5) + "\t");
				System.out.print(rs.getString(6) + "\t");
				System.out.print(rs.getInt(7) + "\t");
				System.out.println(rs.getString(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
	}

	public void findByAddr(String addr) {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from kitriemp ");
		sql.append("where addr like ? "); //물음표 양옆에 아무것도 붙이지 않는다.
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql.toString());
			
			ptmt.setString(1, "%"+addr+"%");  //물음표하나.
			rs = ptmt.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
	}
}
