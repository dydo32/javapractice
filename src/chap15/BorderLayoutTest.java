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
		// 1. ContentPane을 추출
		Container c = getContentPane();
		// 2. 어떤 배치관리자(LayoutManager)를 이용해서 컴포넌트를 배치할지 설정
		setLayout(new BorderLayout()); 	// 화면의 배치관리자를 BorderLayout으로 설정하겠다는 의미
										// 즉, BorderLayout에 등록되어 있는 컴포넌트 배치방식으로
										// 나의 JFrame에 컴포넌트를 배치하겠다는 의미
		// 3. BorderLayout의 각 영역으로 컴포넌트를 배치
		c.add(btn1, BorderLayout.NORTH);
		c.add(btn2, BorderLayout.WEST);
		c.add(btn3, BorderLayout.CENTER);
		c.add(btn4, BorderLayout.EAST);
		c.add(btn5, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		BorderLayoutTest obj = new BorderLayoutTest("BorderLayout 연습");
	}

}
