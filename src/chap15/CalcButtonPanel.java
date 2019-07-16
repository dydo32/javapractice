package chap15;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CalcButtonPanel extends JPanel{
	JButton btn1 = new JButton("+");
	JButton btn2 = new JButton("-");
	JButton btn3 = new JButton("*");
	JButton btn4 = new JButton("/");

	public CalcButtonPanel() {
		setLayout(new GridLayout(1, 4));
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		System.out.println("ºÐ¸®µÈ button Panel");
	}
}
