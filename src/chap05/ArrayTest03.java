package chap05;
//배열을 편리하게 액세스하기.
public class ArrayTest03 {
	public static void main(String[] args){
		String[] myarr = new String[5];
		myarr[0] = new String("java");
		//배열 요소의 갯수를 출력.. 배열의 길이=>배열변수.length
		//==>배열의 마지막 index는 배열의 길이-1 
		System.out.println("배열의 요소의 갯수 =>"+myarr.length);
		
		for(int i=0; i<myarr.length; i++){
			System.out.println(myarr[i]);
		}
	}
}
