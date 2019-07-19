package swingPro.dept.service;

import java.util.Vector;

import swingPro.dept.dto.DeptDTO;

public interface DeptService {
	int insert(String deptNo, String deptName, String loc, String telNum, String mgr);
	int insert(DeptDTO dept); 
	DeptDTO findByDeptNo(String deptNo);
	Vector<DeptDTO> findByDeptName(String deptName);
	Vector<DeptDTO>	findByMgr(String mgr);
	Vector<String> getDeptName();
	Vector<Vector<String>> getMemberList(String deptName);
}
