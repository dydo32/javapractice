package chap14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class IOGUI extends JFrame {
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	JLabel lbtitle = new JLabel("JavaFileList");
	JList<String> lstFilelist;
	JTextArea taInfo = new JTextArea(10, 30);
	JLabel lbRoute = new JLabel("선택파일 경로:");
	JLabel lbName = new JLabel("파일복사:");
	JLabel lbSource = new JLabel("소스파일");
	JLabel lbCopy = new JLabel("복사파일");
	JTextField tfSource = new JTextField("ColorFont.java");
	JTextField tfCopy = new JTextField("Copy.java");
	JButton btnCopy = new JButton("<<복사>>");

	public IOGUI(String title) {
		super(title);
		display();
		startEvent();
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void display() {
		Container c = getContentPane();
		setLayout(new BorderLayout());
		c.add(lbtitle, BorderLayout.NORTH);

		// **********JList에 파일목록 출력하기***********
		File file = new File("src/chap14");
		String[] fileNames = file.list();
		lstFilelist = new JList<String>(fileNames);
		taInfo.setBackground(Color.LIGHT_GRAY);

		// ****************************************
		JScrollPane scroll = new JScrollPane(taInfo);
		c.add(lstFilelist, BorderLayout.WEST);
		c.add(scroll, BorderLayout.CENTER);
		
		p1.setLayout(new BorderLayout());
		p1.setBackground(Color.yellow );
		p1.add(lbRoute,BorderLayout.NORTH);	
		p1.add(p2,BorderLayout.SOUTH);	
		p2.setLayout(new FlowLayout());
		p2.setBackground(Color.yellow );
		p2.add(lbName);
		p2.add(lbSource);
		p2.add(tfSource);
		p2.add(lbCopy);
		p2.add(tfCopy);
		p2.add(btnCopy);
		
		c.add(p1,BorderLayout.SOUTH);
	}

	public void startEvent() {
		IOGUIListener listener = new IOGUIListener(this);
		lstFilelist.addListSelectionListener(listener);
	}

	public static void main(String[] args) {
		IOGUI obj = new IOGUI("GridLayout연습");
	}

}
