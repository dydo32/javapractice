package jdbc.step02;

import java.sql.Connection;
import java.sql.SQLException;

//Service에 의해 호출될 메소드를 정의, 실제 db와 연동하는 메소드
//단일테스트 작업을 정의 - 트랜잭션처리를 위해서 서비스단에서 Connection을 전달 받도록 구현
public interface EmpDAO {
	//처리결과를 리턴
	int insert(String id, String pass, String name, String addr, String deptno, Connection con) throws SQLException;
	int update(String id, String addr,Connection con) throws SQLException;
	int delete(String id,Connection con) throws SQLException;
	void select(Connection con) throws SQLException;
	void findByAddr(String addr,Connection con) throws SQLException;
}
