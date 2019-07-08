package chap10.api.lang;

public class MathTest {
	public static void main(String[] args){
		System.out.println("Math.PI=>"+Math.PI);
		System.out.println("Math.abs(-1)=>"+Math.abs(-1));		//절댓값
		System.out.println("Math.ceil(10.4)=>"+Math.ceil(10.4));	//올림
		System.out.println("Math.round(10.5)=>"+Math.round(10.5));	//반올림
		System.out.println("Math.floor(10.6)=>"+Math.floor(10.6));	//내림
		System.out.println("Math.max(100,10)=>"+Math.max(100,10)); 	//큰값
		System.out.println("Math.min(100,10)=>"+Math.min(100,10));	//작은값
		System.out.println("Math.random()=>"+Math.random());	//0~1사이의 랜덤값
	}
}
