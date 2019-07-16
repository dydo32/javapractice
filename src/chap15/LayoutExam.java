package chap15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LayoutExam extends JFrame{
	JButton btn1 = new JButton("가입");
	JButton btn2 = new JButton("수정");
	JButton btn3 = new JButton("삭제");
	JButton btn4 = new JButton("조회");
	JButton btn5 = new JButton("검색");
	JTextArea taInfo = new JTextArea();
	JTextField tfInfo = new JTextField(20);
	JPanel northP = new JPanel();
	JPanel southP = new JPanel();
	static String yellow;
	
	public LayoutExam() {

	}

	public LayoutExam(String title) {
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void display(){
		//1. Contentpane을 추출
		Container c = getContentPane();
		northP.setLayout(new FlowLayout());
		northP.setBackground(Color.YELLOW);
		//or northP.setBackground(new Color(r,g,b));
		northP.add(btn1);
		northP.add(btn2);
		northP.add(btn3);
		northP.add(btn4);
		southP.setLayout(new FlowLayout());
		southP.setBackground(Color.BLUE);
		southP.add(tfInfo);
		southP.add(btn5);
		c.add(northP, BorderLayout.NORTH);
		c.add(southP, BorderLayout.SOUTH);
		c.add(taInfo,BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		LayoutExam obj = new LayoutExam("Layout연습");
	}

}
