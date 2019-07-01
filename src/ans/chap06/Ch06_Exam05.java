package ans.chap06;

public class Ch06_Exam05 {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setEmpno(7777);
		m1.setEname("홍길동");
		m1.setJob("관리자");
		m1.setHiredate("2012-1-1");

		m1.setSal(8000);
		
		System.out.println("회원의 기본정보 ");
		System.out.println(m1.toString());

		Member m2 = new Member();
		m2.setEmpno(8888);
		m2.setEname("정길동");
		m2.setJob("영업");
		m2.setHiredate("2012-1-3");
		
		m2.setSal(9000);
		System.out.println(m2.toString());

		System.out.println("\n홍길동의 입사일을 4월 5일로 변경후 출력");

		m1.setHiredate("2012-4-5");

		System.out.println(m1.toString());

		System.out.println("\n 정길동의 직업을 홍보로 변경후 출력");
		m2.setJob("홍보");
		
		System.out.println(m2.toString());

		System.out.println("\n 홍길동과 정길동의 월급을 합한 후 출력");

		int sum = m1.getSal() + m2.getSal();
		System.out.println("sum=" + sum);

	}

}
