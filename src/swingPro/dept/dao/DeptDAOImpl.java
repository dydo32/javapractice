package swingPro.dept.dao;

import static swingPro.fw.DBUtil.close;
import static swingPro.fw.DeptQuery.*;
import static swingPro.fw.DeptQuery.SELECT_DEPTNO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import swingPro.dept.dto.DeptDTO;

public class DeptDAOImpl implements DeptDAO {

	@Override
	public int insert(String deptNo, String deptName, String loc, String telNum, String mgr, Connection con)
			throws SQLException {
		int result = 0;
		PreparedStatement ptmt = con.prepareStatement(DEPT_INSERT);

		ptmt.setString(1, deptNo);
		ptmt.setString(2, deptName);
		ptmt.setString(3, loc);
		ptmt.setString(4, telNum);
		ptmt.setString(5, mgr);

		result = ptmt.executeUpdate();
		close(ptmt);

		return result;
	}

	@Override
	public int insert(DeptDTO dept, Connection con) throws SQLException {
		int result = 0;
		PreparedStatement ptmt = con.prepareStatement(DEPT_INSERT); // 이렇게....

		ptmt.setString(1, dept.getDeptNo());
		ptmt.setString(2, dept.getDeptName());
		ptmt.setString(3, dept.getLoc());
		ptmt.setString(4, dept.getTelNum());
		ptmt.setString(5, dept.getMgr());

		result = ptmt.executeUpdate();
		close(ptmt);

		return result;
	}

	
	/*
	 * @Override 
	 * public String findByDeptNo(String deptNo, Connection con) throws SQLException { 
	 * 		ResultSet rs = null; 
	 * 		String str = ""; 
	 * 		String[] strArr = new String[5]; 
	 * 		PreparedStatement ptmt = con.prepareStatement(SELECT_DEPTNO);
	 * 		
	 * 		ptmt.setString(1,deptNo);
	 * 
	 * 		rs = ptmt.executeQuery(); 
	 * 		while (rs.next()) { 
	 * 			strArr[0] = rs.getString(1); 
	 * 			strArr[1] = rs.getString(2); 
	 * 			strArr[2] = rs.getString(3); 
	 * 			strArr[3] = rs.getString(4); 
	 * 			strArr[4] = rs.getString(5); 
	 * 		} 
	 * 		for(int i=0;i<strArr.length;i++){ 
	 * 			str = str + strArr[i] +" "; 
	 * 		} 
	 * 		close(rs); 
	 * 		close(ptmt);
	 * 
	 * 		return str; 
	 * 	}
	 */
	@Override
	public DeptDTO findByDeptNo(String deptNo, Connection con) throws SQLException {
		DeptDTO dept = null; // 레코드를 표현하는 객체는 초기는 null로 주어야함, 담는 객체는 new써야함
		PreparedStatement ptmt = con.prepareStatement(SELECT_DEPTNO);
		ptmt.setString(1, deptNo); // Query에 물음표 부터 채우고
		ResultSet rs = ptmt.executeQuery(); // 실행

		if (rs.next()) {
			// if안의 문장이 실행되면 조회된다.
			dept = new DeptDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			// rs.getString 컬럼 개개인의 값.
			// 이것 항상 하다보니 나중에 framework으로 되어있어 자동으로 됨. 지금은 내가 해야함.
		}
		close(rs);
		close(ptmt);
		return dept;
	}

	// 이름검색 - 부서명으로 검색하는 것은 사용자가 어떻게 입력하냐에 따라서
	// 여러개의 레코드가 조회될 수 있기 때문에 조회된 레코드를 DeptDTO로 변환해서 Vector에 저장하여 리턴
	@Override
	public Vector<DeptDTO> findByDeptName(String deptName, Connection con) throws SQLException {
		// 레코드를 담을 벡터를 생성
		Vector<DeptDTO> deptlist = new Vector<DeptDTO>();
		// 레코드를 저장할 DTO생성
		DeptDTO deptInfo = null;
		PreparedStatement ptmt = con.prepareStatement(SELECT_DEPTNAME);
		ptmt.setString(1, "%" + deptName + "%");
		ResultSet rs = ptmt.executeQuery();

		while (rs.next()) {

			// 레코드 하나를 DeptDTO 객체로 변환
			deptInfo = new DeptDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			// 변환된 DTO객체를 벡터에 저장
			deptlist.add(deptInfo);
		}
		System.out.println("dao: " + deptlist.size());
		close(rs);
		close(ptmt);
		return deptlist;
	}

	@Override
	public Vector<DeptDTO> findByMgr(String mgr, Connection con) throws SQLException {
		Vector<DeptDTO> deptlist = new Vector<DeptDTO>();
		DeptDTO deptInfo = null;
		PreparedStatement ptmt = con.prepareStatement(SELECT_MGR);
		ptmt.setString(1, mgr);
		ResultSet rs = ptmt.executeQuery();

		while (rs.next()) {
			deptInfo = new DeptDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			deptlist.add(deptInfo);
		}
		close(rs);
		close(ptmt);
		return deptlist;
	}

	@Override
	public Vector<String> getDeptName(Connection con) throws SQLException {
		Vector<String> deptNameList = new Vector<String>();
		PreparedStatement ptmt = con.prepareStatement(SELECT_DEPTNAME_LIST);
		ResultSet rs = ptmt.executeQuery();

		while (rs.next()) {
			// System.out.println(rs.getString(1));//확인
			deptNameList.add(rs.getString(1));
		}
		System.out.println("dao:" + deptNameList.size());
		close(rs);
		close(ptmt);
		return deptNameList;
	}

	@Override
	public Vector<Vector<String>> getMemberList(String deptName, Connection con) throws SQLException {
		Vector<Vector<String>> emplist = new Vector<Vector<String>>();
		// dao에서 선언하는 Vector는 미리 생성해야 하지만 지금 emp로 참조하는 Vector는
		// 레코드를 저장할 Vector이므로 액세스하면서 생성한다.
		// 그래야 한 레코드당 하나의 벡터가 생성된다.
		Vector<String> emp = null;
		PreparedStatement ptmt = con.prepareStatement(MEMBER_LIST);
		ptmt.setString(1, deptName);
		ResultSet rs = ptmt.executeQuery();

		while (rs.next()) {
			// 레코드 하나를 Vector로 변환
			// 레코드를 담을 벡터를 생성 - Vector는 하나의 타입만 요구하므로 전체컬럼은 String으로
			// 변환해서 Vector에 담는다.
			emp = new Vector<String>();
			emp.add(rs.getString(1));
			emp.add(rs.getString(2));
			emp.add(rs.getString(3));
			emp.add(rs.getString(4));
			emp.add(rs.getString(5));
			emp.add(rs.getString(6));
			emp.add(rs.getString(7));
			emp.add(rs.getString(8)); // 레코드를 Vector로 변환하는 작업 종료
			// 작성한 레코드를 Vector에 저장
			emplist.add(emp);
		}
		System.out.println("dao:" + emplist.size());
		close(rs);
		close(ptmt);

		return emplist;
	}

}
