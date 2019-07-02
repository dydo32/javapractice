package chap07;
//메소드 앞에 static이 추가되는 경우
public class StaticDemo02 {
	int num;
	static int staticNum;
	
	public static void test(){ //클래스 메소드
		//1. static메소드에서 static메소드를 호출 - 일반적인 방법으로 접근 가능
		show();
		System.out.println("test: "+staticNum);
	}
	public void display(){
		//2. non-static메소드에서 static메소드를 호출
		show();
		System.out.println("dispaly: "+num);
	}
	public void change(){
		//3. non-static메소드에서 non-static메소드를 호출 - 일반적인 방법으로 접근 가능
		display();
		System.out.println("change");
	}
	public static void show() {
		//4. static메소드에서 non-static메소드를 호출 - 안됨
		//play();  //non-static의 경우 객체에 올려줘야하므로 
		System.out.println("show");
	}
	public void play(){}

}
