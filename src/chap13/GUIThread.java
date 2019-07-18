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
public class GUIThread extends JFrame{
	JLabel lblNum;
	JButton btnStart;
	JTextField txtInput;
	
	public GUIThread(String title){
		super(title);
		display();//화면디자인
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void display() {
		Container c = getContentPane();
		setLayout(new FlowLayout());
		int n = 0;
		lblNum = new JLabel(n+"");
		lblNum.setFont(new Font("Gothic",
				Font.ITALIC+Font.BOLD, 80));
		btnStart = new JButton("쓰레드시작");
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//숫자를 1부터 10까지 증가시키며 JLabel의 값을 변경시키는 메소드 호출
				print();
				
			}
		});
		txtInput = new JTextField(10);
		c.add(lblNum);
		c.add(btnStart);
		c.add(txtInput);
		
	}
	//JLabel의 값을 1부터 10까지 증가시키는 메소드
		public void print(){
			int num=1;
			while(num<=10){
				lblNum.setText(num+"");
				num++;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	public static void main(String[] args) {
		GUIThread obj = new GUIThread("Thread");
	}
}
