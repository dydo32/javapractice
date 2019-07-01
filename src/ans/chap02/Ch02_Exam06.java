package ans.chap02;

public class Ch02_Exam06 {
	public static void main(String[] args) {

		// 변수 선언
		int kor, eng, mat, tot;
		double avg;
		String name;

		// 값 대입
		avg = 0.0;
		tot = 0;
		name = "홍길동";
		kor = 90;
		eng = 83;
		mat = 72;

		// 연산
		tot = kor + eng + mat;
		avg = tot / (double) 3;

		// 출력

		System.out.println("name :" + name);
		System.out
				.println("kor  : " + kor + "\teng :" + eng + "\t mat :" + mat);

		System.out.println("tot=" + tot + "\tavg=" + avg);

	}
}
