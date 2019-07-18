package jdbc.step01;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	public void insertMenu(){
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		System.out.print("����:");
		String name = key.next();
		
		//���⿡�� KitriEmpDAO�� �޼ҵ带 ȣ���ϼ���
		KitriEmpDAO dao = new KitriEmpDAO();
		dao.insert(id, pass, name, addr,deptno);
		
	}
	public void updateMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� KitriEmpDAO�� �޼ҵ带 ȣ���ϼ���
		KitriEmpDAO dao = new KitriEmpDAO();
		dao.update(id, addr);
		
	}
	public void deleteMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		//���⿡�� KitriEmpDAO�� �޼ҵ带 ȣ���ϼ���
		KitriEmpDAO dao = new KitriEmpDAO();
		dao.delete(id);
	}
	public void findByAddrMenu(){
		System.out.println("*******����˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� KitriEmpDAO�� �޼ҵ带 ȣ���ϼ���
		KitriEmpDAO dao = new KitriEmpDAO();
		dao.findByAddr(addr);
	}
	
	public void selectMenu(){
		System.out.println("*******�����ȸ********");
		//���⿡�� KitriEmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		KitriEmpDAO dao = new KitriEmpDAO();
		dao.select();
	}
}


















