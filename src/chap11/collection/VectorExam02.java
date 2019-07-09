package chap11.collection;

import java.util.Random;
import java.util.Vector;

public class VectorExam02 {

	public static void main(String[] args) {
		// 50까지 랜덤수를 6개 발생시켜서 Vector에 저장하고 저장된 숫자를 다음과 같은 출력형태로 출력하세요.
		// ex)랜덤수 5,7,9,10,22,33
		// [출력형태]
		// 5(홀수),7(홀수),9(홀수),10(짝수),22(짝수),33(홀수)

		Vector<Integer> v = new Vector<Integer>();
		Random rand = new Random();

		// 벡터에 데이터를 저장하는 for문
		for (int i = 0; i < 6; i++) {
			v.add(rand.nextInt(50)+1);
		}
		
		for(int i =0; i<v.size();i++){
			int data = v.get(i);
			if(data%2==0){
				System.out.print(data+"(짝수) ");
			}else{
				System.out.print(data+"(홀수) ");
			}
		}
	}

}
