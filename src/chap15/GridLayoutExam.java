package chap15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class GridLayoutExam extends JFrame {
	JLabel lbljfl = new JLabel("JavaFileList");
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	String[] data1 = { "java", "thread", "network", "html5", "jquery" };
	JList<String> lstSubject = new JList<String>(data1);
	SouthPanel southPanel = new SouthPanel();
	
	public GridLayoutExam() {

	}
	public GridLayoutExam(String title) {
		super(title);
		display();
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void display() {
		// 1. Contentpane을 추출
		Container c = getContentPane();

		setLayout(new BorderLayout());
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		p1.add(lbljfl);
		p2.setBackground(Color.LIGHT_GRAY);
		
		c.add(p1,BorderLayout.NORTH);
		c.add(p2);
		c.add(lstSubject,BorderLayout.WEST);
		c.add(southPanel,BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		GridLayoutExam obj = new GridLayoutExam("GridLayout연습");
	}

}
