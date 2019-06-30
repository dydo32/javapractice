package chap03;
//비트연산자, 삼항연산자
public class OprTest05{
	public static void main(String[] args) {
		//비트연산자
		System.out.println(2&3);
		System.out.println(2|3);
		System.out.println(2^3);

		System.out.println(5>>>1);
		System.out.println(5>>1);
		System.out.println(5<<1);

		//삼항연산자
		int num = 90;
		System.out.println((num>90)?"합격":"불합격");
	}
}
