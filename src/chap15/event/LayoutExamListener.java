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
			
		//	JButton src = (JButton)e.getSource();				//�ٸ����
		//	mainView.taInfo.append(src.getText()+"\n");
			
		} else if (e.getSource() == mainView.btn5 | e.getSource() == mainView.tfdata ) {
			String grade = mainView.tfdata.getText();
			
			// ����Ͻ� �޼ҵ� call
			LayoutExamLogic logic = new LayoutExamLogic();
			String msg = logic.getMsg(grade);
			
			/*	�����κ�
			if(grade.equals("vvip")){
				msg = "����Ʈ: 10000";
			}else if(grade.equals("vip")){
				msg = "����Ʈ: 5000";
			}else if(grade.equals("gold")){
				msg = "����Ʈ: 3000";
			}else{
				msg = "�ٽ� �Է��ϼ���.";
			}
			*/
		
			mainView.taInfo.append(msg + "\n");
			mainView.tfdata.setText("");
			
			/*if (mainView.tfdata.getText().equals("vvip")) {
				mainView.taInfo.append("����Ʈ10000��" + "\n");
				mainView.tfdata.setText("");
			} else if (mainView.tfdata.getText().equals("vip")) {
				mainView.taInfo.append("����Ʈ5000��" + "\n");
				mainView.tfdata.setText("");
			} else if (mainView.tfdata.getText().equals("gold")) {
				mainView.taInfo.append("����Ʈ3000��" + "\n");
				mainView.tfdata.setText("");
			} else {
				mainView.taInfo.append("�ٽ��Է��ϼ���" + "\n");
				mainView.tfdata.setText("");
			}*/
		}
	}

}
