package chap13.quiz;

import javax.swing.JOptionPane;

public class ClockThread extends Thread{
	private OnlineQuiz mainView;
	private boolean state = false;
	public ClockThread(){}
	public ClockThread(OnlineQuiz mainView){
		super();
		this.mainView = mainView;
		mainView.jProgressBar1.setMinimum(0);	// ���α׷������� �ּҰ�
		mainView.jProgressBar1.setMinimum(20);	// ���α׷������� �ּҰ�
	}
	
	public void stopThread(){
		state = true;
	}
	
	@Override
	public void run() {
		// 1�ʿ� ���α׷����ٸ� �� ĭ�� �̵��ϰ� �󺧰��� ����
		int time = 1;
		while(!state){
			mainView.jProgressBar1.setValue(time);
			mainView.lbltime.setText(time+"");
			if(time==20){
				JOptionPane.showMessageDialog(mainView, "�۾��ð��� �Ϸ�ƽ��ϴ�.");
				stopThread();	// �۾��� �Ϸ�Ǹ� Thread�� �����ϱ� ���� �۾�
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			time++;
		}
	}
}
