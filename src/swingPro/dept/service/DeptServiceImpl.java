package swingPro.dept.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import static swingPro.fw.DBUtil.*;
import swingPro.dept.dao.DeptDAO;
import swingPro.dept.dao.DeptDAOImpl;
import swingPro.dept.dto.DeptDTO;

public class DeptServiceImpl implements DeptService {
	//dao�� �޼ҵ� ȣ��
	@Override
	public int insert(String deptNo, String deptName, String loc, String telNum, String mgr) {
		int result = 0;
		System.out.println("*******DeptserviceImpl�� insert********");
		DeptDAO dao = new DeptDAOImpl();
		
		Connection con = null;
		
		try {
			con = getConnect();
			result = dao.insert(deptNo, deptName, loc, telNum, mgr, con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			close(con);
		}
		
		return result;
	}

	@Override
	public int insert(DeptDTO dept) {
		int result = 0;
		System.out.println("*******DeptserviceImpl�� insert********");
		DeptDAO dao = new DeptDAOImpl();
		
		Connection con = null;
		try{
			con = getConnect();
			result = dao.insert(dept,con);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			close(con);
		}
		
		return result;
	}
	
	/*@Override
	public String findByDeptNo(String deptNo) {
		String str = "";
		System.out.println("*******DeptserviceImpl�� findByDeptNo********");
		DeptDAO dao = new DeptDAOImpl();
		
		Connection con = null;
		try{
		con = getConnect();
		str = dao.findByDeptNo(deptNo, con);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			close(con);
		}
		return str;
	}*/
	
	@Override
	public DeptDTO findByDeptNo(String deptNo) {
		DeptDTO dept = null;
		Connection con = null;
		DeptDAO dao = new DeptDAOImpl();
		try{
			con = getConnect();
			dept = dao.findByDeptNo(deptNo, con);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			close(con);
		}
		return dept;
	}

	//dao�� ���ʹ� �ݵ�� �����ϸ鼭 �ʱ�ȭ�ؾ��ϰ� service�� ���ʹ� null�� �ʱ�ȭ
	//dao�� ���ʹ� �ٷ� ��ȸ�� ���ڵ带 add ȣ���ؼ� �߰��� ���̰�,
	//service�� ���ʹ� dao�� �޼ҵ� ȣ������ ������ ���̹Ƿ� �ٸ��� �ʱ�ȭ�Ѵ�.
	@Override
	public Vector<DeptDTO> findByDeptName(String deptName) {
		Vector<DeptDTO> deptlist = null;
		Connection con = null;
		DeptDAO dao = new DeptDAOImpl();
	
		try {
			con = getConnect();
			deptlist = dao.findByDeptName(deptName, con);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(con);
		}
		return deptlist;
	}

	@Override
	public Vector<DeptDTO> findByMgr(String mgr) {
		Vector<DeptDTO> deptlist = null;
		Connection con = null;
		DeptDAO dao = new DeptDAOImpl();
		
		try {
			con = getConnect();
			deptlist = dao.findByMgr(mgr, con);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(con);
		}
		
		return deptlist;
	}

	@Override
	public Vector<String> getDeptName() {
		Vector<String> deptNameList = null;
		Connection con = null;
		DeptDAO dao = new DeptDAOImpl();
		
		try {
			con = getConnect();
			deptNameList = dao.getDeptName(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(con);
		}
		
		return deptNameList;
	}

	@Override
	public Vector<Vector<String>> getMemberList(String deptName) {
		Vector<Vector<String>> emplist = null;
		Connection con = null;
		DeptDAO dao = new DeptDAOImpl();
		
		try {
			con = getConnect();
			emplist = dao.getMemberList(deptName, con);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(con);
		}
		return emplist;
	}

}
