package chap06.constructor;
public class TestMoive {

	public static void main(String[] args) {
		Movie myMovie = new Movie("어거스트 러쉬","Drama");
		myMovie.play();

		System.out.println("--------------------");

		Movie yourMovie = new Movie("나는 전설이다","SF");
		yourMovie.play();
	}

}
