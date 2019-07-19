package swingPro.emp;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class EmpTabView extends JPanel {
	public JPanel empPanel;
	public JComboBox<String> cbodeptlist;
	public JPanel deptPanel;

	/**
	 * Create the panel.
	 */
	public EmpTabView() {
		setLayout(null);
		empPanel = new JPanel();
		empPanel.setBounds(0, 72, 448, 228);
		add(empPanel);
		
		empPanel.setLayout(null);
		
		deptPanel = new JPanel();
		deptPanel.setBounds(0, 0, 450, 66);
		add(deptPanel);
		deptPanel.setLayout(null);
		
		cbodeptlist = new JComboBox<String>();
		cbodeptlist.setBounds(105, 22, 275, 34);
		deptPanel.add(cbodeptlist);
		
		JLabel lblNewLabel = new JLabel("\uBD80\uC11C\uBA85:");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblNewLabel.setBounds(46, 21, 115, 34);
		deptPanel.add(lblNewLabel);

	}
}
