package chap06;
//클래스를 정의할 때 멤버변수가 있는 경우 멤버변수를 private로 선언해서
//정보를 숨겨놓고 public 메소드를 통해 접근할 수 있도록 구현한다.
public class Person {
	private String name;	//멤버변수(=멤버필드), private으로 선언하면 다른 클래스에서 접근 불가.
	private int age;		//자바에서는 항상 private으로 감추어야 함,정보은닉
	private String addr; 	//그리고 나서 메소드를 통해 접근하자.
	
	//name변수에 대한 public 메소드 구현
	//name변수에 값을 셋팅하는 메소드 - setter메소드
	//setter나 getter메소드를 작성하는 방법
	//set(get) + 멤버변수명(멤버변수의 첫 글자를 대문자로 변경)
	//=> ex) name 변수
	//		 setName, getName
	//=> 기본 자바에서는 setter/getter메소드의 이름을 명명할 때 약속을 지키지 않아도 문제 될 것이
	//   없으나 스프링이나 웹에서 이 명명규칙을 지키지 않으면 오류가 발생할 수 있다.
	public void setName(String name){ //매개변수 이름을 DBMS에 정의 되는 이름과 같게 설정한다.
		this.name = name;	//멤버변수 =지역변수
	}
	public String getName(){ //매개변수없음
		return this.name;  //그냥 return name; 도 가능
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	public void setAddr(String addr){
		this.addr = addr;
	}
	public String getAddr(){
		return this.addr;
	}
}
