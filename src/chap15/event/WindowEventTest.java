package chap15.event;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowEventTest extends JFrame implements WindowListener { // JFrame��
	JButton btn1 = new JButton("�ȳ�");
	JButton btn2 = new JButton("hello swing");
	JButton btn3 = new JButton("Ȯ��");

	public WindowEventTest(String title) {
		// ȭ�鿡 ������Ʈ�� ��ġ, JFrame�� ������� visible����
		super(title);
		display();
		addWindowListener(this);
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// ȭ�� �������� ���� �޼ҵ�
	public void display() {
		Container c = getContentPane();
		c.add(btn1);
		c.add(btn3);
		c.add(btn2);
		btn2.addActionListener(new ActionListener() { // ��ư�� �ٷ� �̺�Ʈ �߻��ϰ� �ϴ� ��,
														// ���ѹ��� ���� ������.
														// �������ڸ��� ���. �̳�Ŭ������ �̸���
														// ��� �͸��̳�Ŭ��������.,
														// �̺�Ʈ ���� ���� Ȱ���ϴµ� �̸�����
														// ���� ����ϸ� �ȵ�.
														// ActionListener��
														// ����Ŭ������ �����ϸ鼭 �̸��� ����.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�͸��̳�Ŭ������ �̿��� �̺�Ʈ ó��");

			}
		});

	}

	public static void main(String[] args) {
		WindowEventTest f = new WindowEventTest("�ڹٴٿ� JFrame"); // exe ���Ϸ� ���� ��
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");

	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");

	}

}
