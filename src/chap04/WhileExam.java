package chap04;
// Ȧ����, ¦����, ����
public class WhileExam {
	public static void main(String[] args) {
		int evenSum = 0;// ¦����
		int oddSum = 0; // Ȧ����
		int sum = 0; // ����
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
		
		System.out.println("¦����: " + evenSum);
		System.out.println("Ȧ����: " + oddSum);
		System.out.println("��ü��: " + sum);
	}
}
