package swingPro.dept.view;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class DeptEmpSelectPage extends JPanel {
	
	public JComboBox<String> cbodnamelist;
	public JTable table;
	public JLabel lbl;
	public JLabel lblDeptNa;
	
	/**
	 * Create the panel.
	 */
	public DeptEmpSelectPage() {
		setLayout(null);

		lbl = new JLabel("\uC870\uC9C1\uB3C4");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lbl.setBounds(39, 21, 342, 38);
		add(lbl);

		lblDeptNa = new JLabel("\uBD80\uC11C\uBA85:");
		lblDeptNa.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblDeptNa.setBounds(35, 70, 146, 23);
		add(lblDeptNa);

		cbodnamelist = new JComboBox<String>();
		cbodnamelist.setBounds(100, 69, 281, 23);
		add(cbodnamelist);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(39, 103, 390, 169);
		
		table = new JTable();
		scroll.setViewportView(table);//JScrollPane¿¡ JTable¿¬°á
		add(scroll);
		
	}
}








