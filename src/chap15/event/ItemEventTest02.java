package chap15.event;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class ItemEventTest02 extends JFrame{
	JRadioButton[] rdoitems = new JRadioButton[4];
	String[] itemValues = {"���","ƫ��","����","�ɴٹ�"};
	/*
	JRadioButton rdoitem1 = new JRadioButton("���");
	JRadioButton rdoitem2 = new JRadioButton("ƫ��");
	JRadioButton rdoitem3 = new JRadioButton("����");
	*/
	ImageIcon[] images ={
			new ImageIcon("src/images/flower4.jpg"),
			new ImageIcon("src/images/flower3.jpg"),
			new ImageIcon("src/images/flower2.jpg"),
			new ImageIcon("src/images/flower.jpg") };
	JLabel lblimg = new JLabel();
	JPanel p = new JPanel();
	
	public ItemEventTest02(String title){
		super(title);
		display();
		setSize(700,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	//ȭ��������� ���� �޼ҵ�
	public void display(){
		Container c = getContentPane();
		//�ϳ��� ������ �� �ֵ��� �������� �׷�
		ButtonGroup group = new ButtonGroup();
		ItemEventTest02Listener listener = new ItemEventTest02Listener(this);
		for(int i=0; i<rdoitems.length; i++){
			rdoitems[i] = new JRadioButton(itemValues[i]);
			group.add(rdoitems[i]);
			p.add(rdoitems[i]);
			rdoitems[i].addItemListener(listener);
		}
		/*
		group.add(rdoitem1);
		group.add(rdoitem2);
		group.add(rdoitem3);
		p.add(rdoitem1);
		p.add(rdoitem2);
		p.add(rdoitem3);
		*/
		lblimg.setHorizontalAlignment(SwingConstants.CENTER);
		c.add(p,BorderLayout.NORTH);
		c.add(lblimg,BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		ItemEventTest02 f = new ItemEventTest02("GUI����");
	}

}
