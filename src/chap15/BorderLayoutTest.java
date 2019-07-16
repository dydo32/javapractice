package chap15;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {
	JButton btn1 = new JButton("north");
	JButton btn2 = new JButton("west");
	JButton btn3 = new JButton("center");
	JButton btn4 = new JButton("east");
	JButton btn5 = new JButton("south");

	public BorderLayoutTest() {
	}

	public BorderLayoutTest(String title) {
		super(title);
		display();
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void display() {
		// 1. ContentPane�� ����
		Container c = getContentPane();
		// 2. � ��ġ������(LayoutManager)�� �̿��ؼ� ������Ʈ�� ��ġ���� ����
		setLayout(new BorderLayout()); 	// ȭ���� ��ġ�����ڸ� BorderLayout���� �����ϰڴٴ� �ǹ�
										// ��, BorderLayout�� ��ϵǾ� �ִ� ������Ʈ ��ġ�������
										// ���� JFrame�� ������Ʈ�� ��ġ�ϰڴٴ� �ǹ�
		// 3. BorderLayout�� �� �������� ������Ʈ�� ��ġ
		c.add(btn1, BorderLayout.NORTH);
		c.add(btn2, BorderLayout.WEST);
		c.add(btn3, BorderLayout.CENTER);
		c.add(btn4, BorderLayout.EAST);
		c.add(btn5, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		BorderLayoutTest obj = new BorderLayoutTest("BorderLayout ����");
	}

}
