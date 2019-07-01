package chap04;

public class ForTest01 {
	public static void main(String[] args) {
		int count=1;
		for(int i=1; i<=5; i++){  //i는 for 블럭안에 있는 지역변수, 블럭이 끝나면 메모리에서 없어짐
			System.out.println("자바프로그래밍:"+count);
			count++;
		}
		System.out.println("******************************");
		
		for(int i=10; i<=14; i++){
			System.out.println("자바프로그래밍:"+i);
		}
		System.out.println("******************************");
		
		for(int i=5; i>=1; i--){
			System.out.println("자바프로그래밍:"+i);
		}
		System.out.println("******************************");
	}
}
