package chap06.exam;

public class BookMgr {
	//�������
	Book[] booklist = new Book[5];

	//�迭 ������ �ʱ�ȭ �ϴ� �޼���
	public BookMgr(){
	}
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}

	//å ����� ȭ�鿡 ����ϴ� printBookList()�޼���
	public void printBooklist() {
		for (int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	//��� å ������ ���� ����ϴ� printTotalPrice()�޼���
	public void printTotalPrice() {
		int totalPrice = 0;
		
		for(int i=0;i<booklist.length;i++){
			totalPrice = totalPrice + booklist[i].getPrice();
		}
		System.out.println("��ü å ������ �� : "+ totalPrice);
	}
}
