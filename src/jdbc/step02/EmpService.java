package jdbc.step02;
//DAO에서 호출할 메소드를 정의
//트랜잭션 처리, dao메소드 호출 전이나 호출 후에 처리해야 하는 로직을 정의
//service단은 화면으로부터 독립적이어야하며, 이벤트나 컴포넌트에 대한 내용을 기술하면 안된다.
//Connection을 만들어서 dao로 전달해주는 작업을 기술
public interface EmpService {
	int insert(String id, String pass, String name, String addr, String deptno);
	int update(String id, String addr);
	int delete(String id);
	void select();
	void findByAddr(String addr);
}
