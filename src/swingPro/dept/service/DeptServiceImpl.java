package swingPro.dept.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import static swingPro.fw.DBUtil.*;
import swingPro.dept.dao.DeptDAO;
import swingPro.dept.dao.DeptDAOImpl;
import swingPro.dept.dto.DeptDTO;

public class DeptServiceImpl implements DeptService {
	//dao의 메소드 호출
	@Override
	public int insert(String deptNo, String deptName, String loc, String telNum, String mgr) {
		int result = 0;
		System.out.println("*******DeptserviceImpl의 insert********");
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
		System.out.println("*******DeptserviceImpl의 insert********");
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
		System.out.println("*******DeptserviceImpl의 findByDeptNo********");
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

	//dao의 벡터는 반드시 생성하면서 초기화해야하고 service의 벡터는 null로 초기화
	//dao의 벡터는 바로 조회된 레코드를 add 호출해서 추가할 것이고,
	//service의 벡터는 dao의 메소드 호출결과로 생성될 것이므로 다르게 초기화한다.
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
