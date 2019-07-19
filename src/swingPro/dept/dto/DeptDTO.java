package swingPro.dept.dto;
//DBMS에서 조회한 테이블의 한 레코드를 모델링한 클래스
//dto클래스, vo클래스, 자바빈즈...
public class DeptDTO {
	//레코드를 구성하는 컬럼을 DTO클래스의 멤버변수로 정의
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
