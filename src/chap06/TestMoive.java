package chap06;
/*문제1. 
 * 다음과 같은 설명을 읽고 Movie클래스를 작성하십시오. 
 * TestMovie 클래스를 참고하세요
 * 영화(Movie) 클래스는 영화명을 나타내는 title과 장르를 나타내는 genre 데이터 를 가지고 있다. 
 * 메소드로는 영화의 정보를 출력하는 play, 영화명을 지정하는 setTitle, 장르를 지 정하는 setGenre 를 가지고 있다.   
 * TestMovie 클래스를 이용하여 Movie 클래스 의 메소드를 호출시켰을 때 콘솔에 출력되는 결과는 다음과 같다. 
 * [TestMovie 실행결과] 
 * 		어거스트 러쉬(Drama) 상영중입니다. 
 * 		-------------------- 
 * 		나는 전설이다(SF) 상영중입니다. 
 */
public class TestMoive {

	public static void main(String[] args) {
		Movie myMovie = new Movie();
		myMovie.setTitle("어거스트 러쉬");
		myMovie.setGenre("Drama");
		myMovie.play();

		System.out.println("--------------------");

		Movie yourMovie = new Movie();
		yourMovie.setTitle("나는 전설이다");
		yourMovie.setGenre("SF");
		yourMovie.play();
	}

}
