package chap15;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest01 extends JFrame{
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");

	public GridLayoutTest01() {

	}

	public GridLayoutTest01(String title) {
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void display(){
		//1. Contentpane을 추출
		Container c = getContentPane();
		//setLayout(new GridLayout(2,3));  //(행,열)
		setLayout(new GridLayout(2,3,10,10)); //(행,열,수평간격,수직간격)
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		c.add(btn6);
	}
	public static void main(String[] args) {
		GridLayoutTest01 obj = new GridLayoutTest01("GridLayout연습");
	}

}
