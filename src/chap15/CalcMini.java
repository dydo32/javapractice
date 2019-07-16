package chap15;

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
	
	//JPanel p3 = new JPanel();
	
	//JLabel lblInfo3 = new JLabel("RES=");
	//JPanel p4 = new JPanel();
	//JTextField tfdata3 = new JTextField(20);	
	
	JPanel p5 = new JPanel();
	
	//JButton btn1 = new JButton("+");
	//JButton btn2 = new JButton("-");
	//JButton btn3 = new JButton("*");
	//JButton btn4 = new JButton("/");
	JButton btn5 = new JButton("종료");
	
	CalcResultPanel resultPanel = new CalcResultPanel();
	CalcButtonPanel buttonPanel = new CalcButtonPanel();
	
	
	public CalcMini() {		//FirstListener CalcMini() 객체, this("");  this(매개변수);
		this("");			//이 경우 CalcMini(String title) 생성자 불러옴
							//this() : 생성자호출
	}

	public CalcMini(String title) {
		super(title);
		display();
		setSize(320,230);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		//p3.setLayout(new GridLayout(1, 4));
		//p3.add(btn1);
		//p3.add(btn2);
		//p3.add(btn3);
		//p3.add(btn4);
		//p4.setLayout(new BorderLayout());
		//p4.add(lblInfo3,BorderLayout.WEST);
		//p4.add(tfdata3,BorderLayout.CENTER);
		p5.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p5.add(btn5);
		
		c.add(p1);
		c.add(p2);
		c.add(buttonPanel);
		//c.add(p3);
		c.add(resultPanel);
		//c.add(p4);
		c.add(p5);
	}
	
	public static void main(String[] args) {
		CalcMini obj = new CalcMini("계산기");
	}
}
