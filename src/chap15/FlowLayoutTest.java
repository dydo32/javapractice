package chap15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame{
	JButton btn1 = new JButton("�ȳ�");
	JButton btn2 = new JButton("hello swing");
	JButton btn3 = new JButton("Ȯ��");
	JButton btn4 = new JButton("�ȳ�");
	JButton btn5 = new JButton("hello swing");
	JButton btn6 = new JButton("Ȯ��");
	
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
		//1. Contentpane�� ����
		Container c = getContentPane();
		//setLayout(new FlowLayout());	//�⺻�����ڰ� ������ �� �Ⱦ�
		//setLayout(new FlowLayout(FlowLayout.RIGHT)); //��ġ
		setLayout(new FlowLayout(FlowLayout.RIGHT,20,20)); //��ġ,���򰣰�,��������
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		c.add(btn6);
	}
	public static void main(String[] args) {
		FlowLayoutTest obj = new FlowLayoutTest("Flowlayout ����");
	}

}
