package chap15.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcListener implements ActionListener {
	CalcMini mainView;
	public CalcListener() {}

	public CalcListener(CalcMini mainView) {
		super();
		this.mainView = mainView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//분리된 로직을 호출
		if(e.getSource() == mainView.btn5){
			System.exit(0);
		}else{
			//화면에서 입력한 데이터를 추출
			String su1 = mainView.tfdata1.getText();
			String su2 = mainView.tfdata2.getText();
			String btn = e.getActionCommand();
			//비지니스 메소드 호출
			CalcLogic logic = new CalcLogic();
			int result = logic.calc(su1, su2, btn);
			
			//결과화면 생성
			mainView.resultPanel.rfres.setText(result+"");
		}
	}

}
