package chap06.exam;

public class BookMgr {
	//멤버변수
	Book[] booklist = new Book[5];

	//배열 변수를 초기화 하는 메서드
	public BookMgr(){
	}
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}

	//책 목록을 화면에 출력하는 printBookList()메서드
	public void printBooklist() {
		for (int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	//모든 책 가격의 합을 출력하는 printTotalPrice()메서드
	public void printTotalPrice() {
		int totalPrice = 0;
		
		for(int i=0;i<booklist.length;i++){
			totalPrice = totalPrice + booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : "+ totalPrice);
	}
}
