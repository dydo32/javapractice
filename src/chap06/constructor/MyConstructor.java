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

	// �Ű����� ���� ������ - �⺻������
	public MyConstructor() { // ������ ���������� ���������.

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
		System.out.println("String�Ű����� 5�� ������");
	}
	public MyConstructor(String name, String id, String addr, String telNum, String ssn, String nickname) {
		this(name, id, addr, telNum, ssn); //this+Ctrl+space_bar ->�ڵ�����
		this.nickname = nickname;
		System.out.println("String�Ű����� 6�� ������");
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		// ��ü�� ������ ���
		System.out.println("name=" + name);
	}
}
