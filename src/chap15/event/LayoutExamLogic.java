package chap15.event;
//비즈니스 로직 부분을 따로 클래스로 작성
//--------->이벤트가 발생할 때 내가 처리하고 싶은 기능
public class LayoutExamLogic {
	public String getMsg(String grade){
		System.out.println("getMsg");
		String msg = "";
		if(grade.equals("vvip")){
			msg = "포인트: 10000";
		}else if(grade.equals("vip")){
			msg = "포인트: 5000";
		}else if(grade.equals("gold")){
			msg = "포인트: 3000";
		}else{
			msg = "다시 입력하세요.";
		}
		return msg;
	}
}
