package chap04;
/*
 * 5.
 * Star.java
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Star1 {
	public static void main(String[] args) {

		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
