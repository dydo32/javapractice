package chap15;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{	//JFrame이 상위니까 setSize등을 그냥 쓸 수 있음
	JButton btn1 = new JButton("안녕");
	JButton btn2 = new JButton("hello swing");
	JButton btn3 = new JButton("확인");
	
	public MyFrame(String title) {
		//화면에 컴포넌트를 배치, JFrame의 사이즈와 visible설정
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//화면 디자인을 위한 메소드
	public void display(){
		Container c = getContentPane();
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
	}
}
