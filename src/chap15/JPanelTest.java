package chap15;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//JPanel�� �׽�Ʈ
/*
* => ���� Container�� ������ �ϴ� �г��� �߰��ؼ� ������ ȭ���� �������� �� �ִ�.
* 	 Jpanel���� Container�̹Ƿ� JButton���� �ٸ� ������Ʈ�� �߰� �� �� �ְ�
*    �� ���� ������Ʈ�̹Ƿ� �ֻ��� �����̳��� JFrame�� �߰��� �� �ִ�.
*    JPanel�� �⺻ ��ġ�����ڰ� FlowLayout
*    Jpanel�� ���������� �ϴ� �����̳��̹Ƿ� ���������� ������ �� ���� �ݵ�� JFrame�� �� ������ 
*    �߰��ؼ� �۾��ؾ� �Ѵ�.
*/
public class JPanelTest extends JFrame {
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JPanel eastPanel = new JPanel(); // JFrame�� EAST������ �߰��� �г�

	public JPanelTest() {

	}

	public JPanelTest(String title) {
		super(title);
		display();
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void display() {
		// 1. Contentpane�� ����
		Container c = getContentPane();
		// 2. ��üJFrame�� ���� ���̾ƿ�����
		// setLayout(new BorderLayout());
		// 3.�гο� ���̾ƿ��� �����ϰ� �гο� ������Ʈ�� �߰�(��ư 3�� �߰�)
		eastPanel.setLayout(new GridLayout(3, 1));
		eastPanel.add(btn2);
		eastPanel.add(btn3);
		eastPanel.add(btn4);
		c.add(btn1, BorderLayout.CENTER);
		c.add(eastPanel,BorderLayout.EAST);
	}

	public static void main(String[] args) {
		JPanelTest obj = new JPanelTest("JPanel ����");
	}
}
