package chap15.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ItemEventExam extends JFrame{
	JLabel lbltitle = new JLabel("�޴���");
	JLabel lblmain = new JLabel("�ָ޴�:");
	JLabel lblsub = new JLabel("�߰��޴�:");
	JLabel lblprice = new JLabel("�ݾ�:");
	ButtonGroup group1 = new ButtonGroup();
	JRadioButton[] rbomenu = new JRadioButton[3];
	String[] rbodata = {"ġŲī�����̽�","�⺻ī�����̽�","��äī�����̽�"};
	
	int[] mainPrice = { 9000, 7000, 8000 };
	
	JCheckBox[] chkmenu = new JCheckBox[6];
	String[] chkdata = {"ġ��","�ؽ���������","�Ҽ���","���","ġŲ�","��������"};
	
	int[] subPrice = { 1500, 2000, 2500, 3000, 3000, 1000 };

	JTextField tfPrice = new JTextField(20);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel centerPanel = new JPanel();
	
	public ItemEventExam(String title){
		super(title);
		display();
		startEvent();		
		setSize(370, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void startEvent() {
		ItemEventExamListener listener = new ItemEventExamListener(this);
		for (int i = 0; i < rbomenu.length; i++) {
			rbomenu[i].addItemListener(listener);
		}
		for (int i = 0; i < chkmenu.length; i++) {
			chkmenu[i].addItemListener(listener);
		}
	}
	public void display(){
		//1. ������Ʈ�� ��ġ�� ContentPane�� ��´�.
		Container c = getContentPane();
		lbltitle.setFont(new Font("����",Font.BOLD,18));
		c.add(lbltitle,BorderLayout.NORTH);
		
		p1.setLayout(new GridLayout(5, 1));
		p1.add(lblmain);
		p1.add(lblsub);
		for (int i = 0; i < rbomenu.length; i++) {
		 	rbomenu[i] = new JRadioButton(rbodata[i]);
		   	group1.add(rbomenu[i]);
		   	p1.add(rbomenu[i]);
		    // 	rbomenu[i].addItemListener(listener);
		}
		p1.add(lblsub);
		p2.setLayout(new GridLayout(3, 2));
		for (int i = 0; i < chkmenu.length; i++) {
			chkmenu[i] =  new JCheckBox(chkdata[i]);
			p2.add(chkmenu[i]);
	    	//chkmenu[i].addItemListener(listener);
	    	
		}
	
		centerPanel.add(p1);
		centerPanel.add(p2);
		centerPanel.setLayout(new GridLayout(2, 1));
		c.add(centerPanel,BorderLayout.CENTER);
		
		p3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p3.add(lblprice);
		p3.add(tfPrice);
		c.add(p3,BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		ItemEventExam obj  = new ItemEventExam("ItemEventExam");
	}
}