package chap15.event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LayoutExam extends JFrame {
	JButton btn1 = new JButton("가입");
	JButton btn2 = new JButton("수정");
	JButton btn3 = new JButton("삭제");
	JButton btn4 = new JButton("조회"); 
	JPanel p2= new JPanel(); 
	JPanel p1= new JPanel(); 

	JButton btn5 = new JButton("처리");
	
	JTextField tfdata = new JTextField(20);
	JTextArea taInfo = new JTextArea();
	JLabel lblcustInfo = new JLabel("회원구분:");
	public LayoutExam(String title){
		super(title);
		display();
		startEvent();
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void startEvent(){
		LayoutExamListener listener = new LayoutExamListener(this);
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
		btn4.addActionListener(listener);
		tfdata.addActionListener(listener);
		btn5.addActionListener(listener);
	}

	//화면디자인을 위한 메소드
	public void display(){
		//컴포넌트를 배치할 contentPane을 얻는다.
		Container c = getContentPane();
		//2.어떤 배치관리자 (LayoutManager)를 이용해서 컴포넌트를 배치할지 설정	
		setLayout(new BorderLayout()); 
		p1.setBackground(Color.YELLOW);
		
		p1.setLayout(new FlowLayout());
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);		
		c.add(p1,BorderLayout.NORTH);
		c.add(taInfo,BorderLayout.CENTER);
		
		p2.setBackground(new Color(100,100,255));
		p2.setLayout(new FlowLayout());
		p2.add(lblcustInfo);
		p2.add(tfdata);
		p2.add(btn5);
		
		c.add(p1,BorderLayout.NORTH);
		c.add(p2,BorderLayout.SOUTH);
		
	}
	
	public static void main(String [] args){
		LayoutExam f = new LayoutExam("레이아웃");		
	}
}
