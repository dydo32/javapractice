package chap06.constructor;
public class TestMoive {

	public static void main(String[] args) {
		Movie myMovie = new Movie("��Ž�Ʈ ����","Drama");
		myMovie.play();

		System.out.println("--------------------");

		Movie yourMovie = new Movie("���� �����̴�","SF");
		yourMovie.play();
	}

}
