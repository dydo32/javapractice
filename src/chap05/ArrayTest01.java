package chap05;
//배열사용하기 - 1. 배열을 선언하고 생성하고 초기화하기
public class ArrayTest01 {
	public static void main(String[] args) {
		// 1. 3개의 int형 데이터를 저장할 수 있는 배열을 선언
		// 	=>3개의 int형 데이터를 저장할 수 있는 배열을 참조하는 참조변수를 선언
		int[] myarr;
		// 2. 3개의 int형 데이터를 저장하는 배열을 생성
		myarr = new int[3];
		System.out.println("배열을 참조하는 변수=>"+myarr);
		//myarr참조변수가 참조하는 배열의 0번요소의 값을 100으로 바꾸라는 의미
		myarr[0]=100; //set
		// myarr이라는 참조변수가 참조하는 배열의 0번 요소의 값을 가져와서 sysout으로 출력해라.
		System.out.println(myarr[0]); //get
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		// 5개의 double형 데이터를 저장할 수 있는 배열 선언과 생성 동시에
		double[] myarr2 = new double[5];
		System.out.println("배열을 참조하는 변수=>"+myarr2);
		System.out.println(myarr2[0]);
		System.out.println(myarr2[1]);
				
	}
}
