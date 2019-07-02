package chap07;

public class TestSchool {
	public static void main(String[] args) {
		
		Student s = new Student("홍길동",20,200201);
		Teacher t = new Teacher ("이순신",30,"JAVA");
		Staff  e = new Staff("유관순",40,"교무과");

		s.print();
		t.print();
		e.print();
	}
}
