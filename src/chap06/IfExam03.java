package chap06;
/*
	3.IfExam03.java작성하기
	  gender와 age를 랜덤수로 발생시켜 평가하기 
	  gender  1,3: 남자
			  2,4: 여자
	  age는 1부터 100까지 랜덤수
			age: 20이상 성인
			     20미만 청소년
	  ex) age=22, gender=4,2 : 성인여자(22,4)
		  age=11, gender=2,4 : 청소년여자
		  age=23, gender=1,3 : 성인남자
		  age=13, gender=1,3 : 청소년남자
	  완료 후 제출하기.
*/
import java.util.Random;

public class IfExam03{
	public static void main(String[] args) {
		Random rand = new Random();
		int age = rand.nextInt(100)+1;
		int gender = rand.nextInt(4)+1;
		
		MyMethodUtil myutil = new MyMethodUtil();
		myutil.getGenderData(age, gender);
	}
}
