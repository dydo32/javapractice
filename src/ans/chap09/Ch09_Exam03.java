package ans.chap09;

public class Ch09_Exam03 {

	public static void prn() throws Exception  {
		throw new Exception("���ܰ� �߻�!!");
	}

	public static void main(String[] args) {	

		try {
			prn();
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ǿ� ó���մϴ� " + e);
		}

	}

}
