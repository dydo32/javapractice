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
//������ �ִ� ���α׷�
/*
* => GUI���α׷��� ����ϴ� ��� main������� ȭ���� �����ϰ� �̺�Ʈó���� ���ؼ�
* 	  Listening�ϴ� �۾��� ����
* 	  ���� �ٸ� �����帧�� ����� �ַ��� �����带 ������ �� ����ǵ��� ����
*/
public class GUIThread02_END extends JFrame {
	JLabel lblNum;
	JButton btnStart;
	JButton btnStop;
	JTextField txtInput;
	Thread t1;

	public GUIThread02_END(String title) {
		super(title);
		display();// ȭ�������
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
		btnStart = new JButton("���������");
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t1 = new Thread(new JLabelPrintThread(lblNum));
				t1.start();
			}
		});
		btnStop = new JButton("����������");
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
