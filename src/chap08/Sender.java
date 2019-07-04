package chap08;

public abstract class Sender {
	String name;

	Sender(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// public void send(){ } -> �̷��� �ᵵ ������ �ڹ��� Ư���� ��� ��������.
	// ����Ÿ�Կ� �����ؾ� ���ٰ���, �׸��� ���� Ŭ������ �� �޼ҵ带 �������̵� �ؾ���.
	public abstract void send();
}
