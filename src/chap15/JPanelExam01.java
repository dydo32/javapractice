package chap15;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JPanelExam01 extends JFrame{
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JPanel westPanel = new JPanel();
	JPanel eastPanel = new JPanel();
	
	public JPanelExam01() {

	}
	public JPanelExam01(String title){
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void display(){
		//1. Contentpane을 추출
		Container c = getContentPane();
		
		westPanel.setLayout(new GridLayout(3, 1));
		westPanel.add(btn1);
		westPanel.add(btn2);
		westPanel.add(btn3);
		eastPanel.setLayout(new GridLayout(3,1));
		eastPanel.add(btn5);
		eastPanel.add(btn6);
		eastPanel.add(btn7);
		c.add(btn4, BorderLayout.CENTER);
		c.add(westPanel, BorderLayout.WEST);
		c.add(eastPanel, BorderLayout.EAST);
	}
	
	public static void main(String[] args) {
		JPanelExam01 obj = new JPanelExam01("JPanel연습");
	}

}
