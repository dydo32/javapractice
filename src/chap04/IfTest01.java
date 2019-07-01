package chap04;
import java.util.Random;
//if문
public class IfTest01 {
	public static void main(String[] args) {
		//모든 제어문은 반드시 {}를 표시하고 사용한다.
		//{}을 쓰지 않았을 경우 조건이 만족하면 바로 아래 한 문장만 실행된다.
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		//int test = 51;
		System.out.println(num);
		if(num>=90){
			System.out.println("만족");
			System.out.println("if블럭안일까??");
		}
		System.out.println("종료");
	}
}
