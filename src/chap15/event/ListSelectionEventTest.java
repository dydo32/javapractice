package chap15.event;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ListSelectionEventTest extends JFrame{
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	String[] subjectData = {"java","jdbc","servlet","android"
			,"spring"};
	String[] movieData = {"이클립스","활","태극기휘날리며","쉬리"
			,"트와일라잇"};

	JList<String> lstsubject = new JList<String>(subjectData);
	JComboBox<String> cbomovie = new JComboBox<String>(movieData);
	public ListSelectionEventTest(){
		super("ListSelectionEventTest테스트");
		startEvent();
		display();
		this.setSize(300, 200);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void startEvent() {
		ListSelectionEventTestListener listener = new ListSelectionEventTestListener(this);
		cbomovie.addActionListener(listener);
		lstsubject.addListSelectionListener(listener);
	}
	public void display(){
		setLayout(new GridLayout(1, 2,10,10));
		cbomovie.setSelectedItem("활");
		this.add(lstsubject);
	    
		p1.setLayout(new BorderLayout(10,10));
		p1.add(cbomovie,BorderLayout.NORTH);
		
		p2.add(text1);
		p2.add(text2);
		p1.add(p2,BorderLayout.CENTER);
		this.add(p1);
		
	}

	public static void main(String[] args) {
		ListSelectionEventTest f = new ListSelectionEventTest();
	}
}
