package chap10.api.lang;

//Ŭ������ ������ �� ��������� �ִ� ��� ��������� private�� �����ؼ�
//������ ���ܳ��� public �޼ҵ带 ���� ������ �� �ֵ��� �����Ѵ�.
public class Person {
	private String name; // �������(=����ʵ�), private���� �����ϸ� �ٸ� Ŭ�������� ���� �Ұ�.
	private int age; // �ڹٿ����� �׻� private���� ���߾�� ��,��������
	private String addr; // �׸��� ���� �޼ҵ带 ���� ��������.
	
	public Person(){
		System.out.println("�⺻������");
	}
	
	public Person(String name, int age, String addr){
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	//Person��ü���� ��
	//this�� obj�� �� - this�� Person�̰� obj��  Person
	public boolean equals(Object obj){
		if(obj!=null & obj instanceof Person){
			Person p = (Person) obj;
			if(this.name.equals(p.getName()) & this.age==p.age
					& this.addr.equals(p.getAddr())){
				return true;	//��ġ�Ѵ�.
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	public void setName(String name) { // �Ű����� �̸��� DBMS�� ���� �Ǵ� �̸��� ���� �����Ѵ�.
		this.name = name; // ������� =��������
	}
	public String getName() { // �Ű���������
		return this.name; // �׳� return name; �� ����
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return this.addr;
	}
}
