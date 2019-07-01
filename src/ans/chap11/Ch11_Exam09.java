package ans.chap11;

import java.util.HashMap;

public class Ch11_Exam09 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		double sum=0.0;
		
		for(int i=0; i<10; i++){
			map.put(i+1, (int)(Math.random()*100+1));
		}
		for(int i=0; i<10; i++){
			System.out.print(map.get(i+1)+" ");
		}
		for(int i=0; i<10; i++){
			sum+=map.get(i+1);
		}
		System.out.printf("\nÇÕ°è:%.2f\n",sum);
		System.out.printf("Æò±Õ:%.2f",(sum/10));

	}

}
