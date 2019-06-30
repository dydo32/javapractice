package chap01;
/*문자열을 처리하기 위한 기능을 사용하기위해
//String클래스를 JVM이 인식하는 작업공간에 할당
//-----------------------------------
//				|_ heap에 할당한다는 의미
//[형식]
//	new heap에할당하고싶은클래스명()
//	or new heap에할당하고싶은클래스명(값1,값2,...)
*/
public class APITest {
	public static void main(String[] args) {
		String str = new String();
		//"java"문자열을 처리하기 위해 String클래스를 heap에 할당
		String str2 = new String("java");
		//str2가 참조하는 heap의 String객체를 찾아서 charAt을 호출
		//호출하면서 charAt이 int형 매개변수를 필요로 하기 때문에 int값을 전달
		char resultVal = str2.charAt(2);
		System.out.println("result=>"+resultVal);

	}
}
