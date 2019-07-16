package chap15.event;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstEventTest extends JFrame {
	JButton btn1 = new JButton("north");
	JButton btn2 = new JButton("west");
	JButton btn3 = new JButton("center");
	JButton btn4 = new JButton("east");
	JButton btn5 = new JButton("south");
	
	public FirstEventTest(){}
	
	public FirstEventTest(String title){
		super(title);
		display();		//화면디자인
		startEvent(); 	//이벤트처리에 관련된 메소드
		
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void startEvent(){
		//이벤트처리
		FirstListener listener = new FirstListener(this);
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
		btn4.addActionListener(listener);
		btn5.addActionListener(listener);
	}
	public void display(){
		//1. ContentPane을 추출
		Container c = getContentPane();
		setLayout(new BorderLayout()); 	

		c.add(btn1, BorderLayout.NORTH);
		c.add(btn2, BorderLayout.WEST);
		c.add(btn3, BorderLayout.CENTER);
		c.add(btn4, BorderLayout.EAST);
		c.add(btn5, BorderLayout.SOUTH);		
	}
	

	public static void main(String[] args) {
		FirstEventTest obj = new FirstEventTest("FirstEventTest 연습");
	}

}
