package chap15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame{
	JButton btn1 = new JButton("안녕");
	JButton btn2 = new JButton("hello swing");
	JButton btn3 = new JButton("확인");
	JButton btn4 = new JButton("안녕");
	JButton btn5 = new JButton("hello swing");
	JButton btn6 = new JButton("확인");
	
	public FlowLayoutTest() {

	}

	public FlowLayoutTest(String title) {
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void display(){
		//1. Contentpane을 추출
		Container c = getContentPane();
		//setLayout(new FlowLayout());	//기본생성자가 있지만 잘 안씀
		//setLayout(new FlowLayout(FlowLayout.RIGHT)); //위치
		setLayout(new FlowLayout(FlowLayout.RIGHT,20,20)); //위치,수평간격,수직간격
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		c.add(btn6);
	}
	public static void main(String[] args) {
		FlowLayoutTest obj = new FlowLayoutTest("Flowlayout 연습");
	}

}
