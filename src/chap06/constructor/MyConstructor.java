package chap06.constructor;

public class MyConstructor {
	private String name;
	private String id;
	private String pass;
	private String addr;
	private String telNum;
	private String ssn;
	private String nickname;
	private int point;

	// 매개변수 없는 생성자 - 기본생성자
	public MyConstructor() { // 생성자 습관적으로 만들어주자.

	}

	public MyConstructor(String name, String id, String pass) {
		this.name = name;
		this.id = id;
		this.pass = pass;
	}

	public MyConstructor(String name, String id, String addr, String telNum, String ssn) {
		this.name = name;
		this.id = id;
		this.addr = addr;
		this.telNum = telNum;
		this.ssn = ssn;
		this.point = 1000;
		System.out.println("String매개변수 5개 생성자");
	}
	public MyConstructor(String name, String id, String addr, String telNum, String ssn, String nickname) {
		this(name, id, addr, telNum, ssn); //this+Ctrl+space_bar ->자동생성
		this.nickname = nickname;
		System.out.println("String매개변수 6개 생성자");
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		// 객체의 정보를 출력
		System.out.println("name=" + name);
	}
}
