package chap04;
//if else if로 표현했던 코드를 switch로 변경
import java.util.Random;

public class SwitchTest03{
	public static void main(String[] args) {
		//switch의 평가 변수는 int로 casting 될 수 있는 값이 저장된 변수
		double d = 10.5; //switch문에서는 double타입이 사용 불가능
		/*switch(d){
			case 10.0:
				System.out.println("A");
		}*/

		int data = 5;
		switch(data+60){
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
			    break;
		}
		String code = new String("A01");
		switch(code){
			case "A01":
				System.out.println("A01");
				break;
		    case "B01":
				System.out.println("B01");
				break;
		}
	}
}
