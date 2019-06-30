package chap01;

import java.util.Random;

/*Random클래스의 nextInt()메소드를 이용해서 랜덤수를
다음과 같이 출력하세요(참조변수는 rand)
[출력형태]
랜덤수=>____
*/
public class APIExam {
	public static void main(String[] args) {
		Random rand = new Random();
		int val = rand.nextInt();
		System.out.println("랜덤수=>"+val);

		//범위지정
		int val2 = rand.nextInt(100)+1; //0~지정한숫자사이에서 랜덤인데 0 포함, 
										//지정한숫자는 포함하지않음
										//1부터나오게 해주기 위해서 +1
		System.out.println("1~100사이의 랜덤수=>"+val2);
	}
}
