package jdbc.step02;

import static fw.DBUtil.close;
import static fw.DBUtil.getConnect;

import java.sql.Connection;
import java.sql.SQLException;

public class EmpServiceImpl implements EmpService {

	@Override
	public int insert(String id, String pass, String name, String addr, String deptno) {
		int result = 0;
		System.out.println("*******serviceImpl�� insert********");
		EmpDAO dao = new EmpDAOImpl();
		// Ʈ����� ������ �ϱ� ���ؼ� Connection�� ���񽺴ܿ��� ���� DAO�� �ѱ��.
		Connection con = null;
		try {
			con = getConnect();
			result = dao.insert(id, pass, name, addr, deptno, con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con);
		}
		return result;
	}

	@Override
	public int update(String id, String addr) {
		int result = 0;
		System.out.println("*******serviceImpl�� insert********");
		EmpDAO dao = new EmpDAOImpl();
		// Ʈ����� ������ �ϱ� ���ؼ� Connection�� ���񽺴ܿ��� ���� DAO�� �ѱ��.
		Connection con = null;
		try {
			con = getConnect();
			result = dao.update(id, addr, con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con);
		}

		return result;
	}

	@Override
	public int delete(String id) {
		int result = 0;
		System.out.println("*******serviceImpl�� insert********");
		EmpDAO dao = new EmpDAOImpl();
		//Ʈ����� ������ �ϱ� ���ؼ� Connection�� ���񽺴ܿ��� ���� DAO�� �ѱ��.
		Connection con = null;
		try{
		con = getConnect();
		result = dao.delete(id, con);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			close(con);
		}
		
		return result;
	}

	@Override
	public void select() {
		System.out.println("*******serviceImpl�� insert********");
		EmpDAO dao = new EmpDAOImpl();
		//Ʈ����� ������ �ϱ� ���ؼ� Connection�� ���񽺴ܿ��� ���� DAO�� �ѱ��.
		Connection con = null;
		try{
		con = getConnect();
		dao.select(con);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			close(con);
		}
	}

	@Override
	public void findByAddr(String addr) {
		System.out.println("*******serviceImpl�� insert********");
		EmpDAO dao = new EmpDAOImpl();
		//Ʈ����� ������ �ϱ� ���ؼ� Connection�� ���񽺴ܿ��� ���� DAO�� �ѱ��.
		Connection con = null;
		try{
		con = getConnect();
		dao.findByAddr(addr, con);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			close(con);
		}
	}

}
