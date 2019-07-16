package chap15.event;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcResultPanel extends JPanel{
	JLabel lblres = new JLabel("RES=");
	JTextField rfres = new JTextField(20);
	
	public CalcResultPanel(){
		setLayout(new BorderLayout());
		add(lblres, BorderLayout.WEST);
		add(rfres, BorderLayout.CENTER);
		System.out.println("ºÐ¸®µÈ result Panel");
	}
}
