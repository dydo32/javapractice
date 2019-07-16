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
		//�и��� ������ ȣ��
		if(e.getSource() == mainView.btn5){
			System.exit(0);
		}else{
			//ȭ�鿡�� �Է��� �����͸� ����
			String su1 = mainView.tfdata1.getText();
			String su2 = mainView.tfdata2.getText();
			String btn = e.getActionCommand();
			//�����Ͻ� �޼ҵ� ȣ��
			CalcLogic logic = new CalcLogic();
			int result = logic.calc(su1, su2, btn);
			
			//���ȭ�� ����
			mainView.resultPanel.rfres.setText(result+"");
		}
	}

}
