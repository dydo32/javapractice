package jdbc.step02;

import static fw.DBUtil.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAOImpl implements EmpDAO {

	@Override
	public int insert(String id, String pass, String name, String addr, String deptno, Connection con)
			throws SQLException {
		int result = 0;
		String sql = "insert into kitriemp values(?,?,?,?,sysdate,'7급',1000,?)";
		PreparedStatement ptmt = null;
		
		ptmt = con.prepareStatement(sql);
		ptmt.setString(1, id);
		ptmt.setString(2, pass);
		ptmt.setString(3, name);
		ptmt.setString(4, addr);
		ptmt.setString(5, deptno);
		result = ptmt.executeUpdate();
		close(ptmt);
		
		return result;
	}

	@Override
	public int update(String id, String addr, Connection con) throws SQLException {
		int result = 0;
		String sql = "update kitriemp set addr = ? where id = ?";
		PreparedStatement ptmt = null;

		ptmt = con.prepareStatement(sql);
		ptmt.setString(1, addr);
		ptmt.setString(2, id);
		result = ptmt.executeUpdate();
		close(ptmt);
		
		return result;
	}

	@Override
	public int delete(String id, Connection con) throws SQLException {
		int result = 0;
		String sql = ("delete from kitriemp where id = ?");
		PreparedStatement ptmt = null;

		ptmt = con.prepareStatement(sql);
		ptmt.setString(1, id);
		result = ptmt.executeUpdate();
		close(ptmt);
		
		return result;
	}

	@Override
	public void select(Connection con) throws SQLException {
		String sql = "select * from kitriemp";
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		ptmt = con.prepareStatement(sql);
		rs = ptmt.executeQuery();
		while(rs.next()){
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\t");
			System.out.print(rs.getDate(5) + "\t");
			System.out.print(rs.getString(6) + "\t");
			System.out.print(rs.getInt(7) + "\t");
			System.out.println(rs.getString(8));
		}
		close(rs); // 밑에꺼부터 close
		close(ptmt);
	}

	@Override
	public void findByAddr(String addr, Connection con) throws SQLException {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from kitriemp ");
		sql.append("where addr like ? "); // 물음표 양옆에 아무것도 붙이지 않는다.
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		ptmt = con.prepareStatement(sql.toString());
		ptmt.setString(1, "%" + addr + "%"); // 물음표하나.
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
		close(rs); // 밑에꺼부터 close
		close(ptmt);
	}

}
