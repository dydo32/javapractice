package chap13.sync;

public class ThreadSyncTest01 {

	public static void main(String[] args) {
		//쓰레드에서 공유할 객체를 생성
		Toilet toilet = new Toilet();
		
		//공유객체를 사용하며 실행되는 쓰레드 생성
		User user1 = new User("장동건", toilet);
		User user2 = new User("공유", toilet);
		User user3 = new User("이민호", toilet);
		User user4 = new User("현빈", toilet);
		User user5 = new User("원빈", toilet);
		User user6 = new User("수지", toilet);
		User user7 = new User("김영철", toilet);
		
		//쓰레드를 시작
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
		user6.start();
		user7.start();
	}

}
