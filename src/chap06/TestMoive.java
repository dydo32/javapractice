package chap06;
/*����1. 
 * ������ ���� ������ �а� MovieŬ������ �ۼ��Ͻʽÿ�. 
 * TestMovie Ŭ������ �����ϼ���
 * ��ȭ(Movie) Ŭ������ ��ȭ���� ��Ÿ���� title�� �帣�� ��Ÿ���� genre ������ �� ������ �ִ�. 
 * �޼ҵ�δ� ��ȭ�� ������ ����ϴ� play, ��ȭ���� �����ϴ� setTitle, �帣�� �� ���ϴ� setGenre �� ������ �ִ�.   
 * TestMovie Ŭ������ �̿��Ͽ� Movie Ŭ���� �� �޼ҵ带 ȣ������� �� �ֿܼ� ��µǴ� ����� ������ ����. 
 * [TestMovie ������] 
 * 		��Ž�Ʈ ����(Drama) �����Դϴ�. 
 * 		-------------------- 
 * 		���� �����̴�(SF) �����Դϴ�. 
 */
public class TestMoive {

	public static void main(String[] args) {
		Movie myMovie = new Movie();
		myMovie.setTitle("��Ž�Ʈ ����");
		myMovie.setGenre("Drama");
		myMovie.play();

		System.out.println("--------------------");

		Movie yourMovie = new Movie();
		yourMovie.setTitle("���� �����̴�");
		yourMovie.setGenre("SF");
		yourMovie.play();
	}

}
