package chap15;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ���ø� extends JFrame {
	JButton btn1 = new JButton("�ȳ�");
	JButton btn2 = new JButton("hello swing");
	JButton btn3 = new JButton("Ȯ��");

	public ���ø�() {

	}

	public ���ø�(String title) {
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void display(){
		//1. Contentpane�� ����
		Container c = getContentPane();
	}
	
	public static void main(String[] args) {
		���ø� obj = new ���ø�("flowlayout����");
	}

}
