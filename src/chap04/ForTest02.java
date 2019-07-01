package chap04;

public class ForTest02 {
	public static void main(String[] args) {
		for (int row = 1; row <= 3; row++) {
			for (int i = 0; i < 4; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================");

		for (int row = 1; row <= 5; row++) {
			for (int i = 1; i <= 5; i++) {
				if (row == 3 & i == 3) {
					System.out.print("³Ê");
				} else {
					System.out.print("2");
				}
			}
			System.out.println();
		}
		System.out.println("======================");

		for (int row = 1; row <= 5; row++) {
			for (int i = 1; i <= 5; i++) {
				if (row == i) {
					System.out.print("³Ê");
				} else {
					System.out.print("2");
				}
			}
			System.out.println();
		}
	}
}
