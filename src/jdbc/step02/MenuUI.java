package jdbc.step02;

import java.util.Scanner;

import jdbc.step02.EmpService;
import jdbc.step02.EmpServiceImpl;

public class MenuUI {
	Scanner key = new Scanner(System.in);

	public void insertMenu() {
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

		// ���⿡�� EmpServiceImpl�� �޼ҵ带 ȣ���ϼ���
		EmpService service = new EmpServiceImpl();
		int result = service.insert(id, pass, name, addr, deptno);
		System.out.println(result);
		if (result <= 0) {
			System.out.println("���� - gui�� web������ ��ȭ���� ��� or ȭ�� ��ȯ");
		} else {
			System.out.println("���� - gui�� web������ �����ÿ� �޽���â�� ��� or ȭ����ȯ");
		}
	}

	public void updateMenu() {
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		// ���⿡�� EmpServiceImpl�� �޼ҵ带 ȣ���ϼ���
		EmpService service = new EmpServiceImpl();
		int result = service.update(id, addr);
		if (result <= 0) {
			System.out.println("���� - gui�� web������ ��ȭ���� ��� or ȭ�� ��ȯ");
		} else {
			System.out.println("���� - gui�� web������ �����ÿ� �޽���â�� ��� or ȭ����ȯ");
		}

	}

	public void deleteMenu() {
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		// ���⿡�� EmpServiceImpl�� �޼ҵ带 ȣ���ϼ���
		EmpService service = new EmpServiceImpl();
		int result = service.delete(id);
		if (result <= 0) {
			System.out.println("���� - gui�� web������ ��ȭ���� ��� or ȭ�� ��ȯ");
		} else {
			System.out.println("���� - gui�� web������ �����ÿ� �޽���â�� ��� or ȭ����ȯ");
		}
	}

	public void findByAddrMenu() {
		System.out.println("*******����˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		
		// ���⿡�� EmpServiceImpl�� �޼ҵ带 ȣ���ϼ���
		EmpService service = new EmpServiceImpl();
		service.findByAddr(addr);
	}

	public void selectMenu() {
		System.out.println("*******�����ȸ********");
		
		// ���⿡�� EmpServiceImpl�� �޼ҵ带 ȣ���ϼ���
		EmpService service = new EmpServiceImpl();
		service.select();
	}
}
