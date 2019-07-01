package chap06;

import java.util.Scanner;

public class PersonTest_Insa {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******인사관리시스템******");
		System.out.println("1. 사원등록");
		System.out.println("2. 사원조회");
		System.out.println("3. 사원삭제");
		System.out.println("4. 사원정보수정");
		System.out.println("5. 사원목록조회");
		System.out.print("원하는 작업을 선택하세요: ");
		int choiceJob = key.nextInt();

		switch (choiceJob) {
		case 1:
			System.out.println("======사원등록======");
			System.out.print("성명: ");
			String name = key.next();
			System.out.print("나이: ");
			int age = key.nextInt();
			System.out.print("주소: ");
			String addr = key.next();
			System.out.print("전화번호: ");
			String telNum = key.next();

			Person_Before p1 = new Person_Before();
			p1.name = name; //p1.으로 접근한 name변수는 Person이 갖고있는 멤버변수이고,
							// = 오른쪽에 정의한 name변수는 Scanner를 통해서 
							// 외부에서 입력받은 값을 저장해 놓은 지역변수
							//Scanner를 통해서 입력받은 값을 Person의 name 속성에 셋팅하겠다는 의미
			p1.age = age;
			p1.addr = addr;
			p1.telNum = telNum;
			System.out.println("성명: "+p1.name);
			System.out.println("나이: "+p1.age);
			System.out.println("주소: "+p1.addr);
			System.out.println("전화번호: "+p1.telNum);
			break;
		case 2:
			System.out.println("======사원조회======");
			break;
		case 3:
			System.out.println("======사원삭제======");
			break;
		}
	}
}
