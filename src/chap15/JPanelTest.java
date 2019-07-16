package chap15;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//JPanel의 테스트
/*
* => 보조 Container의 역할을 하는 패널을 추가해서 복잡한 화면을 디자인할 수 있다.
* 	 Jpanel또한 Container이므로 JButton같은 다른 컴포넌트를 추가 할 수 있고
*    이 역시 컴포넌트이므로 최상위 컨테이너인 JFrame에 추가할 수 있다.
*    JPanel은 기본 배치관리자가 FlowLayout
*    Jpanel은 보조역할을 하는 컨테이너이므로 독립적으로 실행할 수 없고 반드시 JFrame의 한 영역에 
*    추가해서 작업해야 한다.
*/
public class JPanelTest extends JFrame {
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JPanel eastPanel = new JPanel(); // JFrame의 EAST영역에 추가할 패널

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
		// 1. Contentpane을 추출
		Container c = getContentPane();
		// 2. 전체JFrame에 대한 레이아웃설정
		// setLayout(new BorderLayout());
		// 3.패널에 레이아웃을 설정하고 패널에 컴포넌트를 추가(버튼 3개 추가)
		eastPanel.setLayout(new GridLayout(3, 1));
		eastPanel.add(btn2);
		eastPanel.add(btn3);
		eastPanel.add(btn4);
		c.add(btn1, BorderLayout.CENTER);
		c.add(eastPanel,BorderLayout.EAST);
	}

	public static void main(String[] args) {
		JPanelTest obj = new JPanelTest("JPanel 연습");
	}
}
