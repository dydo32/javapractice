package chap03;
//3.OprTest01 증가,증감연산자
public class OprTest01 {
	public static void main(String[] args) {
		int x=0;
		int y=0;

		x=5;
		y=x++;
		System.out.println("y=x++: x="+x+",y="+y);
		x=5;
		y=++x;
		System.out.println("y=++x: x="+x+",y="+y);
		x=5;
		y=x--;
		System.out.println("y=x--: x="+x+",y="+y);
		x=5;
		y=--x;
		System.out.println("y=--x: x="+x+",y="+y);
	}
}
