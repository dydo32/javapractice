package chap15;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SouthPanel extends JPanel{
	JLabel lbl1 = new JLabel("�������� ���: \n");
	JLabel lbl2 = new JLabel("���� ����: �ҽ����� ");
	JLabel lbl3 = new JLabel("�������� ");
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JButton btn1 = new JButton("<<����>>");
	JPanel jp1= new JPanel();
	
	public SouthPanel(){
		setLayout(new GridLayout(2,1));
		setBackground(Color.YELLOW);
		
		jp1.setLayout(new FlowLayout());
		jp1.setBackground(Color.YELLOW);
		
		jp1.add(lbl2);
		jp1.add(tf1);
		jp1.add(lbl3);
		jp1.add(tf2);
		jp1.add(btn1);
		
		add(lbl1);
		add(jp1);
	}
}
