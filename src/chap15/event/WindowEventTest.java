package chap15.event;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowEventTest extends JFrame implements WindowListener { // JFrame이
	JButton btn1 = new JButton("안녕");
	JButton btn2 = new JButton("hello swing");
	JButton btn3 = new JButton("확인");

	public WindowEventTest(String title) {
		// 화면에 컴포넌트를 배치, JFrame의 사이즈와 visible설정
		super(title);
		display();
		addWindowListener(this);
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 화면 디자인을 위한 메소드
	public void display() {
		Container c = getContentPane();
		c.add(btn1);
		c.add(btn3);
		c.add(btn2);
		btn2.addActionListener(new ActionListener() { // 버튼에 바로 이벤트 발생하게 하는 것,
														// 딱한번만 쓰고 없어짐.
														// 선언하자마자 사용. 이너클래스에 이름이
														// 없어서 익명이너클래스라함.,
														// 이벤트 붙일 때만 활용하는데 이마저도
														// 자주 사용하면 안됨.
														// ActionListener의
														// 하위클래스를 선언하면서 이름은 없음.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명이너클래스를 이용한 이벤트 처리");

			}
		});

	}

	public static void main(String[] args) {
		WindowEventTest f = new WindowEventTest("자바다운 JFrame"); // exe 파일로 만들 수
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
