package swingPro.fw;

//sql은 추후에 XML파일로 관리될 것임.
public class DeptQuery {
	public static final String DEPT_INSERT 
					= "insert into kitridept values(?,?,?,?,?)";
	public static final String SELECT_DEPTNO 
					= "select * from kitridept where deptno = ?";
	public static final String SELECT_DEPTNAME 
					= "select * from kitridept where deptname like ?";
	public static final String SELECT_MGR 
					= "select * from kitridept where mgr = ?";
	public static final String SELECT_DEPTNAME_LIST 
					= "select distinct deptname from kitridept";
	public static final String MEMBER_LIST 
					= "select e.id,e.pass,e.name,e.addr,e.hiredate, "
							+ "e.grade, e.point, e.deptno, d.deptname " 
							+ "from kitriemp e, kitridept d "
							+ "where e.deptno = d.deptno and d.deptname = ? ";

}
