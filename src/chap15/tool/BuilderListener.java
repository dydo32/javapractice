package chap15.tool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class BuilderListener implements ActionListener {
	MyFrameWithTool mainView;

	public BuilderListener() {
	}
	public BuilderListener(MyFrameWithTool mainView) {
		super();
		this.mainView = mainView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mainView.btncalc1){
			System.out.println(mainView.txtnum1.getText());
		}else if(e.getSource() == mainView.btncalc2){
			//�ܺ����μ��� �����ϱ�
			Runtime r = Runtime.getRuntime();
			try {
				Process p = r.exec("calc.exe");
			} catch (IOException e1) {
				e1.printStackTrace();
			}//���������� ���
		}else if(e.getSource() == mainView.btnshow){
			CalcView subView = new CalcView();
		}
	}
}
