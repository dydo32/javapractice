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
1.ActionEventListener를 작성.
->send(JButton)와 text(JTextField)에 이벤트를 연결 
->send버튼을 누르면 “send버튼” 출력
->text에서 Enter를 누르면 “text” 출력
*/
public class ActionEventTest extends JFrame {
	JTextField text;
	JButton send;
	JTextArea content;

	public ActionEventTest() {
		super("ActionTest연습");
		display();
		eventStart();
		this.setSize(350, 200);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void eventStart() { // 외부에 노출 X => private
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
		JLabel label = new JLabel("내용");
		text = new JTextField(20);
		send = new JButton("전송");
		p1.add(label);
		p1.add(text);
		p1.add(send);
		c.add(p1, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		ActionEventTest f = new ActionEventTest();
	}

}
