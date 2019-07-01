package ans.chap06;

public class Ch06_Exam02 {

	public static void main(String[] args) {
		Emp[] ep = new Emp[3];
		ep[0] = new Emp("A111", 780000);
		ep[1] = new Emp("B222", 450000);
		ep[2] = new Emp("C333", 570000);

		System.out.println("   봉급계산서   ");
		System.out.println("=================================================");
		System.out
				.println("사번        기본급          수당              세금               본봉        등급   ");
		System.out.println("=================================================");
		for (Emp e : ep) {
			System.out.println(e.toString());
		}
	}

}
