package ans.chap06;

public class Member {

	private int empno;
	private String ename;
	private String job;
	private String hiredate;
	private int sal;
	public Member() {
	}

	public Member(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getJob() {
		return job;
	}


	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	public String toString() {
		String str = String.format("%5d %7s %7s  %7s %5d", empno, ename,
				job,  hiredate, sal);
		return str;

	}

}
