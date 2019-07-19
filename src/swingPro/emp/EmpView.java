package swingPro.emp;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class EmpView extends JPanel {
	public JLabel lblNamedata;
	public JLabel lblhiredatedata;
	public JLabel lbliddata;
	public JLabel lblgradedata;

	/**
	 * Create the panel.
	 */
	public EmpView() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		//panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(0, 10, 180, 153);
		add(panel);
		
		JLabel label = new JLabel("\uC131\uBA85:");
		label.setBounds(12, 10, 105, 29);
		panel.add(label);
		
		lblNamedata = new JLabel("");
		lblNamedata.setHorizontalAlignment(SwingConstants.CENTER);
		lblNamedata.setBounds(45, 10, 136, 29);
		panel.add(lblNamedata);
		
		JLabel label_2 = new JLabel("\uC785\uC0AC\uC77C:");
		label_2.setBounds(12, 48, 105, 29);
		panel.add(label_2);
		
		lblhiredatedata = new JLabel("");
		lblhiredatedata.setHorizontalAlignment(SwingConstants.CENTER);
		lblhiredatedata.setBounds(45, 48, 136, 29);
		panel.add(lblhiredatedata);
		
		JLabel label_4 = new JLabel("\uC544\uC774\uB514:");
		label_4.setBounds(12, 81, 105, 29);
		panel.add(label_4);
		
		lbliddata = new JLabel("");
		lbliddata.setHorizontalAlignment(SwingConstants.CENTER);
		lbliddata.setBounds(45, 81, 136, 29);
		panel.add(lbliddata);
		
		JLabel label_6 = new JLabel("\uB4F1\uAE09:");
		label_6.setBounds(12, 120, 105, 29);
		panel.add(label_6);
		
		lblgradedata = new JLabel("");
		lblgradedata.setHorizontalAlignment(SwingConstants.CENTER);
		lblgradedata.setBounds(45, 120, 136, 29);
		panel.add(lblgradedata);
	}
}
