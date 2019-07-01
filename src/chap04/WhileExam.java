package chap04;
// È¦¼öÇÕ, Â¦¼öÇÕ, ÃÑÇÕ
public class WhileExam {
	public static void main(String[] args) {
		int evenSum = 0;// Â¦¼öÇÕ
		int oddSum = 0; // È¦¼öÇÕ
		int sum = 0; // ÃÑÇÕ
		int i = 1;

		while(i<=100){
			if(i % 2 == 0){
				evenSum = evenSum + i;
			}else{
				oddSum = oddSum + i;
			}
			sum = sum + i;
			i++;
		}
		
		System.out.println("Â¦¼öÇÕ: " + evenSum);
		System.out.println("È¦¼öÇÕ: " + oddSum);
		System.out.println("ÀüÃ¼ÇÕ: " + sum);
	}
}
