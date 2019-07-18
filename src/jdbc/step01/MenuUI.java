package jdbc.step01;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	public void insertMenu(){
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
		
		//여기에서 KitriEmpDAO의 메소드를 호출하세요
		KitriEmpDAO dao = new KitriEmpDAO();
		dao.insert(id, pass, name, addr,deptno);
		
	}
	public void updateMenu(){
		System.out.println("*******사원수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 KitriEmpDAO의 메소드를 호출하세요
		KitriEmpDAO dao = new KitriEmpDAO();
		dao.update(id, addr);
		
	}
	public void deleteMenu(){
		System.out.println("*******사원삭제********");
		System.out.print("아이디:");
		String id = key.next();
		//여기에서 KitriEmpDAO의 메소드를 호출하세요
		KitriEmpDAO dao = new KitriEmpDAO();
		dao.delete(id);
	}
	public void findByAddrMenu(){
		System.out.println("*******사원검색********");
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 KitriEmpDAO의 메소드를 호출하세요
		KitriEmpDAO dao = new KitriEmpDAO();
		dao.findByAddr(addr);
	}
	
	public void selectMenu(){
		System.out.println("*******사원조회********");
		//여기에서 KitriEmpDAO의 메소드를 호출하세요 - 전체사원조회
		KitriEmpDAO dao = new KitriEmpDAO();
		dao.select();
	}
}


















