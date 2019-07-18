package chap13;

import javax.swing.JLabel;

public class JLabelPrintThread implements Runnable{
	JLabel lblNum;
	public JLabelPrintThread() {
		
	}

	public JLabelPrintThread(JLabel lblNum) {
		super();
		this.lblNum = lblNum;
	}

	@Override
	public void run() {
		int num = 1;
		
		try {
			while(!Thread.currentThread().isInterrupted()){
				lblNum.setText(num+"");
				num++;
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
