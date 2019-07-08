package chap10.api.lang;

//클래스를 정의할 때 멤버변수가 있는 경우 멤버변수를 private로 선언해서
//정보를 숨겨놓고 public 메소드를 통해 접근할 수 있도록 구현한다.
public class Person {
	private String name; // 멤버변수(=멤버필드), private으로 선언하면 다른 클래스에서 접근 불가.
	private int age; // 자바에서는 항상 private으로 감추어야 함,정보은닉
	private String addr; // 그리고 나서 메소드를 통해 접근하자.
	
	public Person(){
		System.out.println("기본생성자");
	}
	
	public Person(String name, int age, String addr){
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	//Person객체끼리 비교
	//this와 obj를 비교 - this도 Person이고 obj도  Person
	public boolean equals(Object obj){
		if(obj!=null & obj instanceof Person){
			Person p = (Person) obj;
			if(this.name.equals(p.getName()) & this.age==p.age
					& this.addr.equals(p.getAddr())){
				return true;	//일치한다.
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	public void setName(String name) { // 매개변수 이름을 DBMS에 정의 되는 이름과 같게 설정한다.
		this.name = name; // 멤버변수 =지역변수
	}
	public String getName() { // 매개변수없음
		return this.name; // 그냥 return name; 도 가능
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
