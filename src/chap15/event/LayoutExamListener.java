package chap15.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutExamListener  implements ActionListener{
	LayoutExam mainView;
	public LayoutExamListener() {
	}
	public LayoutExamListener(LayoutExam mainView) {
		super();
		this.mainView = mainView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mainView.btn1 | e.getSource() == mainView.btn2 | 
				e.getSource() == mainView.btn3 | e.getSource() == mainView.btn4) {
			mainView.taInfo.append(e.getActionCommand() + "\n");
			
		//	JButton src = (JButton)e.getSource();				//다른방법
		//	mainView.taInfo.append(src.getText()+"\n");
			
		} else if (e.getSource() == mainView.btn5 | e.getSource() == mainView.tfdata ) {
			String grade = mainView.tfdata.getText();
			
			// 비즈니스 메소드 call
			LayoutExamLogic logic = new LayoutExamLogic();
			String msg = logic.getMsg(grade);
			
			/*	로직부분
			if(grade.equals("vvip")){
				msg = "포인트: 10000";
			}else if(grade.equals("vip")){
				msg = "포인트: 5000";
			}else if(grade.equals("gold")){
				msg = "포인트: 3000";
			}else{
				msg = "다시 입력하세요.";
			}
			*/
		
			mainView.taInfo.append(msg + "\n");
			mainView.tfdata.setText("");
			
			/*if (mainView.tfdata.getText().equals("vvip")) {
				mainView.taInfo.append("포인트10000점" + "\n");
				mainView.tfdata.setText("");
			} else if (mainView.tfdata.getText().equals("vip")) {
				mainView.taInfo.append("포인트5000점" + "\n");
				mainView.tfdata.setText("");
			} else if (mainView.tfdata.getText().equals("gold")) {
				mainView.taInfo.append("포인트3000점" + "\n");
				mainView.tfdata.setText("");
			} else {
				mainView.taInfo.append("다시입력하세요" + "\n");
				mainView.tfdata.setText("");
			}*/
		}
	}

}
