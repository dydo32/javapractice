package ans.chap06;

public class Ch06_Exam01 {

	public static void main(String[] args) {

		BookShop ob = new BookShop("Web/servlet", "Dominica", 30000);
		System.out.println();
		System.out.println("책이름 : " + ob.getBname());
		System.out.println("저자 : " + ob.getAuthor());
		System.out.println("가격 : " + ob.getPrice());

		System.out.println("\n<<값 변경 후 출력>>");
		ob.setBname("안드로이드 이렇게 시작하세요");
		ob.setAuthor("Dominica");
		ob.setPrice(30000);
		
		
		System.out.println();
		System.out.println("책이름 : " + ob.getBname());
		System.out.println("저자 : " + ob.getAuthor());
		System.out.println("가격 : " + ob.getPrice());

	}

}
