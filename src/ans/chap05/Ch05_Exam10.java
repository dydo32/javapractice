package ans.chap05;

public class Ch05_Exam10 {

	public static void main(String[] args) {
		int Jumsu[] = { 90, 80, 50, 70, 65, 90, 100, 43, 55, 87 };
		int count[] = new int[10];
		for (int i = 0; i < 10; i++) {
			if (Jumsu[i] / 10 == 1) {
				count[i]=Jumsu[i] / 10;
			} else if (Jumsu[i] / 10 == 2) {
				count[i]++;
			} else if (Jumsu[i] / 10 == 3) {
				count[i]=Jumsu[i] / 10;
			} else if (Jumsu[i] / 10 == 4) {
				count[i]=Jumsu[i] / 10;
			} else if (Jumsu[i] / 10 == 5) {
				count[i]=Jumsu[i] / 10;
			} else if (Jumsu[i] / 10 == 6) {
				count[i]=Jumsu[i] / 10;
			} else if (Jumsu[i] / 10 == 7) {
				count[i]=Jumsu[i] / 10;
			} else if (Jumsu[i] / 10 == 8) {
				count[i]=Jumsu[i] / 10;
			} else if (Jumsu[i] / 10 == 9) {
				count[i]=Jumsu[i] / 10;
			} else if (Jumsu[i] / 10 == 10) {
				count[i]=Jumsu[i] / 10;				
			}		

		}
		for (int i = 0; i < 10; i++) {
			System.out.printf(" %4d ┴б  : ",Jumsu[i]  );
			for (int j = 0; j < count[i]; j++) {
				System.out.printf("бс");
			}
			System.out.printf("\n");
		}
	}
}
