package chap15.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstListener implements ActionListener {
	FirstEventTest mainView;

	public FirstListener() {
	}

	public FirstListener(FirstEventTest mainView) {
		super();
		this.mainView = mainView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 각각의 버튼이 눌려지면 버튼의 문자열을 출력
		if (e.getActionCommand().equals("east")) {
			System.out.println("동족");
		} else if (e.getActionCommand().equals("west")) {
			System.out.println("서쪽");
		} else if (e.getActionCommand().equals("south")) {
			System.out.println("남쪽");
		} else if (e.getActionCommand().equals("north")) {
			System.out.println("북쪽");
		} else if (e.getActionCommand().equals("center")) {
			System.out.println("가운데");
		}

		// e.getSource()를 활용해서 각각의 버튼이 눌려질때 마다
		// 버튼의 문자열 => ____ 	(FirstListener, FirstEventTest 둘다 구조 수정 가능)
		if(e.getSource()==mainView.btn1){
			System.out.println("버튼의 문자열 => north");
			String text = mainView.btn1.getText();
			System.out.println("버튼의 문자열 => "+text);
		}else if(e.getSource()==mainView.btn2){
			mainView.btn2.setText("서쪽");
			System.out.println("버튼의 문자열 => west");
		}else if(e.getSource()==mainView.btn3){
			CalcMini calc = new CalcMini();
		}else if(e.getSource()==mainView.btn4){
			System.out.println("버튼의 문자열 => east");
		}else if(e.getSource()==mainView.btn5){
			System.out.println("버튼의 문자열 => south");
		}
		
	/*	System.out.println("이벤트 발생..반응완료...");
		System.out.println(e); 	//e.toString();
		
		// 이벤트 소스 객체가 갖고 있는 문자열을 리턴
		System.out.println("e.getActionCommand()=> " + e.getActionCommand());
	
		// 실제 이벤트를 발생시킨 소스객체 리턴
		System.out.println(e.getSource());*/
		
	}

}
