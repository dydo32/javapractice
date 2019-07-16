package chap15;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelExam02 extends JFrame{
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnok = new JButton("확인");
	JPanel northPanel = new JPanel();
	JPanel centerPanel = new JPanel();
	JPanel southPanel = new JPanel();
	
	public JPanelExam02() {

	}

	public JPanelExam02(String title) {
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void display(){
		//1. Contentpane을 추출
		Container c = getContentPane();
		
		northPanel.setLayout(new GridLayout(1,3));
		northPanel.add(btn1);
		northPanel.add(btn2);
		northPanel.add(btn3);
		centerPanel.setLayout(new GridLayout(3,2));
		centerPanel.add(btn4);
		centerPanel.add(btn5);
		centerPanel.add(btn6);
		centerPanel.add(btn7);
		centerPanel.add(btn8);
		centerPanel.add(btn9);
		southPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		southPanel.add(btnok);
		
		c.add(northPanel, BorderLayout.NORTH);
		c.add(centerPanel, BorderLayout.CENTER);
		c.add(southPanel, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		JPanelExam02 obj = new JPanelExam02("JPanel 연습");
	}

}
