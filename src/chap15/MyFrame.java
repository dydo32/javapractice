package chap15;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{	//JFrame�� �����ϱ� setSize���� �׳� �� �� ����
	JButton btn1 = new JButton("�ȳ�");
	JButton btn2 = new JButton("hello swing");
	JButton btn3 = new JButton("Ȯ��");
	
	public MyFrame(String title) {
		//ȭ�鿡 ������Ʈ�� ��ġ, JFrame�� ������� visible����
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//ȭ�� �������� ���� �޼ҵ�
	public void display(){
		Container c = getContentPane();
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
	}
}
