package chap15.event;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
1.ActionEventListener�� �ۼ�.
->send(JButton)�� text(JTextField)�� �̺�Ʈ�� ���� 
->send��ư�� ������ ��send��ư�� ���
->text���� Enter�� ������ ��text�� ���
*/
public class ActionEventTest extends JFrame {
	JTextField text;
	JButton send;
	JTextArea content;

	public ActionEventTest() {
		super("ActionTest����");
		display();
		eventStart();
		this.setSize(350, 200);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void eventStart() { // �ܺο� ���� X => private
		ActionEventListener listener = new ActionEventListener(this);
		text.addActionListener(listener);
		send.addActionListener(listener);
	}

	public void display() {
		Container c = this.getContentPane();
		content = new JTextArea(5, 30);
		JScrollPane scroll = new JScrollPane(content);
		c.add(scroll, BorderLayout.CENTER);
		JPanel p1 = new JPanel();
		JLabel label = new JLabel("����");
		text = new JTextField(20);
		send = new JButton("����");
		p1.add(label);
		p1.add(text);
		p1.add(send);
		c.add(p1, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		ActionEventTest f = new ActionEventTest();
	}

}
