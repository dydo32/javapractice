package chap06;

public class Duck {
	private String name;
	private String legs;
	private int length;
	
	public void fly(){
		System.out.println("����("+name+")�� ���� �ʽ��ϴ�.");
	}
	public void sing(){
		System.out.println("����("+name+")�� �Ҹ����� ��ϴ�.");
	}
	public void setName(String name){
		this.name=name;
	}
	public String toString(){
		return "������ �̸��� "+name+" �Դϴ�.";
	}
}
