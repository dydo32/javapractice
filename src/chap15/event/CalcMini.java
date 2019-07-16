package chap15.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcMini extends JFrame{
	JLabel lblInfo1 = new JLabel("SU1=");
	JPanel p1 = new JPanel();
	JTextField tfdata1 = new JTextField(20);
	JPanel p2 = new JPanel();
	JLabel lblInfo2 = new JLabel("SU2=");
	JTextField tfdata2 = new JTextField(20);	
	JPanel p5 = new JPanel();
	JButton btn5 = new JButton("종료");
	CalcResultPanel resultPanel = new CalcResultPanel();
	CalcButtonPanel buttonPanel = new CalcButtonPanel();
	
	public CalcMini() {		 
		this("");			
	}

	public CalcMini(String title) {
		super(title);
		display();
		setSize(320,230);
		startEvent();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void startEvent() {
		CalcListener listener = new CalcListener(this);
		tfdata1.addActionListener(listener);
		tfdata2.addActionListener(listener);
		resultPanel.rfres.addActionListener(listener);
		buttonPanel.btn1.addActionListener(listener);
		buttonPanel.btn2.addActionListener(listener);
		buttonPanel.btn3.addActionListener(listener);
		buttonPanel.btn4.addActionListener(listener);
		btn5.addActionListener(listener);
	}
	
	public void display(){
		//1. Contentpane을 추출
		Container c = getContentPane();
		setLayout(new GridLayout(5, 1));
		p1.setLayout(new BorderLayout());
		p1.add(lblInfo1,BorderLayout.WEST);
		p1.add(tfdata1,BorderLayout.CENTER);
		p2.setLayout(new BorderLayout());
		p2.add(lblInfo2,BorderLayout.WEST);
		p2.add(tfdata2,BorderLayout.CENTER);
		p5.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p5.add(btn5);
		c.add(p1);
		c.add(p2);
		c.add(buttonPanel);
		c.add(resultPanel);
		c.add(p5);
	}
	
	public static void main(String[] args) {
		CalcMini obj = new CalcMini("계산기");
	}
}
