package chap08;
//Sender종류의 클래스를 호출하는 클래스
public class SenderLogic {
	public void run(Sender obj){
		System.out.println("호출");
		obj.send(); //오버라이딩된 메소드 제외 타입이 먼저여서 보이지 않는다.		
	
	}
}