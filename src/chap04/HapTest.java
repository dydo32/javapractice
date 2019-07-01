package chap04;
/*1.
   HapTest.java
   1부터 100까지 짝수합 홀수합 전체합 구해서 출력
      짝수합:____
      홀수합:____
      전체합:____
 */

public class HapTest {
	public static void main(String[] args) {
		int even = 0;	//짝수합
		int odd = 0;  	//홀수합
		int sum = 0; 	//총합
		
		for(int i=1;i<=100;i++){
			if(i%2==0){
				even = even+i;
			}
			else{
				odd = odd+i;
			}
			sum = sum+i;
		}
		System.out.println("짝수합: "+even);
		System.out.println("홀수합: "+odd);
		System.out.println("전체합: "+sum);
	}
}





