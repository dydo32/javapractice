package swingPro.dept.dto;
//DBMS���� ��ȸ�� ���̺��� �� ���ڵ带 �𵨸��� Ŭ����
//dtoŬ����, voŬ����, �ڹٺ���...
public class DeptDTO {
	//���ڵ带 �����ϴ� �÷��� DTOŬ������ ��������� ����
	private String deptNo;
	private String deptName;
	private String loc;
	private String telNum;
	private String mgr;
	
	public DeptDTO() {}
	
	public DeptDTO(String deptNo, String deptName, String loc, String telNum, String mgr) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.loc = loc;
		this.telNum = telNum;
		this.mgr = mgr;
	}
	

	@Override
	public String toString() {
		return "DeptDTO [deptNo=" + deptNo + ", deptName=" + deptName + ", loc=" + loc + ", telNum=" + telNum + ", mgr="
				+ mgr + "]";
	}

	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
}
