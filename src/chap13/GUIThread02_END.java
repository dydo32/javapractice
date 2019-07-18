package chap13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//문제가 있는 프로그램
/*
* => GUI프로그램을 사용하는 경우 main쓰레드는 화면을 관리하고 이벤트처리를 위해서
* 	  Listening하는 작업을 수행
* 	  만약 다른 실행흐름을 만들어 주려면 쓰레드를 생성한 후 실행되도록 구현
*/
public class GUIThread02_END extends JFrame {
	JLabel lblNum;
	JButton btnStart;
	JButton btnStop;
	JTextField txtInput;
	Thread t1;

	public GUIThread02_END(String title) {
		super(title);
		display();// 화면디자인
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void display() {
		Container c = getContentPane();
		setLayout(new FlowLayout());
		int n = 0;
		lblNum = new JLabel(n + "");
		lblNum.setFont(new Font("Gothic", Font.ITALIC + Font.BOLD, 80));
		btnStart = new JButton("쓰레드시작");
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t1 = new Thread(new JLabelPrintThread(lblNum));
				t1.start();
			}
		});
		btnStop = new JButton("쓰레드중지");
		btnStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.interrupt();
			}
		});
		
		txtInput = new JTextField(10);
		c.add(lblNum);
		c.add(btnStart);
		c.add(btnStop);
		c.add(txtInput);
	}

	public static void main(String[] args) {
		GUIThread02_END obj = new GUIThread02_END("Thread");
	}
}
