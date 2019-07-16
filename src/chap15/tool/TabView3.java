package chap15.tool;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TabView3 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public TabView3() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 10, 327, 51);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(354, 21, 69, 28);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(12, 78, 132, 43);
		add(btnNewButton_1);
		
		JButton button = new JButton("New button");
		button.setBounds(181, 78, 132, 43);
		add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(12, 146, 132, 43);
		add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(181, 146, 132, 43);
		add(button_2);

	}

}
