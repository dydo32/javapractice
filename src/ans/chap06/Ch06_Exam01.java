package ans.chap06;

public class Ch06_Exam01 {

	public static void main(String[] args) {

		BookShop ob = new BookShop("Web/servlet", "Dominica", 30000);
		System.out.println();
		System.out.println("å�̸� : " + ob.getBname());
		System.out.println("���� : " + ob.getAuthor());
		System.out.println("���� : " + ob.getPrice());

		System.out.println("\n<<�� ���� �� ���>>");
		ob.setBname("�ȵ���̵� �̷��� �����ϼ���");
		ob.setAuthor("Dominica");
		ob.setPrice(30000);
		
		
		System.out.println();
		System.out.println("å�̸� : " + ob.getBname());
		System.out.println("���� : " + ob.getAuthor());
		System.out.println("���� : " + ob.getPrice());

	}

}
