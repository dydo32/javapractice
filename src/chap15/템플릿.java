package chap15;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ≈€«√∏¥ extends JFrame {
	JButton btn1 = new JButton("æ»≥Á");
	JButton btn2 = new JButton("hello swing");
	JButton btn3 = new JButton("»Æ¿Œ");

	public ≈€«√∏¥() {

	}

	public ≈€«√∏¥(String title) {
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void display(){
		//1. Contentpane¿ª √ﬂ√‚
		Container c = getContentPane();
	}
	
	public static void main(String[] args) {
		≈€«√∏¥ obj = new ≈€«√∏¥("flowlayoutø¨Ω¿");
	}

}
