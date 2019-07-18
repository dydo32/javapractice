package chap13.quiz;

import javax.swing.JOptionPane;

public class ClockThread extends Thread{
	private OnlineQuiz mainView;
	private boolean state = false;
	public ClockThread(){}
	public ClockThread(OnlineQuiz mainView){
		super();
		this.mainView = mainView;
		mainView.jProgressBar1.setMinimum(0);	// 프로그래스바의 최소값
		mainView.jProgressBar1.setMinimum(20);	// 프로그래스바의 최소값
	}
	
	public void stopThread(){
		state = true;
	}
	
	@Override
	public void run() {
		// 1초에 프로그래스바를 한 칸씩 이동하고 라벨값을 변경
		int time = 1;
		while(!state){
			mainView.jProgressBar1.setValue(time);
			mainView.lbltime.setText(time+"");
			if(time==20){
				JOptionPane.showMessageDialog(mainView, "작업시간이 완료됐습니다.");
				stopThread();	// 작업이 완료되면 Thread를 종료하기 위해 작업
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
