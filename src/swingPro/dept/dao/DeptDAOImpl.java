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
		PreparedStatement ptmt = con.prepareStatement(DEPT_INSERT); // �̷���....

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
		DeptDTO dept = null; // ���ڵ带 ǥ���ϴ� ��ü�� �ʱ�� null�� �־����, ��� ��ü�� new�����
		PreparedStatement ptmt = con.prepareStatement(SELECT_DEPTNO);
		ptmt.setString(1, deptNo); // Query�� ����ǥ ���� ä���
		ResultSet rs = ptmt.executeQuery(); // ����

		if (rs.next()) {
			// if���� ������ ����Ǹ� ��ȸ�ȴ�.
			dept = new DeptDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			// rs.getString �÷� �������� ��.
			// �̰� �׻� �ϴٺ��� ���߿� framework���� �Ǿ��־� �ڵ����� ��. ������ ���� �ؾ���.
		}
		close(rs);
		close(ptmt);
		return dept;
	}

	// �̸��˻� - �μ������� �˻��ϴ� ���� ����ڰ� ��� �Է��ϳĿ� ����
	// �������� ���ڵ尡 ��ȸ�� �� �ֱ� ������ ��ȸ�� ���ڵ带 DeptDTO�� ��ȯ�ؼ� Vector�� �����Ͽ� ����
	@Override
	public Vector<DeptDTO> findByDeptName(String deptName, Connection con) throws SQLException {
		// ���ڵ带 ���� ���͸� ����
		Vector<DeptDTO> deptlist = new Vector<DeptDTO>();
		// ���ڵ带 ������ DTO����
		DeptDTO deptInfo = null;
		PreparedStatement ptmt = con.prepareStatement(SELECT_DEPTNAME);
		ptmt.setString(1, "%" + deptName + "%");
		ResultSet rs = ptmt.executeQuery();

		while (rs.next()) {

			// ���ڵ� �ϳ��� DeptDTO ��ü�� ��ȯ
			deptInfo = new DeptDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			// ��ȯ�� DTO��ü�� ���Ϳ� ����
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
			// System.out.println(rs.getString(1));//Ȯ��
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
		// dao���� �����ϴ� Vector�� �̸� �����ؾ� ������ ���� emp�� �����ϴ� Vector��
		// ���ڵ带 ������ Vector�̹Ƿ� �׼����ϸ鼭 �����Ѵ�.
		// �׷��� �� ���ڵ�� �ϳ��� ���Ͱ� �����ȴ�.
		Vector<String> emp = null;
		PreparedStatement ptmt = con.prepareStatement(MEMBER_LIST);
		ptmt.setString(1, deptName);
		ResultSet rs = ptmt.executeQuery();

		while (rs.next()) {
			// ���ڵ� �ϳ��� Vector�� ��ȯ
			// ���ڵ带 ���� ���͸� ���� - Vector�� �ϳ��� Ÿ�Ը� �䱸�ϹǷ� ��ü�÷��� String����
			// ��ȯ�ؼ� Vector�� ��´�.
			emp = new Vector<String>();
			emp.add(rs.getString(1));
			emp.add(rs.getString(2));
			emp.add(rs.getString(3));
			emp.add(rs.getString(4));
			emp.add(rs.getString(5));
			emp.add(rs.getString(6));
			emp.add(rs.getString(7));
			emp.add(rs.getString(8)); // ���ڵ带 Vector�� ��ȯ�ϴ� �۾� ����
			// �ۼ��� ���ڵ带 Vector�� ����
			emplist.add(emp);
		}
		System.out.println("dao:" + emplist.size());
		close(rs);
		close(ptmt);

		return emplist;
	}

}
