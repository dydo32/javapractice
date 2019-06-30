package chap03;
//논리연산자
public class OprTest04{
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		//&&연산자(and)=================================
		//true && true
		System.out.println((num1<num2)&&(num1>=100));
		//true && false
		System.out.println((num1<num2)&&(num1>100));
		//false && ture
		System.out.println((num1>num2)&&(num1>=100));
		//false && false
		System.out.println((num1>num2)&&(num1>100));
		//===========================================

		System.out.println("===========================");

		//||연산자(or)=================================
		//true || true
		System.out.println((num1<num2)||(num1>=100));
		//true || false
		System.out.println((num1<num2)||(num1>100));
		//false || ture
		System.out.println((num1>num2)||(num1>=100));
		//false || false
		System.out.println((num1>num2)||(num1>100));
		//===========================================
	}
}
