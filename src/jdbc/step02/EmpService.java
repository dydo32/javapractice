package jdbc.step02;
//DAO���� ȣ���� �޼ҵ带 ����
//Ʈ����� ó��, dao�޼ҵ� ȣ�� ���̳� ȣ�� �Ŀ� ó���ؾ� �ϴ� ������ ����
//service���� ȭ�����κ��� �������̾���ϸ�, �̺�Ʈ�� ������Ʈ�� ���� ������ ����ϸ� �ȵȴ�.
//Connection�� ���� dao�� �������ִ� �۾��� ���
public interface EmpService {
	int insert(String id, String pass, String name, String addr, String deptno);
	int update(String id, String addr);
	int delete(String id);
	void select();
	void findByAddr(String addr);
}
