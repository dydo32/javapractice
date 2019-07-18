package jdbc.step02;

import java.sql.Connection;
import java.sql.SQLException;

//Service�� ���� ȣ��� �޼ҵ带 ����, ���� db�� �����ϴ� �޼ҵ�
//�����׽�Ʈ �۾��� ���� - Ʈ�����ó���� ���ؼ� ���񽺴ܿ��� Connection�� ���� �޵��� ����
public interface EmpDAO {
	//ó������� ����
	int insert(String id, String pass, String name, String addr, String deptno, Connection con) throws SQLException;
	int update(String id, String addr,Connection con) throws SQLException;
	int delete(String id,Connection con) throws SQLException;
	void select(Connection con) throws SQLException;
	void findByAddr(String addr,Connection con) throws SQLException;
}
