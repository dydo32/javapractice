package swingPro.dept.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import swingPro.dept.dto.DeptDTO;

public interface DeptDAO {
	int insert(String deptNo, String deptName, String loc, String telNum, String mgr, Connection con)
			throws SQLException;
	int insert(DeptDTO dept, Connection con) throws SQLException;
	DeptDTO findByDeptNo(String deptNo, Connection con) throws SQLException;
	Vector<DeptDTO> findByDeptName(String deptName, Connection con) throws SQLException;
	Vector<DeptDTO>	findByMgr(String mgr, Connection con) throws SQLException;
	Vector<String> getDeptName(Connection con) throws SQLException;
	Vector<Vector<String>> getMemberList(String deptName, Connection con) throws SQLException;
}
