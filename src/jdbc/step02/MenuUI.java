package jdbc.step02;

import java.util.Scanner;

import jdbc.step02.EmpService;
import jdbc.step02.EmpServiceImpl;

public class MenuUI {
	Scanner key = new Scanner(System.in);

	public void insertMenu() {
		System.out.println("*******사원등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("부서번호:");
		String deptno = key.next();
		System.out.print("성명:");
		String name = key.next();

		// 여기에서 EmpServiceImpl의 메소드를 호출하세요
		EmpService service = new EmpServiceImpl();
		int result = service.insert(id, pass, name, addr, deptno);
		System.out.println(result);
		if (result <= 0) {
			System.out.println("실패 - gui나 web에서는 대화상자 출력 or 화면 전환");
		} else {
			System.out.println("성공 - gui나 web에서는 성공시에 메시지창을 출력 or 화면전환");
		}
	}

	public void updateMenu() {
		System.out.println("*******사원수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		// 여기에서 EmpServiceImpl의 메소드를 호출하세요
		EmpService service = new EmpServiceImpl();
		int result = service.update(id, addr);
		if (result <= 0) {
			System.out.println("실패 - gui나 web에서는 대화상자 출력 or 화면 전환");
		} else {
			System.out.println("성공 - gui나 web에서는 성공시에 메시지창을 출력 or 화면전환");
		}

	}

	public void deleteMenu() {
		System.out.println("*******사원삭제********");
		System.out.print("아이디:");
		String id = key.next();
		// 여기에서 EmpServiceImpl의 메소드를 호출하세요
		EmpService service = new EmpServiceImpl();
		int result = service.delete(id);
		if (result <= 0) {
			System.out.println("실패 - gui나 web에서는 대화상자 출력 or 화면 전환");
		} else {
			System.out.println("성공 - gui나 web에서는 성공시에 메시지창을 출력 or 화면전환");
		}
	}

	public void findByAddrMenu() {
		System.out.println("*******사원검색********");
		System.out.print("주소:");
		String addr = key.next();
		
		// 여기에서 EmpServiceImpl의 메소드를 호출하세요
		EmpService service = new EmpServiceImpl();
		service.findByAddr(addr);
	}

	public void selectMenu() {
		System.out.println("*******사원조회********");
		
		// 여기에서 EmpServiceImpl의 메소드를 호출하세요
		EmpService service = new EmpServiceImpl();
		service.select();
	}
}
