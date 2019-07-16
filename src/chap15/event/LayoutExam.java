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
	JButton btn1 = new JButton("����");
	JButton btn2 = new JButton("����");
	JButton btn3 = new JButton("����");
	JButton btn4 = new JButton("��ȸ"); 
	JPanel p2= new JPanel(); 
	JPanel p1= new JPanel(); 

	JButton btn5 = new JButton("ó��");
	
	JTextField tfdata = new JTextField(20);
	JTextArea taInfo = new JTextArea();
	JLabel lblcustInfo = new JLabel("ȸ������:");
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

	//ȭ��������� ���� �޼ҵ�
	public void display(){
		//������Ʈ�� ��ġ�� contentPane�� ��´�.
		Container c = getContentPane();
		//2.� ��ġ������ (LayoutManager)�� �̿��ؼ� ������Ʈ�� ��ġ���� ����	
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
		LayoutExam f = new LayoutExam("���̾ƿ�");		
	}
}
